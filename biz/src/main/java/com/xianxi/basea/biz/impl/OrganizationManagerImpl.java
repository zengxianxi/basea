package com.xianxi.basea.biz.impl;

import com.xianxi.basea.biz.OrganizationManager;
import com.xianxi.basea.dal.dao.OrganizationDao;
import com.xianxi.basea.dal.po.Organization;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zengxianxi
 * @since 12/17/13 14:30
 */
public class OrganizationManagerImpl implements OrganizationManager {

    @Autowired
    private OrganizationDao orgDao;

    @Override
    public void addOrganization(Organization organization) {
        orgDao.insertOrganization(organization);
    }

    @Override
    public void removeOrganization(String orgId) {
        orgDao.deleteOrganization(orgId);

    }

    @Override
    public Organization getOrganization(String orgId) {
        return orgDao.getOrganization(orgId);
    }

    @Override
    public List<Organization> listOrganization() {
        return orgDao.listOrganization();
    }
}
