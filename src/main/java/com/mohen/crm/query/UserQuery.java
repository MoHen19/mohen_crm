package com.mohen.crm.query;

import com.mohen.base.BaseQuery;

/**
 * @author MH19
 */
public class UserQuery extends BaseQuery {
    private String userName;
    private String phone;
    private String trueName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }
}
