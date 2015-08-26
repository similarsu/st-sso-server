package cn.st.sso.server.entity;

import java.util.Date;

import cn.st.mybatis.core.entity.BaseEntity;


public class SysDepartment extends BaseEntity {
    private Long id;// 关键字
    private String deptCode;// 单位代码
    private String deptName;// 单位名称
    private String deptSpell;// 单位拼音
    private Integer deptLevel;// 单位层次
    private String otherName;// 其他名称
    private String simpleName;// 简称
    private Integer isFormal;// 是否正式机构（0：否，1：是）
    private Date enableDate;// 启用日期
    private Integer isEnable;// 是否启用（0：否，1：是）
    private Date disableDate;// 停用日期
    private Integer isStopped;// 是否停用(0：否，1：是)
    private String originalCode;// 原机构代码
    private Date originalStoppedDate;// 原机构代码停用日期

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptSpell() {
        return deptSpell;
    }

    public void setDeptSpell(String deptSpell) {
        this.deptSpell = deptSpell;
    }

    public Integer getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Integer getIsFormal() {
        return isFormal;
    }

    public void setIsFormal(Integer isFormal) {
        this.isFormal = isFormal;
    }

    public Date getEnableDate() {
        return enableDate;
    }

    public void setEnableDate(Date enableDate) {
        this.enableDate = enableDate;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Date getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Date disableDate) {
        this.disableDate = disableDate;
    }

    public Integer getIsStopped() {
        return isStopped;
    }

    public void setIsStopped(Integer isStopped) {
        this.isStopped = isStopped;
    }

    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode;
    }

    public Date getOriginalStoppedDate() {
        return originalStoppedDate;
    }

    public void setOriginalStoppedDate(Date originalStoppedDate) {
        this.originalStoppedDate = originalStoppedDate;
    }

    @Override
    public String toString() {
        return "SysDepartment [id=" + id + ", deptCode=" + deptCode + ", deptName=" + deptName
                + ", deptSpell=" + deptSpell + ", deptLevel=" + deptLevel + ", otherName="
                + otherName + ", simpleName=" + simpleName + ", isFormal=" + isFormal
                + ", enableDate=" + enableDate + ", isEnable=" + isEnable + ", disableDate="
                + disableDate + ", isStopped=" + isStopped + ", originalCode=" + originalCode
                + ", originalStoppedDate=" + originalStoppedDate + "]";
    }



}
