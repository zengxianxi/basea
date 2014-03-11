package com.xianxi.basea.biz;

import com.xianxi.basea.dal.po.Organization;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

import java.util.List;

/**
 * @author zengxianxi
 * @since 12/17/13 14:55
 */
public class OrganizationManagerTest extends AbstractBizManagerTests {
    @Autowired
    private OrganizationManager manager;

    @Test
    public void testAddOrganization() throws Exception {


    }

    @Test
    public void testRemoveOrganization() throws Exception {

    }

    @Test
    public void testGetOrganization() throws Exception {

    }

    @Test
    public void testListOrganization() throws Exception {
        List<Organization> organizationList = manager.listOrganization();
        assertEquals(4, organizationList.size());
        Organization organization = organizationList.get(0);

        assertEquals("1", organization.getOrgId());
        assertEquals("北京总公司", organization.getOrgName());
        assertNull(organization.getDescription());
        assertNull(organization.getParent());
    }
}
