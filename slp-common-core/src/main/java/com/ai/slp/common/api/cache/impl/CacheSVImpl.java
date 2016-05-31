package com.ai.slp.common.api.cache.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.sdk.constants.ExceptCodeConstants;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.util.StringUtil;
import com.ai.slp.common.api.cache.interfaces.ICacheSV;
import com.ai.slp.common.api.cache.param.Area;
import com.ai.slp.common.api.cache.param.SysParam;
import com.ai.slp.common.constants.Constants;
import com.ai.slp.common.util.AreaCacheUtil;
import com.ai.slp.common.util.SysParamUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class CacheSVImpl implements ICacheSV {

    @Override
    public List<SysParam> getSysParams(String tenantId, String typeCode, String paramCode)
            throws BusinessException,SystemException {
        if (StringUtil.isBlank(tenantId)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(typeCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数类型不能为空");
        }
        if (StringUtil.isBlank(paramCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数编码不能为空");
        }
        
        List<SysParam> listParam=SysParamUtil.getSysParams(tenantId, typeCode, paramCode);
        if(CollectionUtil.isEmpty(listParam)){
        	listParam=SysParamUtil.getSysParams(Constants.TenantId.ALL_TENANT, typeCode, paramCode);
        }
        return listParam;
    }

    @Override
    public SysParam getSysParam(String tenantId, String typeCode, String paramCode,
            String columnValue) throws BusinessException,SystemException {
        if (StringUtil.isBlank(tenantId)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(typeCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数类型不能为空");
        }
        if (StringUtil.isBlank(paramCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数编码不能为空");
        }
        if (StringUtil.isBlank(columnValue)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:参数取值不能为空");
        }
        
        SysParam param=SysParamUtil.getSysParam(tenantId, typeCode, paramCode, columnValue);
        if(param==null){
        	param=SysParamUtil.getSysParam(Constants.TenantId.ALL_TENANT, typeCode, paramCode, columnValue);
        }
        
        return param;
    }



	@Override
	public String getAreaName(String areaCode)
			throws BusinessException,SystemException {
        if (StringUtil.isBlank(areaCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:区域编码不能为空");
        }
        
		return AreaCacheUtil.getAreaName( areaCode);
	}

	@Override
	public Area getArea(String areaCode)
			throws BusinessException,SystemException {
        if (StringUtil.isBlank(areaCode)) {
            throw new BusinessException(ExceptCodeConstants.Special.PARAM_IS_NULL, "获取参数失败:区域编码不能为空");
        }
        
        
		return AreaCacheUtil.getArea( areaCode);
	}


}
