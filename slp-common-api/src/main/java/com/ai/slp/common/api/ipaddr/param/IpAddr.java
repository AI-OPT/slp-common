package com.ai.slp.common.api.ipaddr.param;

/**
 * IpAddr
 *
 * Date: 2016年6月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author gucl
 */
public class IpAddr {
	/**
	 * 序号
	 */
    private String orderNo;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 基础运营商编码
     */
    private String basicOrgId;

    /**
     * 基础运营商名称
     */
    private String basicOrgName;

    /**
     * ip地址
     */
    private String ipAddrCode;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getBasicOrgId() {
        return basicOrgId;
    }

    public void setBasicOrgId(String basicOrgId) {
        this.basicOrgId = basicOrgId == null ? null : basicOrgId.trim();
    }

    public String getBasicOrgName() {
        return basicOrgName;
    }

    public void setBasicOrgName(String basicOrgName) {
        this.basicOrgName = basicOrgName == null ? null : basicOrgName.trim();
    }

    public String getIpAddrCode() {
        return ipAddrCode;
    }

    public void setIpAddrCode(String ipAddrCode) {
        this.ipAddrCode = ipAddrCode == null ? null : ipAddrCode.trim();
    }
}