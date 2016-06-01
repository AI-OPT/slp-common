package com.ai.slp.common.api.ipaddr.interfaces;

import com.ai.slp.common.api.ipaddr.param.IpAddr;
/**
 * 依据IP地址查询归属地服务
 *
 * Date: 2016年6月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author gucl
 */
public interface IIpAddrSV {
	/**
	 * 依据IP地址查询归属地服务
	 * @param ip
	 * @return
	 * @author gucl
	 * @ApiDocMethod
	 * @ApiCode GN_0401
	 */
	IpAddr getIpAddrByIp(String ip);
}
