package com.configx.web.model;

public class Webhook {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.app_id
     *
     * @mbggenerated
     */
    private Integer appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.content_type
     *
     * @mbggenerated
     */
    private String contentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.secret
     *
     * @mbggenerated
     */
    private String secret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column webhook.event_type
     *
     * @mbggenerated
     */
    private Integer eventType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.id
     *
     * @return the value of webhook.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.id
     *
     * @param id the value for webhook.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.app_id
     *
     * @return the value of webhook.app_id
     *
     * @mbggenerated
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.app_id
     *
     * @param appId the value for webhook.app_id
     *
     * @mbggenerated
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.name
     *
     * @return the value of webhook.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.name
     *
     * @param name the value for webhook.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.url
     *
     * @return the value of webhook.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.url
     *
     * @param url the value for webhook.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.content_type
     *
     * @return the value of webhook.content_type
     *
     * @mbggenerated
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.content_type
     *
     * @param contentType the value for webhook.content_type
     *
     * @mbggenerated
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.secret
     *
     * @return the value of webhook.secret
     *
     * @mbggenerated
     */
    public String getSecret() {
        return secret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.secret
     *
     * @param secret the value for webhook.secret
     *
     * @mbggenerated
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column webhook.event_type
     *
     * @return the value of webhook.event_type
     *
     * @mbggenerated
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column webhook.event_type
     *
     * @param eventType the value for webhook.event_type
     *
     * @mbggenerated
     */
    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }
}