package cn.st.sso.server.mybatis.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.st.mybatis.core.support.Pager;
import cn.st.sso.server.BaseTest;
import cn.st.sso.server.entity.SysDepartment;
import cn.st.sso.server.service.SysDepartmentService;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月4日
 */
public class SysDepartmentServiceTest extends BaseTest {
    @Autowired
    private SysDepartmentService sysDepartmentService;

    @Test
    public void load() {
        SysDepartment sysDepartment = sysDepartmentService.load(1l);
        System.out.println(sysDepartment);
    }

    @Test
    public void add() {
        SysDepartment sysDepartment = new SysDepartment();
        sysDepartmentService.add(sysDepartment);
    }

    @Test
    public void findAll() {
        List<SysDepartment> sysDepartmentList = sysDepartmentService.findAll(null);
        for (SysDepartment u : sysDepartmentList) {
            System.out.println(u);
        }
    }

    @Test
    public void findPage() {
        Pager<SysDepartment> pager = new Pager<SysDepartment>(44, 50);
        SysDepartment sysDepartment = new SysDepartment();
        sysDepartment.setOrderStr("dept_code desc");
        sysDepartment.setPager(pager);
        pager = sysDepartmentService.findPage(sysDepartment);
        List<SysDepartment> sysDepartmentList = pager.getList();
        for (SysDepartment u : sysDepartmentList) {
            System.out.println(u);
        }

        System.out.println("当前页：" + pager.getPageNo() + "/" + pager.getTotalPage() + ",共"
                + pager.getTotalCount() + "条");

    }

}
