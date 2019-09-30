package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bs_para_info_manage")
public class BsParaInfoManage {
    @Id
    @Column(name = "bs_cgi")
    private String bsCgi;

    @Column(name = "bs_name")
    private String bsName;

    @Column(name = "bs_city")
    private String bsCity;

    @Column(name = "bs_area")
    private String bsArea;

    @Column(name = "bs_cover_type")
    private String bsCoverType;

    @Column(name = "bs_scene")
    private String bsScene;

    @Column(name = "bs_gps_lat")
    private Double bsGpsLat;

    @Column(name = "bs_gps_lng")
    private Double bsGpsLng;

    @Column(name = "bs_tac")
    private String bsTac;

    @Column(name = "bs_eci")
    private String bsEci;

    @Column(name = "bs_status")
    private String bsStatus;

    @Column(name = "bs_freq")
    private String bsFreq;

    @Column(name = "bs_pci")
    private Integer bsPci;

    @Column(name = "bs_channel")
    private Integer bsChannel;

    @Column(name = "bs_room")
    private String bsRoom;

    @Column(name = "bs_antenna")
    private String bsAntenna;

    @Column(name = "bs_athigh")
    private Double bsAthigh;

    @Column(name = "bs_height")
    private Double bsHeight;

    @Column(name = "bs_azimuth")
    private Double bsAzimuth;

    @Column(name = "bs_elec_down")
    private Double bsElecDown;

    @Column(name = "bs_mach_down")
    private Double bsMachDown;

    @Column(name = "bs_type")
    private String bsType;

    @Column(name = "bs_radius")
    private Integer bsRadius;

    @Column(name = "bs_ct_gps")
    private String bsCtGps;

    @Column(name = "bs_ct_baidu")
    private String bsCtBaidu;

    @Column(name = "bs_ct_gaode")
    private String bsCtGaode;

    @Column(name = "bs_direc_gps")
    private String bsDirecGps;

    @Column(name = "bs_direc_baidu")
    private String bsDirecBaidu;

    @Column(name = "bs_direc_gaode")
    private String bsDirecGaode;

    @Column(name = "bs_sec_gps")
    private String bsSecGps;

    @Column(name = "bs_sec_baidu")
    private String bsSecBaidu;

    @Column(name = "bs_sec_gaode")
    private String bsSecGaode;

    @Column(name = "bs_sec_area")
    private Double bsSecArea;

    private Date recdate;

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
     * @return bs_name
     */
    public String getBsName() {
        return bsName;
    }

    /**
     * @param bsName
     */
    public void setBsName(String bsName) {
        this.bsName = bsName;
    }

    /**
     * @return bs_city
     */
    public String getBsCity() {
        return bsCity;
    }

    /**
     * @param bsCity
     */
    public void setBsCity(String bsCity) {
        this.bsCity = bsCity;
    }

    /**
     * @return bs_area
     */
    public String getBsArea() {
        return bsArea;
    }

    /**
     * @param bsArea
     */
    public void setBsArea(String bsArea) {
        this.bsArea = bsArea;
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
     * @return bs_scene
     */
    public String getBsScene() {
        return bsScene;
    }

    /**
     * @param bsScene
     */
    public void setBsScene(String bsScene) {
        this.bsScene = bsScene;
    }

    /**
     * @return bs_gps_lat
     */
    public Double getBsGpsLat() {
        return bsGpsLat;
    }

    /**
     * @param bsGpsLat
     */
    public void setBsGpsLat(Double bsGpsLat) {
        this.bsGpsLat = bsGpsLat;
    }

    /**
     * @return bs_gps_lng
     */
    public Double getBsGpsLng() {
        return bsGpsLng;
    }

    /**
     * @param bsGpsLng
     */
    public void setBsGpsLng(Double bsGpsLng) {
        this.bsGpsLng = bsGpsLng;
    }

    /**
     * @return bs_tac
     */
    public String getBsTac() {
        return bsTac;
    }

    /**
     * @param bsTac
     */
    public void setBsTac(String bsTac) {
        this.bsTac = bsTac;
    }

    /**
     * @return bs_eci
     */
    public String getBsEci() {
        return bsEci;
    }

    /**
     * @param bsEci
     */
    public void setBsEci(String bsEci) {
        this.bsEci = bsEci;
    }

    /**
     * @return bs_status
     */
    public String getBsStatus() {
        return bsStatus;
    }

    /**
     * @param bsStatus
     */
    public void setBsStatus(String bsStatus) {
        this.bsStatus = bsStatus;
    }

    /**
     * @return bs_freq
     */
    public String getBsFreq() {
        return bsFreq;
    }

    /**
     * @param bsFreq
     */
    public void setBsFreq(String bsFreq) {
        this.bsFreq = bsFreq;
    }

    /**
     * @return bs_pci
     */
    public Integer getBsPci() {
        return bsPci;
    }

    /**
     * @param bsPci
     */
    public void setBsPci(Integer bsPci) {
        this.bsPci = bsPci;
    }

    /**
     * @return bs_channel
     */
    public Integer getBsChannel() {
        return bsChannel;
    }

    /**
     * @param bsChannel
     */
    public void setBsChannel(Integer bsChannel) {
        this.bsChannel = bsChannel;
    }

    /**
     * @return bs_room
     */
    public String getBsRoom() {
        return bsRoom;
    }

    /**
     * @param bsRoom
     */
    public void setBsRoom(String bsRoom) {
        this.bsRoom = bsRoom;
    }

    /**
     * @return bs_antenna
     */
    public String getBsAntenna() {
        return bsAntenna;
    }

    /**
     * @param bsAntenna
     */
    public void setBsAntenna(String bsAntenna) {
        this.bsAntenna = bsAntenna;
    }

    /**
     * @return bs_athigh
     */
    public Double getBsAthigh() {
        return bsAthigh;
    }

    /**
     * @param bsAthigh
     */
    public void setBsAthigh(Double bsAthigh) {
        this.bsAthigh = bsAthigh;
    }

    /**
     * @return bs_height
     */
    public Double getBsHeight() {
        return bsHeight;
    }

    /**
     * @param bsHeight
     */
    public void setBsHeight(Double bsHeight) {
        this.bsHeight = bsHeight;
    }

    /**
     * @return bs_azimuth
     */
    public Double getBsAzimuth() {
        return bsAzimuth;
    }

    /**
     * @param bsAzimuth
     */
    public void setBsAzimuth(Double bsAzimuth) {
        this.bsAzimuth = bsAzimuth;
    }

    /**
     * @return bs_elec_down
     */
    public Double getBsElecDown() {
        return bsElecDown;
    }

    /**
     * @param bsElecDown
     */
    public void setBsElecDown(Double bsElecDown) {
        this.bsElecDown = bsElecDown;
    }

    /**
     * @return bs_mach_down
     */
    public Double getBsMachDown() {
        return bsMachDown;
    }

    /**
     * @param bsMachDown
     */
    public void setBsMachDown(Double bsMachDown) {
        this.bsMachDown = bsMachDown;
    }

    /**
     * @return bs_type
     */
    public String getBsType() {
        return bsType;
    }

    /**
     * @param bsType
     */
    public void setBsType(String bsType) {
        this.bsType = bsType;
    }

    /**
     * @return bs_radius
     */
    public Integer getBsRadius() {
        return bsRadius;
    }

    /**
     * @param bsRadius
     */
    public void setBsRadius(Integer bsRadius) {
        this.bsRadius = bsRadius;
    }

    /**
     * @return bs_ct_gps
     */
    public String getBsCtGps() {
        return bsCtGps;
    }

    /**
     * @param bsCtGps
     */
    public void setBsCtGps(String bsCtGps) {
        this.bsCtGps = bsCtGps;
    }

    /**
     * @return bs_ct_baidu
     */
    public String getBsCtBaidu() {
        return bsCtBaidu;
    }

    /**
     * @param bsCtBaidu
     */
    public void setBsCtBaidu(String bsCtBaidu) {
        this.bsCtBaidu = bsCtBaidu;
    }

    /**
     * @return bs_ct_gaode
     */
    public String getBsCtGaode() {
        return bsCtGaode;
    }

    /**
     * @param bsCtGaode
     */
    public void setBsCtGaode(String bsCtGaode) {
        this.bsCtGaode = bsCtGaode;
    }

    /**
     * @return bs_direc_gps
     */
    public String getBsDirecGps() {
        return bsDirecGps;
    }

    /**
     * @param bsDirecGps
     */
    public void setBsDirecGps(String bsDirecGps) {
        this.bsDirecGps = bsDirecGps;
    }

    /**
     * @return bs_direc_baidu
     */
    public String getBsDirecBaidu() {
        return bsDirecBaidu;
    }

    /**
     * @param bsDirecBaidu
     */
    public void setBsDirecBaidu(String bsDirecBaidu) {
        this.bsDirecBaidu = bsDirecBaidu;
    }

    /**
     * @return bs_direc_gaode
     */
    public String getBsDirecGaode() {
        return bsDirecGaode;
    }

    /**
     * @param bsDirecGaode
     */
    public void setBsDirecGaode(String bsDirecGaode) {
        this.bsDirecGaode = bsDirecGaode;
    }

    /**
     * @return bs_sec_gps
     */
    public String getBsSecGps() {
        return bsSecGps;
    }

    /**
     * @param bsSecGps
     */
    public void setBsSecGps(String bsSecGps) {
        this.bsSecGps = bsSecGps;
    }

    /**
     * @return bs_sec_baidu
     */
    public String getBsSecBaidu() {
        return bsSecBaidu;
    }

    /**
     * @param bsSecBaidu
     */
    public void setBsSecBaidu(String bsSecBaidu) {
        this.bsSecBaidu = bsSecBaidu;
    }

    /**
     * @return bs_sec_gaode
     */
    public String getBsSecGaode() {
        return bsSecGaode;
    }

    /**
     * @param bsSecGaode
     */
    public void setBsSecGaode(String bsSecGaode) {
        this.bsSecGaode = bsSecGaode;
    }

    /**
     * @return bs_sec_area
     */
    public Double getBsSecArea() {
        return bsSecArea;
    }

    /**
     * @param bsSecArea
     */
    public void setBsSecArea(Double bsSecArea) {
        this.bsSecArea = bsSecArea;
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