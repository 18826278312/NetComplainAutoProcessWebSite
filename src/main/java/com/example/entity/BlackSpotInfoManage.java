package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "black_spot_info_manage")
public class BlackSpotInfoManage {
    private String city;

    private String area;

    @Column(name = "cmp_id")
    private String cmpId;

    @Column(name = "cmp_gps_lng")
    private Double cmpGpsLng;

    @Column(name = "cmp_gps_lat")
    private Double cmpGpsLat;

    @Column(name = "bs_cgi")
    private String bsCgi;

    @Column(name = "spot_source")
    private String spotSource;

    @Column(name = "bs_cover_type")
    private String bsCoverType;

    @Column(name = "spot_type")
    private String spotType;

    @Column(name = "spot_name")
    private String spotName;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "net_type")
    private String netType;

    @Column(name = "cmp_type")
    private String cmpType;

    @Column(name = "spot_status")
    private String spotStatus;

    @Column(name = "esti_time")
    private Date estiTime;

    @Column(name = "spot_level")
    private String spotLevel;

    @Column(name = "cmp_num1")
    private Integer cmpNum1;

    @Column(name = "cmp_num2")
    private Integer cmpNum2;

    @Column(name = "cmp_scene")
    private String cmpScene;

    @Column(name = "spot_area")
    private String spotArea;

    @Column(name = "can_solve")
    private String canSolve;

    @Column(name = "solve_time")
    private Date solveTime;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "spot_reason")
    private String spotReason;

    @Column(name = "solve_way")
    private String solveWay;

    @Column(name = "is_plan")
    private String isPlan;

    @Column(name = "plan_id")
    private String planId;

    private String progress;

    @Column(name = "spot_gps")
    private String spotGps;

    @Column(name = "spot_baidu")
    private String spotBaidu;

    @Column(name = "spot_gaode")
    private String spotGaode;

    private Date recdate;

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return cmp_id
     */
    public String getCmpId() {
        return cmpId;
    }

    /**
     * @param cmpId
     */
    public void setCmpId(String cmpId) {
        this.cmpId = cmpId;
    }

    /**
     * @return cmp_gps_lng
     */
    public Double getCmpGpsLng() {
        return cmpGpsLng;
    }

    /**
     * @param cmpGpsLng
     */
    public void setCmpGpsLng(Double cmpGpsLng) {
        this.cmpGpsLng = cmpGpsLng;
    }

    /**
     * @return cmp_gps_lat
     */
    public Double getCmpGpsLat() {
        return cmpGpsLat;
    }

    /**
     * @param cmpGpsLat
     */
    public void setCmpGpsLat(Double cmpGpsLat) {
        this.cmpGpsLat = cmpGpsLat;
    }

    /**
     * @return bs_cgi
     */
    public String getBsCgi() {
        return bsCgi;
    }

    /**
     * @param bsCgi
     */
    public void setBsCgi(String bsCgi) {
        this.bsCgi = bsCgi;
    }

    /**
     * @return spot_source
     */
    public String getSpotSource() {
        return spotSource;
    }

    /**
     * @param spotSource
     */
    public void setSpotSource(String spotSource) {
        this.spotSource = spotSource;
    }

    /**
     * @return bs_cover_type
     */
    public String getBsCoverType() {
        return bsCoverType;
    }

    /**
     * @param bsCoverType
     */
    public void setBsCoverType(String bsCoverType) {
        this.bsCoverType = bsCoverType;
    }

    /**
     * @return spot_type
     */
    public String getSpotType() {
        return spotType;
    }

    /**
     * @param spotType
     */
    public void setSpotType(String spotType) {
        this.spotType = spotType;
    }

    /**
     * @return spot_name
     */
    public String getSpotName() {
        return spotName;
    }

    /**
     * @param spotName
     */
    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return net_type
     */
    public String getNetType() {
        return netType;
    }

    /**
     * @param netType
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }

    /**
     * @return cmp_type
     */
    public String getCmpType() {
        return cmpType;
    }

    /**
     * @param cmpType
     */
    public void setCmpType(String cmpType) {
        this.cmpType = cmpType;
    }

    /**
     * @return spot_status
     */
    public String getSpotStatus() {
        return spotStatus;
    }

    /**
     * @param spotStatus
     */
    public void setSpotStatus(String spotStatus) {
        this.spotStatus = spotStatus;
    }

    /**
     * @return esti_time
     */
    public Date getEstiTime() {
        return estiTime;
    }

    /**
     * @param estiTime
     */
    public void setEstiTime(Date estiTime) {
        this.estiTime = estiTime;
    }

    /**
     * @return spot_level
     */
    public String getSpotLevel() {
        return spotLevel;
    }

    /**
     * @param spotLevel
     */
    public void setSpotLevel(String spotLevel) {
        this.spotLevel = spotLevel;
    }

    /**
     * @return cmp_num1
     */
    public Integer getCmpNum1() {
        return cmpNum1;
    }

    /**
     * @param cmpNum1
     */
    public void setCmpNum1(Integer cmpNum1) {
        this.cmpNum1 = cmpNum1;
    }

    /**
     * @return cmp_num2
     */
    public Integer getCmpNum2() {
        return cmpNum2;
    }

    /**
     * @param cmpNum2
     */
    public void setCmpNum2(Integer cmpNum2) {
        this.cmpNum2 = cmpNum2;
    }

    /**
     * @return cmp_scene
     */
    public String getCmpScene() {
        return cmpScene;
    }

    /**
     * @param cmpScene
     */
    public void setCmpScene(String cmpScene) {
        this.cmpScene = cmpScene;
    }

    /**
     * @return spot_area
     */
    public String getSpotArea() {
        return spotArea;
    }

    /**
     * @param spotArea
     */
    public void setSpotArea(String spotArea) {
        this.spotArea = spotArea;
    }

    /**
     * @return can_solve
     */
    public String getCanSolve() {
        return canSolve;
    }

    /**
     * @param canSolve
     */
    public void setCanSolve(String canSolve) {
        this.canSolve = canSolve;
    }

    /**
     * @return solve_time
     */
    public Date getSolveTime() {
        return solveTime;
    }

    /**
     * @param solveTime
     */
    public void setSolveTime(Date solveTime) {
        this.solveTime = solveTime;
    }

    /**
     * @return add_time
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * @param addTime
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * @return spot_reason
     */
    public String getSpotReason() {
        return spotReason;
    }

    /**
     * @param spotReason
     */
    public void setSpotReason(String spotReason) {
        this.spotReason = spotReason;
    }

    /**
     * @return solve_way
     */
    public String getSolveWay() {
        return solveWay;
    }

    /**
     * @param solveWay
     */
    public void setSolveWay(String solveWay) {
        this.solveWay = solveWay;
    }

    /**
     * @return is_plan
     */
    public String getIsPlan() {
        return isPlan;
    }

    /**
     * @param isPlan
     */
    public void setIsPlan(String isPlan) {
        this.isPlan = isPlan;
    }

    /**
     * @return plan_id
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    /**
     * @param progress
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * @return spot_gps
     */
    public String getSpotGps() {
        return spotGps;
    }

    /**
     * @param spotGps
     */
    public void setSpotGps(String spotGps) {
        this.spotGps = spotGps;
    }

    /**
     * @return spot_baidu
     */
    public String getSpotBaidu() {
        return spotBaidu;
    }

    /**
     * @param spotBaidu
     */
    public void setSpotBaidu(String spotBaidu) {
        this.spotBaidu = spotBaidu;
    }

    /**
     * @return spot_gaode
     */
    public String getSpotGaode() {
        return spotGaode;
    }

    /**
     * @param spotGaode
     */
    public void setSpotGaode(String spotGaode) {
        this.spotGaode = spotGaode;
    }

    /**
     * @return recdate
     */
    public Date getRecdate() {
        return recdate;
    }

    /**
     * @param recdate
     */
    public void setRecdate(Date recdate) {
        this.recdate = recdate;
    }
}