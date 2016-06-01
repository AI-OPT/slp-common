package com.ai.slp.common.service.atom.servicenum;

import com.ai.slp.common.dao.mapper.bo.GnServiceNum;

public interface IServiceNumAtomSV {
	GnServiceNum getServiceNumByPhone(String phone);
}
