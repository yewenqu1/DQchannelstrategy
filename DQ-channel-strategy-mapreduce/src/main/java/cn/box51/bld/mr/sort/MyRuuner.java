package cn.box51.bld.mr.sort;

import cn.box51.bld.mr.group.MyGroupComparator;
import cn.box51.bld.mr.group.MyPartitioner;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.partition.HashPartitioner;

import java.io.IOException;

/**
 * Created by wq on 2018/1/10.
 */
public class MyRuuner {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Job myJob = Job.getInstance();

        myJob.setMapperClass(MyMapper.class);
        myJob.setReducerClass(MyReducer.class);

        myJob.setOutputKeyClass(MyData.class);
        myJob.setOutputValueClass(Text.class);

        myJob.setMapOutputKeyClass(LongWritable.class);
        myJob.setMapOutputValueClass(MyData.class);

        //myJob.setGroupingComparatorClass(MyGroupComparator.class);

        //设置分组规则的类
        myJob.setPartitionerClass(MyPartitioner.class);
        //该值与分组的数量一致
        myJob.setNumReduceTasks(5);

        FileInputFormat.setInputPaths(myJob,new Path("D:/text.txt"));
        FileOutputFormat.setOutputPath(myJob,new Path("D:/out"));

        System.exit(myJob.waitForCompletion(true)?0:1);

    }
}
