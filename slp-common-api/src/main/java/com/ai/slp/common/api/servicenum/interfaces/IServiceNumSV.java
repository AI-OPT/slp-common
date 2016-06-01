package com.ai.slp.common.api.servicenum.interfaces;

import com.ai.slp.common.api.servicenum.param.ServiceNum;

public interface IServiceNumSV {
	ServiceNum getServiceNumByPhone(String phone);
}
