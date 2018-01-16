package cn.box51.bld.mr.sort;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by wq on 2018/1/10.
 */
public class MyData implements WritableComparable<MyData> {

    private Long idx;
    private Long vle;

    public MyData() {
    }

    public int compareTo(MyData o) {
        if(this.getIdx() > o.getIdx()){
            return 1;
        }else if(this.getIdx() < o.getIdx()){
            return -1;
        }else{
            return this.getVle() >= o.getVle()? -1 : 1;
        }
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(idx);
        dataOutput.writeLong(vle);
    }

    public void readFields(DataInput dataInput) throws IOException {
        idx = dataInput.readLong();
        vle = dataInput.readLong();
    }

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public Long getVle() {
        return vle;
    }

    public void setVle(Long vle) {
        this.vle = vle;
    }

    @Override
    public String toString() {
        return this.getIdx() + "\t" +this.getVle();
    }
}
