package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "g2_para_info_manage")
public class G2ParaInfoManage {
    @Id
    @Column(name = "g2_cgi")
    private String g2Cgi;

    private String arm;

    private Integer bcc;

    private Integer bcch;

    private String ci;

    @Column(name = "gprs_st_chl")
    private Integer gprsStChl;

    @Column(name = "gprs_on")
    private String gprsOn;

    private String lac;

    private String mccch;

    private Integer ncc;

    private Integer edge;

    private String tch;

    private Integer sdcch;

    private Integer pdch;

    @Column(name = "call_on")
    private String callOn;

    @Column(name = "dev_provide")
    private String devProvide;

    private String bsc;

    private String msc;

    private String channel;

    @Column(name = "g2_ch_name")
    private String g2ChName;

    @Column(name = "g2_eg_name")
    private String g2EgName;

    private Integer chnum;

    private Integer ccch;

    @Column(name = "gprs_dy_chl")
    private Integer gprsDyChl;

    @Column(name = "g2_city")
    private String g2City;

    @Column(name = "g2_azimuth")
    private Double g2Azimuth;

    @Column(name = "g2_cover_type")
    private String g2CoverType;

    @Column(name = "g2_gps_lat")
    private Double g2GpsLat;

    @Column(name = "g2_gps_lng")
    private Double g2GpsLng;

    @Column(name = "g2_area")
    private String g2Area;

    @Column(name = "g2_athigh")
    private Double g2Athigh;

    @Column(name = "g2_down")
    private Double g2Down;

    @Column(name = "road_test")
    private String roadTest;

    @Column(name = "g2_radius")
    private Integer g2Radius;

    @Column(name = "g2_ct_gps")
    private String g2CtGps;

    @Column(name = "g2_ct_baidu")
    private String g2CtBaidu;

    @Column(name = "g2_ct_gaode")
    private String g2CtGaode;

    @Column(name = "g2_direc_gps")
    private String g2DirecGps;

    @Column(name = "g2_direc_baidu")
    private String g2DirecBaidu;

    @Column(name = "g2_direc_gaode")
    private String g2DirecGaode;

    @Column(name = "g2_sec_gps")
    private String g2SecGps;

    @Column(name = "g2_sec_baidu")
    private String g2SecBaidu;

    @Column(name = "g2_sec_gaode")
    private String g2SecGaode;

    @Column(name = "g2_sec_area")
    private Double g2SecArea;

    private Date recdate;

    /**
     * @return g2_cgi
     */
    public String getG2Cgi() {
        return g2Cgi;
    }

    /**
     * @param g2Cgi
     */
    public void setG2Cgi(String g2Cgi) {
        this.g2Cgi = g2Cgi;
    }

    /**
     * @return arm
     */
    public String getArm() {
        return arm;
    }

    /**
     * @param arm
     */
    public void setArm(String arm) {
        this.arm = arm;
    }

    /**
     * @return bcc
     */
    public Integer getBcc() {
        return bcc;
    }

    /**
     * @param bcc
     */
    public void setBcc(Integer bcc) {
        this.bcc = bcc;
    }

    /**
     * @return bcch
     */
    public Integer getBcch() {
        return bcch;
    }

    /**
     * @param bcch
     */
    public void setBcch(Integer bcch) {
        this.bcch = bcch;
    }

    /**
     * @return ci
     */
    public String getCi() {
        return ci;
    }

    /**
     * @param ci
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * @return gprs_st_chl
     */
    public Integer getGprsStChl() {
        return gprsStChl;
    }

    /**
     * @param gprsStChl
     */
    public void setGprsStChl(Integer gprsStChl) {
        this.gprsStChl = gprsStChl;
    }

    /**
     * @return gprs_on
     */
    public String getGprsOn() {
        return gprsOn;
    }

    /**
     * @param gprsOn
     */
    public void setGprsOn(String gprsOn) {
        this.gprsOn = gprsOn;
    }

    /**
     * @return lac
     */
    public String getLac() {
        return lac;
    }

    /**
     * @param lac
     */
    public void setLac(String lac) {
        this.lac = lac;
    }

    /**
     * @return mccch
     */
    public String getMccch() {
        return mccch;
    }

    /**
     * @param mccch
     */
    public void setMccch(String mccch) {
        this.mccch = mccch;
    }

    /**
     * @return ncc
     */
    public Integer getNcc() {
        return ncc;
    }

    /**
     * @param ncc
     */
    public void setNcc(Integer ncc) {
        this.ncc = ncc;
    }

    /**
     * @return edge
     */
    public Integer getEdge() {
        return edge;
    }

    /**
     * @param edge
     */
    public void setEdge(Integer edge) {
        this.edge = edge;
    }

    /**
     * @return tch
     */
    public String getTch() {
        return tch;
    }

    /**
     * @param tch
     */
    public void setTch(String tch) {
        this.tch = tch;
    }

    /**
     * @return sdcch
     */
    public Integer getSdcch() {
        return sdcch;
    }

    /**
     * @param sdcch
     */
    public void setSdcch(Integer sdcch) {
        this.sdcch = sdcch;
    }

    /**
     * @return pdch
     */
    public Integer getPdch() {
        return pdch;
    }

    /**
     * @param pdch
     */
    public void setPdch(Integer pdch) {
        this.pdch = pdch;
    }

    /**
     * @return call_on
     */
    public String getCallOn() {
        return callOn;
    }

    /**
     * @param callOn
     */
    public void setCallOn(String callOn) {
        this.callOn = callOn;
    }

    /**
     * @return dev_provide
     */
    public String getDevProvide() {
        return devProvide;
    }

    /**
     * @param devProvide
     */
    public void setDevProvide(String devProvide) {
        this.devProvide = devProvide;
    }

    /**
     * @return bsc
     */
    public String getBsc() {
        return bsc;
    }

    /**
     * @param bsc
     */
    public void setBsc(String bsc) {
        this.bsc = bsc;
    }

    /**
     * @return msc
     */
    public String getMsc() {
        return msc;
    }

    /**
     * @param msc
     */
    public void setMsc(String msc) {
        this.msc = msc;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return g2_ch_name
     */
    public String getG2ChName() {
        return g2ChName;
    }

    /**
     * @param g2ChName
     */
    public void setG2ChName(String g2ChName) {
        this.g2ChName = g2ChName;
    }

    /**
     * @return g2_eg_name
     */
    public String getG2EgName() {
        return g2EgName;
    }

    /**
     * @param g2EgName
     */
    public void setG2EgName(String g2EgName) {
        this.g2EgName = g2EgName;
    }

    /**
     * @return chnum
     */
    public Integer getChnum() {
        return chnum;
    }

    /**
     * @param chnum
     */
    public void setChnum(Integer chnum) {
        this.chnum = chnum;
    }

    /**
     * @return ccch
     */
    public Integer getCcch() {
        return ccch;
    }

    /**
     * @param ccch
     */
    public void setCcch(Integer ccch) {
        this.ccch = ccch;
    }

    /**
     * @return gprs_dy_chl
     */
    public Integer getGprsDyChl() {
        return gprsDyChl;
    }

    /**
     * @param gprsDyChl
     */
    public void setGprsDyChl(Integer gprsDyChl) {
        this.gprsDyChl = gprsDyChl;
    }

    /**
     * @return g2_city
     */
    public String getG2City() {
        return g2City;
    }

    /**
     * @param g2City
     */
    public void setG2City(String g2City) {
        this.g2City = g2City;
    }

    /**
     * @return g2_azimuth
     */
    public Double getG2Azimuth() {
        return g2Azimuth;
    }

    /**
     * @param g2Azimuth
     */
    public void setG2Azimuth(Double g2Azimuth) {
        this.g2Azimuth = g2Azimuth;
    }

    /**
     * @return g2_cover_type
     */
    public String getG2CoverType() {
        return g2CoverType;
    }

    /**
     * @param g2CoverType
     */
    public void setG2CoverType(String g2CoverType) {
        this.g2CoverType = g2CoverType;
    }

    /**
     * @return g2_gps_lat
     */
    public Double getG2GpsLat() {
        return g2GpsLat;
    }

    /**
     * @param g2GpsLat
     */
    public void setG2GpsLat(Double g2GpsLat) {
        this.g2GpsLat = g2GpsLat;
    }

    /**
     * @return g2_gps_lng
     */
    public Double getG2GpsLng() {
        return g2GpsLng;
    }

    /**
     * @param g2GpsLng
     */
    public void setG2GpsLng(Double g2GpsLng) {
        this.g2GpsLng = g2GpsLng;
    }

    /**
     * @return g2_area
     */
    public String getG2Area() {
        return g2Area;
    }

    /**
     * @param g2Area
     */
    public void setG2Area(String g2Area) {
        this.g2Area = g2Area;
    }

    /**
     * @return g2_athigh
     */
    public Double getG2Athigh() {
        return g2Athigh;
    }

    /**
     * @param g2Athigh
     */
    public void setG2Athigh(Double g2Athigh) {
        this.g2Athigh = g2Athigh;
    }

    /**
     * @return g2_down
     */
    public Double getG2Down() {
        return g2Down;
    }

    /**
     * @param g2Down
     */
    public void setG2Down(Double g2Down) {
        this.g2Down = g2Down;
    }

    /**
     * @return road_test
     */
    public String getRoadTest() {
        return roadTest;
    }

    /**
     * @param roadTest
     */
    public void setRoadTest(String roadTest) {
        this.roadTest = roadTest;
    }

    /**
     * @return g2_radius
     */
    public Integer getG2Radius() {
        return g2Radius;
    }

    /**
     * @param g2Radius
     */
    public void setG2Radius(Integer g2Radius) {
        this.g2Radius = g2Radius;
    }

    /**
     * @return g2_ct_gps
     */
    public String getG2CtGps() {
        return g2CtGps;
    }

    /**
     * @param g2CtGps
     */
    public void setG2CtGps(String g2CtGps) {
        this.g2CtGps = g2CtGps;
    }

    /**
     * @return g2_ct_baidu
     */
    public String getG2CtBaidu() {
        return g2CtBaidu;
    }

    /**
     * @param g2CtBaidu
     */
    public void setG2CtBaidu(String g2CtBaidu) {
        this.g2CtBaidu = g2CtBaidu;
    }

    /**
     * @return g2_ct_gaode
     */
    public String getG2CtGaode() {
        return g2CtGaode;
    }

    /**
     * @param g2CtGaode
     */
    public void setG2CtGaode(String g2CtGaode) {
        this.g2CtGaode = g2CtGaode;
    }

    /**
     * @return g2_direc_gps
     */
    public String getG2DirecGps() {
        return g2DirecGps;
    }

    /**
     * @param g2DirecGps
     */
    public void setG2DirecGps(String g2DirecGps) {
        this.g2DirecGps = g2DirecGps;
    }

    /**
     * @return g2_direc_baidu
     */
    public String getG2DirecBaidu() {
        return g2DirecBaidu;
    }

    /**
     * @param g2DirecBaidu
     */
    public void setG2DirecBaidu(String g2DirecBaidu) {
        this.g2DirecBaidu = g2DirecBaidu;
    }

    /**
     * @return g2_direc_gaode
     */
    public String getG2DirecGaode() {
        return g2DirecGaode;
    }

    /**
     * @param g2DirecGaode
     */
    public void setG2DirecGaode(String g2DirecGaode) {
        this.g2DirecGaode = g2DirecGaode;
    }

    /**
     * @return g2_sec_gps
     */
    public String getG2SecGps() {
        return g2SecGps;
    }

    /**
     * @param g2SecGps
     */
    public void setG2SecGps(String g2SecGps) {
        this.g2SecGps = g2SecGps;
    }

    /**
     * @return g2_sec_baidu
     */
    public String getG2SecBaidu() {
        return g2SecBaidu;
    }

    /**
     * @param g2SecBaidu
     */
    public void setG2SecBaidu(String g2SecBaidu) {
        this.g2SecBaidu = g2SecBaidu;
    }

    /**
     * @return g2_sec_gaode
     */
    public String getG2SecGaode() {
        return g2SecGaode;
    }

    /**
     * @param g2SecGaode
     */
    public void setG2SecGaode(String g2SecGaode) {
        this.g2SecGaode = g2SecGaode;
    }

    /**
     * @return g2_sec_area
     */
    public Double getG2SecArea() {
        return g2SecArea;
    }

    /**
     * @param g2SecArea
     */
    public void setG2SecArea(Double g2SecArea) {
        this.g2SecArea = g2SecArea;
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