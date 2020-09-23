package com.github.domian;

import java.io.Serializable;

/**
 *
 * <p>Title: Account</p>
 * <p>Description: 账户的实体类</p>
 * <p>Company: http://www.itheima.com/ </p>
 */
public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private Double money;
    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getId() {
        return id; }
    public void setId(Integer id) {
        this.id = id; }
    public Integer getUid() {
        return uid; }
    public void setUid(Integer uid) {
        this.uid = uid; }
    public Double getMoney() {
        return money; }
    public void setMoney(Double money) {
        this.money = money; }
    @Override
    public String toString() {
        return "Account [id=" + id + ", uid=" + uid + ", money=" + money + "]"; }
}