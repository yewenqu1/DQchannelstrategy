package cn.box51.bld.mr.words;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * Created by wq on 2018/1/9.
 */
public class WordCountRunner {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        Configuration conf = new Configuration();
        Job wcjob = Job.getInstance(conf);

        wcjob.setMapperClass(WordCountMapper.class);
        wcjob.setReducerClass(WordCountReducer.class);

        wcjob.setMapOutputKeyClass(Text.class);
        wcjob.setMapOutputValueClass(IntWritable.class);

        wcjob.setOutputKeyClass(Text.class);
        wcjob.setOutputValueClass(IntWritable.class);

        FileInputFormat.setInputPaths(wcjob,new Path("D:/text.txt"));
        FileOutputFormat.setOutputPath(wcjob,new Path("D:/out"));

        System.exit(wcjob.waitForCompletion(true)?0:1);;

    }

}
