package cn.box51.bld.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by wq on 2018/1/16.
 */

@ActiveProfiles("deve")
@ContextConfiguration(locations = {"classpath:spring-config-test.xml"})
public class Connection extends AbstractJUnit4SpringContextTests{

    @Autowired
    BasicDataSource dataSource;

    @Test
    public void test(){
      System.out.println(dataSource.getUrl());
  }

}
