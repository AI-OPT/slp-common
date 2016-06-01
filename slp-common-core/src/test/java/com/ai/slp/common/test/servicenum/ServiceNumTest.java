package com.ai.slp.common.test.servicenum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.slp.common.api.servicenum.interfaces.IServiceNumSV;
import com.ai.slp.common.api.servicenum.param.ServiceNum;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class ServiceNumTest {
	@Autowired
	private IServiceNumSV sv;

	@Test
	public void testGetServiceNum(){
		String phone="1300000";
		ServiceNum result=sv.getServiceNumByPhone(phone);
		System.out.println("result="+JSON.toJSONString(result));
	}
    
    
}