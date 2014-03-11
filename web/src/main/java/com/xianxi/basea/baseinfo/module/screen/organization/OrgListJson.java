package com.xianxi.basea.baseinfo.module.screen.organization;

import com.alibaba.citrus.service.pipeline.PipelineContext;
import com.alibaba.citrus.turbine.Context;
import com.xianxi.basea.biz.OrganizationManager;
import com.xianxi.basea.dal.po.Organization;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zengxianxi
 * @since 12/17/13 18:36
 */
public class OrgListJson {

    @Autowired
    private OrganizationManager organizationManager;

    public List<Organization> execute(Context context) {
        List<Organization> organizationList = organizationManager.listOrganization();
        return organizationList;
    }
}
