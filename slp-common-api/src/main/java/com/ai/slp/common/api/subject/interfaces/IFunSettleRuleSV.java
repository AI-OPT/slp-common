package com.ai.slp.common.api.subject.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.common.api.subject.param.FunSettleRule;
import com.ai.slp.common.api.subject.param.SubjectIdParam;

/**
 * 销账规则查询<br>
 *
 * Date: 2015年12月4日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author lilg
 */
public interface IFunSettleRuleSV {
    /**
     * 销账资金科目使用规则查询.<br>
     * 查询租户下全部的资金科目销计费科目规则信息
     * 
     * @param param
     * @return
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode ABM_0046
     */
    public List<FunSettleRule> querySettleRule(SubjectIdParam param) throws BusinessException,SystemException;
}
