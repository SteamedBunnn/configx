package com.configx.web.model;

import java.util.Date;

public class ReleaseForm {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.release_id
     *
     * @mbggenerated
     */
    private Long releaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.app_id
     *
     * @mbggenerated
     */
    private Integer appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.app_name
     *
     * @mbggenerated
     */
    private String appName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.env_id
     *
     * @mbggenerated
     */
    private Integer envId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.env_name
     *
     * @mbggenerated
     */
    private String envName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.plan_pub_time
     *
     * @mbggenerated
     */
    private Date planPubTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.updater
     *
     * @mbggenerated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.auditor
     *
     * @mbggenerated
     */
    private String auditor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.audit_status
     *
     * @mbggenerated
     */
    private Byte auditStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release_form.audit_time
     *
     * @mbggenerated
     */
    private Date auditTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.id
     *
     * @return the value of release_form.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.id
     *
     * @param id the value for release_form.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.release_id
     *
     * @return the value of release_form.release_id
     *
     * @mbggenerated
     */
    public Long getReleaseId() {
        return releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.release_id
     *
     * @param releaseId the value for release_form.release_id
     *
     * @mbggenerated
     */
    public void setReleaseId(Long releaseId) {
        this.releaseId = releaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.app_id
     *
     * @return the value of release_form.app_id
     *
     * @mbggenerated
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.app_id
     *
     * @param appId the value for release_form.app_id
     *
     * @mbggenerated
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.app_name
     *
     * @return the value of release_form.app_name
     *
     * @mbggenerated
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.app_name
     *
     * @param appName the value for release_form.app_name
     *
     * @mbggenerated
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.env_id
     *
     * @return the value of release_form.env_id
     *
     * @mbggenerated
     */
    public Integer getEnvId() {
        return envId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.env_id
     *
     * @param envId the value for release_form.env_id
     *
     * @mbggenerated
     */
    public void setEnvId(Integer envId) {
        this.envId = envId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.env_name
     *
     * @return the value of release_form.env_name
     *
     * @mbggenerated
     */
    public String getEnvName() {
        return envName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.env_name
     *
     * @param envName the value for release_form.env_name
     *
     * @mbggenerated
     */
    public void setEnvName(String envName) {
        this.envName = envName == null ? null : envName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.name
     *
     * @return the value of release_form.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.name
     *
     * @param name the value for release_form.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.remark
     *
     * @return the value of release_form.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.remark
     *
     * @param remark the value for release_form.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.plan_pub_time
     *
     * @return the value of release_form.plan_pub_time
     *
     * @mbggenerated
     */
    public Date getPlanPubTime() {
        return planPubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.plan_pub_time
     *
     * @param planPubTime the value for release_form.plan_pub_time
     *
     * @mbggenerated
     */
    public void setPlanPubTime(Date planPubTime) {
        this.planPubTime = planPubTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.creator
     *
     * @return the value of release_form.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.creator
     *
     * @param creator the value for release_form.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.create_time
     *
     * @return the value of release_form.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.create_time
     *
     * @param createTime the value for release_form.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.updater
     *
     * @return the value of release_form.updater
     *
     * @mbggenerated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.updater
     *
     * @param updater the value for release_form.updater
     *
     * @mbggenerated
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.update_time
     *
     * @return the value of release_form.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.update_time
     *
     * @param updateTime the value for release_form.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.auditor
     *
     * @return the value of release_form.auditor
     *
     * @mbggenerated
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.auditor
     *
     * @param auditor the value for release_form.auditor
     *
     * @mbggenerated
     */
    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.audit_status
     *
     * @return the value of release_form.audit_status
     *
     * @mbggenerated
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.audit_status
     *
     * @param auditStatus the value for release_form.audit_status
     *
     * @mbggenerated
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release_form.audit_time
     *
     * @return the value of release_form.audit_time
     *
     * @mbggenerated
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release_form.audit_time
     *
     * @param auditTime the value for release_form.audit_time
     *
     * @mbggenerated
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}