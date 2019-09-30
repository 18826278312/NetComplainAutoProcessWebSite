package com.example.entity;

import java.util.Date;
import javax.persistence.*;

public class Ticket {
    @Id
    private Integer id;

    @Column(name = "ticket_sid")
    private String ticketSid;

    private Byte statu;

    private String telephone;

    private String lat;

    private String lng;

    @Column(name = "address_short")
    private String addressShort;

    @Column(name = "address_long")
    private String addressLong;

    @Column(name = "place_type")
    private Integer placeType;

    @Column(name = "problem_id")
    private Integer problemId;

    /**
     * 评价-服务评分
     */
    @Column(name = "star_service")
    private Byte starService;

    /**
     * 废弃字段
     */
    @Column(name = "star_staff")
    private Byte starStaff;

    @Column(name = "submit_time")
    private Date submitTime;

    @Column(name = "end_time")
    private Date endTime;

    private String authphone;

    private String token;

    @Column(name = "address_detail")
    private String addressDetail;

    private String accept;

    private Boolean alert;

    @Column(name = "alert_time")
    private Date alertTime;

    private Boolean assign;

    /**
     * 评价-是否解决，0：未评；1：已解决，2：未解决
     */
    @Column(name = "star_solved")
    private Byte starSolved;

    @Column(name = "address_detail2")
    private String addressDetail2;

    @Column(name = "allow_inspection")
    private Byte allowInspection;

    @Column(name = "inspection_data")
    private Date inspectionData;

    @Column(name = "inspection_time")
    private Byte inspectionTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return ticket_sid
     */
    public String getTicketSid() {
        return ticketSid;
    }

    /**
     * @param ticketSid
     */
    public void setTicketSid(String ticketSid) {
        this.ticketSid = ticketSid;
    }

    /**
     * @return statu
     */
    public Byte getStatu() {
        return statu;
    }

    /**
     * @param statu
     */
    public void setStatu(Byte statu) {
        this.statu = statu;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * @return address_short
     */
    public String getAddressShort() {
        return addressShort;
    }

    /**
     * @param addressShort
     */
    public void setAddressShort(String addressShort) {
        this.addressShort = addressShort;
    }

    /**
     * @return address_long
     */
    public String getAddressLong() {
        return addressLong;
    }

    /**
     * @param addressLong
     */
    public void setAddressLong(String addressLong) {
        this.addressLong = addressLong;
    }

    /**
     * @return place_type
     */
    public Integer getPlaceType() {
        return placeType;
    }

    /**
     * @param placeType
     */
    public void setPlaceType(Integer placeType) {
        this.placeType = placeType;
    }

    /**
     * @return problem_id
     */
    public Integer getProblemId() {
        return problemId;
    }

    /**
     * @param problemId
     */
    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    /**
     * 获取评价-服务评分
     *
     * @return star_service - 评价-服务评分
     */
    public Byte getStarService() {
        return starService;
    }

    /**
     * 设置评价-服务评分
     *
     * @param starService 评价-服务评分
     */
    public void setStarService(Byte starService) {
        this.starService = starService;
    }

    /**
     * 获取废弃字段
     *
     * @return star_staff - 废弃字段
     */
    public Byte getStarStaff() {
        return starStaff;
    }

    /**
     * 设置废弃字段
     *
     * @param starStaff 废弃字段
     */
    public void setStarStaff(Byte starStaff) {
        this.starStaff = starStaff;
    }

    /**
     * @return submit_time
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * @param submitTime
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return authphone
     */
    public String getAuthphone() {
        return authphone;
    }

    /**
     * @param authphone
     */
    public void setAuthphone(String authphone) {
        this.authphone = authphone;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return address_detail
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * @param addressDetail
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * @return accept
     */
    public String getAccept() {
        return accept;
    }

    /**
     * @param accept
     */
    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    /**
     * @param alert
     */
    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    /**
     * @return alert_time
     */
    public Date getAlertTime() {
        return alertTime;
    }

    /**
     * @param alertTime
     */
    public void setAlertTime(Date alertTime) {
        this.alertTime = alertTime;
    }

    /**
     * @return assign
     */
    public Boolean getAssign() {
        return assign;
    }

    /**
     * @param assign
     */
    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    /**
     * 获取评价-是否解决，0：未评；1：已解决，2：未解决
     *
     * @return star_solved - 评价-是否解决，0：未评；1：已解决，2：未解决
     */
    public Byte getStarSolved() {
        return starSolved;
    }

    /**
     * 设置评价-是否解决，0：未评；1：已解决，2：未解决
     *
     * @param starSolved 评价-是否解决，0：未评；1：已解决，2：未解决
     */
    public void setStarSolved(Byte starSolved) {
        this.starSolved = starSolved;
    }

    /**
     * @return address_detail2
     */
    public String getAddressDetail2() {
        return addressDetail2;
    }

    /**
     * @param addressDetail2
     */
    public void setAddressDetail2(String addressDetail2) {
        this.addressDetail2 = addressDetail2;
    }

    /**
     * @return allow_inspection
     */
    public Byte getAllowInspection() {
        return allowInspection;
    }

    /**
     * @param allowInspection
     */
    public void setAllowInspection(Byte allowInspection) {
        this.allowInspection = allowInspection;
    }

    /**
     * @return inspection_data
     */
    public Date getInspectionData() {
        return inspectionData;
    }

    /**
     * @param inspectionData
     */
    public void setInspectionData(Date inspectionData) {
        this.inspectionData = inspectionData;
    }

    /**
     * @return inspection_time
     */
    public Byte getInspectionTime() {
        return inspectionTime;
    }

    /**
     * @param inspectionTime
     */
    public void setInspectionTime(Byte inspectionTime) {
        this.inspectionTime = inspectionTime;
    }
}