package cn.box51.bld.mr.sort;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by wq on 2018/1/10.
 */
public class MyReducer extends Reducer<LongWritable,MyData,MyData,Text> {
    @Override
    protected void reduce(LongWritable key, Iterable<MyData> values, Context context) throws IOException, InterruptedException {

        super.reduce(key, values, context);
    }
}
