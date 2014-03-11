package com.xianxi.basea.dal.dao;

import com.xianxi.basea.dal.po.Organization;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author zengxianxi
 * @since 12/17/13 11:54
 */
public class OrganizationDaoTest extends AbstractDataAccessTests {

    @Autowired
    private OrganizationDao orgDao;

    @Test
    public void testInsertOrganization() throws Exception {
        Organization organization = new Organization();
        organization.setOrgId("101");
        organization.setOrgName("test");
        organization.setDescription("描述信息");

        orgDao.insertOrganization(organization);
    }

    @Test
    public void testUpdateOrganization() throws Exception {
        Organization organization = new Organization();
        organization.setOrgId("4");
        organization.setOrgName("test");
        organization.setDescription("描述信息");

        orgDao.updateOrganization(organization);

    }

    @Test
    public void testDeleteOrganization() throws Exception {
        orgDao.deleteOrganization("4");

    }

    @Test
    public void testGetOrganization() throws Exception {
        Organization org = orgDao.getOrganization("2");

        assertEquals("河北分公司", org.getOrgName());
        assertNull(org.getDescription());
        assertEquals("1", org.getParentOrg().getOrgId());

    }
}
