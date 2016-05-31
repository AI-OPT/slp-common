package com.ai.slp.common.dao.mapper.bo;

public class GnIpAddr {
    private String orderNo;

    private String provinceCode;

    private String provinceName;

    private String cityCode;

    private String cityName;

    private String basicOrgId;

    private String basicOrgName;

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