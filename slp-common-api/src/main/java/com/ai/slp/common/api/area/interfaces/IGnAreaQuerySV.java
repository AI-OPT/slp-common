package com.ai.slp.common.api.area.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.common.api.area.param.GnAreaCodeCondition;
import com.ai.slp.common.api.area.param.GnAreaCondition;
import com.ai.slp.common.api.area.param.GnAreaPageCondition;
import com.ai.slp.common.api.area.param.GnAreaPageFilterCondition;
import com.ai.slp.common.api.area.param.GnAreaVo;

/**
 * 区域查询服务<br>
 * Date: 2016年5月30日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author gucl
 */
public interface IGnAreaQuerySV {

    /**
     * 根据区域编码获取详细信息.
     * <p/>
     * 根据传入的区域ID来查询详情,如果传入的区域ID为空，则抛出异常.
     *
     * @param condition
     * @return
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0101
     */
    GnAreaVo selectByID(GnAreaCondition condition) throws BusinessException,SystemException;
    
    
    /**
     * 根据地域编码获取地域信息
     * @param areaCode 地域编码
     * @return 地域信息
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0102
     */
    GnAreaVo queryGnArea(String areaCode) throws BusinessException,SystemException;
    
    
    /**
     * 获取所有的省份列表.
     *
     * @return 所有省份列表
     * @throws BusinessException,SystemException
     * @ApiDocMethod
     * @ApiCode GN_0103
     */
    List<GnAreaVo> getProvinceList() throws BusinessException,SystemException;
    
    /**
     * 根据小区编码获取对应的所有上级区域列表
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0104
     */
    List<GnAreaVo> getParentAreaListByAreaCode(GnAreaCodeCondition condition) throws BusinessException,SystemException;
    
    /**
     * 根据省份code，查找所有的城市列表
     * @param provinceCode 省份code
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0105
     */
    List<GnAreaVo> getCityListByProviceCode(String provinceCode) throws BusinessException,SystemException;
    /**
     * 根据城市code，查找所有的区县列表
     * @param cityCode 城市code
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0106
     */
    List<GnAreaVo> getCountyListByCityCode(String cityCode) throws BusinessException,SystemException;
    /**
     * 根据区县code，查找所有的街道列表
     * @param countyCode 区县code
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0107
     */
    List<GnAreaVo> getStreetListByCountyCode(String countyCode) throws BusinessException,SystemException;
    
    /**
     * 分页查询
     * @param areaPage
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0109
     */
    PageInfo<GnAreaVo> getAreaListByPage(GnAreaPageCondition areaPage) throws BusinessException,SystemException;
    
    /**
     * 获取全国列表
     * @return
     * @throws BusinessException,SystemException
     * @author gaogang
     * @ApiDocMethod
     * @ApiCode GN_0110
     */
    List<GnAreaVo> getNationList() throws BusinessException,SystemException;
    
    /**
     * 小区（街道下的小区）分页查询(可过滤指定areacodeList)
     * @param areaPage
     * @return
     * @throws BusinessException,SystemException
     * @author jiaxs
     * @ApiDocMethod
     * @ApiCode GN_0111
     */
    PageInfo<GnAreaVo> getFilterAreaListByPage(GnAreaPageFilterCondition areaPage) throws BusinessException,SystemException;
    /**
     * 根据省份名称、级别查询数据
     * @param condition
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhanglh
     * @ApiCode
     */
    List<GnAreaVo> getAreaByName(GnAreaCondition condition) throws BusinessException,SystemException;
}
