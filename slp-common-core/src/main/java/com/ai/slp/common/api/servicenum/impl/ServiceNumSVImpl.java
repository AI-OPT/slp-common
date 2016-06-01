package com.ai.slp.common.api.servicenum.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.slp.common.api.servicenum.interfaces.IServiceNumSV;
import com.ai.slp.common.api.servicenum.param.ServiceNum;
import com.ai.slp.common.service.business.servicenum.IServiceNumBusiSV;
import com.ai.slp.common.util.VoValidateUtils;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class ServiceNumSVImpl implements IServiceNumSV {
	@Autowired
	private IServiceNumBusiSV iServiceNumBusiSV;
	@Override
	public ServiceNum getServiceNumByPhone(String phone) {
		VoValidateUtils.validateGetServiceNumByIpPhone(phone);
		return iServiceNumBusiSV.getServiceNumByPhone(phone);
	}

}
