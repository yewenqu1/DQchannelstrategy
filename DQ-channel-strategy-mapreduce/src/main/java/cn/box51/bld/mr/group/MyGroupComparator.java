package cn.box51.bld.mr.group;

import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparator;

/**
 * Created by wq on 2018/1/10.
 */
public class MyGroupComparator implements RawComparator<MyGroupComparator> {

    /**
     * b1 表示第一个参与比较的字节数组
     * s1 表示第一个字节数组中开始比较的位置
     * l1 表示第一个字节数组中参与比较的字节长度
     * b2 表示第二个参与比较的字节数组
     * s2 表示第二个字节数组中开始比较的位置
     * l2 表示第二个字节数组参与比较的字节长度
     */
    public int compare(byte[] bytes, int i, int i1, byte[] bytes1, int i2, int i3) {
        return WritableComparator.compareBytes(bytes,i,i1,bytes1,i2,i3);
    }

    public int compare(MyGroupComparator o1, MyGroupComparator o2) {
        return 0;
    }
}
