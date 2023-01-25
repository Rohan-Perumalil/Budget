package com.budget.model;

import jakarta.persistence.*;

@Entity
@Table(name="TBL_USER")
public class User {
    public String userid;
    public String pswd;

    private Long id;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }



    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", pswd='" + pswd + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
}
