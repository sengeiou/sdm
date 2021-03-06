package com.sdm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private Date createtime;

    private Date updatetime;

    private String nickname;

    private String mobile;

    private Integer emailstatus;

    private Integer mobilestatus;

    private String headerurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getEmailstatus() {
        return emailstatus;
    }

    public void setEmailstatus(Integer emailstatus) {
        this.emailstatus = emailstatus;
    }

    public Integer getMobilestatus() {
        return mobilestatus;
    }

    public void setMobilestatus(Integer mobilestatus) {
        this.mobilestatus = mobilestatus;
    }

    public String getHeaderurl() {
        return headerurl;
    }

    public void setHeaderurl(String headerurl) {
        this.headerurl = headerurl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", nickname='" + nickname + '\'' +
                ", mobile='" + mobile + '\'' +
                ", emailstatus=" + emailstatus +
                ", mobilestatus=" + mobilestatus +
                ", headerurl='" + headerurl + '\'' +
                '}';
    }
}