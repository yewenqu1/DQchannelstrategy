package cn.box51.bld.dao;

import cn.box51.bld.entity.PUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户数据获取
 * Created by wq on 2018/2/11.
 */
@Repository
public interface UserDAO extends JpaRepository<PUser,Long>{

}
