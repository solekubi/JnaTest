package com.zt.entity;

/**
 * Created by sole on 2017/7/17 0017.
 */
public class CardInfo {

    //姓名
    private String infoName;

    //性别
    private String infoSex;

    //民族
    private String infoNation;

    //出生日期
    private String infoBirthDay;

    //地址
    private String infoAddress;

    //身份证号
    private String infoID;

    //发证机关
    private String infoDepart;

    //有效日期
    private String infoValid;

    //照片绝对路径
    private String infoPICPath;

    public CardInfo() {
    }

    public CardInfo(String infoName, String infoSex, String infoNation, String infoBirthDay, String infoAddress, String infoID, String infoDepart, String infoValid, String infoPICPath) {
        this.infoName = infoName;
        this.infoSex = infoSex;
        this.infoNation = infoNation;
        this.infoBirthDay = infoBirthDay;
        this.infoAddress = infoAddress;
        this.infoID = infoID;
        this.infoDepart = infoDepart;
        this.infoValid = infoValid;
        this.infoPICPath = infoPICPath;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getInfoSex() {
        return infoSex;
    }

    public void setInfoSex(String infoSex) {
        this.infoSex = infoSex;
    }

    public String getInfoNation() {
        return infoNation;
    }

    public void setInfoNation(String infoNation) {
        this.infoNation = infoNation;
    }

    public String getInfoBirthDay() {
        return infoBirthDay;
    }

    public void setInfoBirthDay(String infoBirthDay) {
        this.infoBirthDay = infoBirthDay;
    }

    public String getInfoAddress() {
        return infoAddress;
    }

    public void setInfoAddress(String infoAddress) {
        this.infoAddress = infoAddress;
    }

    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public String getInfoDepart() {
        return infoDepart;
    }

    public void setInfoDepart(String infoDepart) {
        this.infoDepart = infoDepart;
    }

    public String getInfoValid() {
        return infoValid;
    }

    public void setInfoValid(String infoValid) {
        this.infoValid = infoValid;
    }

    public String getInfoPICPath() {
        return infoPICPath;
    }

    public void setInfoPICPath(String infoPICPath) {
        this.infoPICPath = infoPICPath;
    }

    @Override
    public String toString() {
        return "CardInfo{" +
                "infoName='" + infoName + '\'' +
                ", infoSex='" + infoSex + '\'' +
                ", infoNation='" + infoNation + '\'' +
                ", infoBirthDay='" + infoBirthDay + '\'' +
                ", infoAddress='" + infoAddress + '\'' +
                ", infoID='" + infoID + '\'' +
                ", infoDepart='" + infoDepart + '\'' +
                ", infoValid='" + infoValid + '\'' +
                ", infoPICPath='" + infoPICPath + '\'' +
                '}';
    }
}
