package cn.box51.bld.mr.group;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Partitioner;

import java.util.HashMap;

/**
 * Created by wq on 2018/1/10.
 */
public class MyPartitioner<KEY ,VALUE> extends Partitioner<KEY ,VALUE> {


    private static HashMap<String , Integer> m = new HashMap<String, Integer>();

    static {
        m.put("1",0);
        m.put("2",1);
        m.put("3",2);
    }

    public int getPartition(KEY key, VALUE value, int i) {
        LongWritable partValue = (LongWritable) key;
        int a = m.get(partValue.toString()) == null ? 3 : m.get(partValue.toString());
        return a;
    }
}
