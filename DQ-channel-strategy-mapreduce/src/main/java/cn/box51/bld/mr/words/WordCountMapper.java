package cn.box51.bld.mr.words;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by wq on 2018/1/9.
 */
public class WordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

    int count = 0;

    public void map(Object key,Text value,Context context){
            String word = value.toString();

            String[] words = word.split(" ");

            for(String s : words){
                try {
                    context.write(new Text(s),new IntWritable(1));
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

}
