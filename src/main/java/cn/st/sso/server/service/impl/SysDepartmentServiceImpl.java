package cn.st.sso.server.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.st.mybatis.core.service.impl.BaseServiceImpl;
import cn.st.sso.server.entity.SysDepartment;
import cn.st.sso.server.mapper.SysDepartmentMapper;
import cn.st.sso.server.service.SysDepartmentService;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月4日
 */
@Service("sysDepartmentService")
public class SysDepartmentServiceImpl extends BaseServiceImpl<SysDepartment> implements
        SysDepartmentService {
    @Autowired
    private SysDepartmentMapper sysDepartmentMapper;

    @PostConstruct
    public void injectBaseMapper() {
        // TODO Auto-generated method stub
        super.injectBaseMapper(sysDepartmentMapper);
    }



}
