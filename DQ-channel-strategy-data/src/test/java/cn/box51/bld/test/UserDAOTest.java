package cn.box51.bld.test;

import cn.box51.bld.dao.UserDAO;
import cn.box51.bld.entity.PUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by wq on 2018/2/12.
 */
@ActiveProfiles("test")
@ContextConfiguration(locations = {"classpath:spring-config-test.xml"})
public class UserDAOTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserDAO userDAO;

    @Test
    public  void i(){
        PUser pUser = new PUser();
        pUser.setName("ywq");
        pUser.setSexy("1");
        userDAO.save(pUser);
    }

}
