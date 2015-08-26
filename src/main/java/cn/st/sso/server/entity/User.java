package cn.st.sso.server.entity;

import cn.st.mybatis.core.entity.BaseEntity;
import cn.st.sso.server.soa.view.DataView;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月3日
 */
public class User extends BaseEntity {
    private Long id;
    @JsonView(DataView.class)
    private String loginName;
    private String password;
    @JsonView(DataView.class)
    private String chineseName;
    @JsonView(DataView.class)
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", loginName=" + loginName + ", password=" + password
                + ", chineseName=" + chineseName + ", phoneNumber=" + phoneNumber + "]";
    }



}
