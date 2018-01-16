package cn.box51.bld.mr.sort;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by wq on 2018/1/10.
 */
public class MyMapper extends Mapper<LongWritable, Text, LongWritable, MyData> {

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        MyData myData = new MyData();
        StringTokenizer tokenizer = new StringTokenizer(value.toString());

        if(tokenizer.hasMoreElements()){
            myData.setIdx(Long.parseLong(tokenizer.nextToken()));
        }
        if(tokenizer.hasMoreElements()){
            myData.setVle(Long.parseLong(tokenizer.nextToken()));
        }
        context.write(new LongWritable(myData.getIdx()),myData);
    }

}
