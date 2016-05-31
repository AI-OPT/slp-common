package com.ai.slp.common.api.subjectmaintain.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.PageInfo;
import com.ai.slp.common.api.subjectmaintain.param.GnSubjectCondition;
import com.ai.slp.common.api.subjectmaintain.param.GnSubjectFundVo;
import com.ai.slp.common.api.subjectmaintain.param.GnSubjectKeyParam;
import com.ai.slp.common.api.subjectmaintain.param.GnSubjectVo;

public interface IGnSubjectMaintainSV {

    /**
     * 科目ID，类型，名称－多条件分页查询
     * 
     * @param condition
     * @return
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    PageInfo<GnSubjectVo> querySubejct(GnSubjectCondition condition) throws BusinessException,SystemException;

    /**
     * 行业、租户、科目ID－主键查询
     * 
     * @return
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    GnSubjectVo querySubject(GnSubjectKeyParam key) throws BusinessException,SystemException;

    /**
     * 增加科目
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void addSubject(GnSubjectVo vo) throws BusinessException,SystemException;

    /**
     * 删除科目
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void deleteSubject(GnSubjectKeyParam key) throws BusinessException,SystemException;

    /**
     * 修改科目
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void modifySubject(GnSubjectVo vo) throws BusinessException,SystemException;

    /**
     * 
     * @param key
     * @return
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    GnSubjectFundVo querySubjectFund(GnSubjectKeyParam key) throws BusinessException,SystemException;

    /**
     * 增加科目资金属性
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void addSubjectFund(GnSubjectFundVo vo) throws BusinessException,SystemException;

    /**
     * 删除科目资金属性
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void deleteSubjectFund(GnSubjectKeyParam key) throws BusinessException,SystemException;

    /**
     * 修改科目资金属性
     * 
     * @param vo
     * @throws BusinessException,SystemException
     * @author lilg
     * @ApiDocMethod
     * @ApiCode
     */
    void modifySubjectFund(GnSubjectFundVo vo) throws BusinessException,SystemException;
}
