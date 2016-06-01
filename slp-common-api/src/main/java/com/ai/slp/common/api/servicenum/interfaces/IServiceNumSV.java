package com.ai.slp.common.api.servicenum.interfaces;

import com.ai.slp.common.api.servicenum.param.ServiceNum;
/**
 * 手机号码段服务
 *
 * Date: 2016年6月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author gucl
 */
public interface IServiceNumSV {
	/**
	 * 根据手机号码查询归属地和运营商
	 * @param phone
	 * @return
	 * @author gucl
	 * @ApiDocMethod
	 * @ApiCode GN_0501
	 */
	ServiceNum getServiceNumByPhone(String phone);
}
