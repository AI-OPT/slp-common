package com.ai.slp.common.api.tenant.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.common.api.tenant.param.GnTenantConditon;
import com.ai.slp.common.api.tenant.param.GnTenantVo;

/**
 * 租户查询<br>
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author zhanglh
 */
public interface IGnTenantQuerySV {
	/**
	 * 获取单个租户信息
	 * @param gnTennatConditon 租户ID必填
	 * @return 租户信息
	 * @throws BusinessException,SystemException
	 * @author zhanglh
	 * @ApiCode GN_0335
	 */
	GnTenantVo getTenant(GnTenantConditon gnTennatConditon) throws BusinessException,SystemException;

	/**
	 * 查询所有租户信息
	 * @return 所有租户信息
	 * @throws BusinessException,SystemException
	 * @author zhanglh
	 * @ApiCode GN_0336
	 */
	List<GnTenantVo> getTenants() throws BusinessException,SystemException;

}
