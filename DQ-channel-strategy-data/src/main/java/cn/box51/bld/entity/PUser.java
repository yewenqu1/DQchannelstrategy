package cn.box51.bld.entity;

import cn.box51.bld.dao.AbstractEntity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

/**
 * Created by wq on 2018/2/11.
 */
@Entity
@Table(name = "user")
public class PUser extends AbstractEntity {

    @Column(name="name",nullable = false)
    private String name;
    @Column(name = "sexy")
    private String sexy;
    @Column(name = "contact" )
    private String contact;
    @Column(name="email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}