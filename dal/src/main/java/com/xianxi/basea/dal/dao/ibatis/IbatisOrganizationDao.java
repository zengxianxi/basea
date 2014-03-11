package com.xianxi.basea.dal.dao.ibatis;

import com.xianxi.basea.dal.dao.OrganizationDao;
import com.xianxi.basea.dal.po.Organization;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * @author zengxianxi
 * @since 12/17/13 11:41
 */
public class IbatisOrganizationDao extends SqlMapClientDaoSupport implements OrganizationDao {
    @Override
    public void insertOrganization(Organization organization) {
        getSqlMapClientTemplate().update("insertOrganization", organization);
    }

    @Override
    public void updateOrganization(Organization organization) {
        getSqlMapClientTemplate().update("updateOrganization", organization);

    }

    @Override
    public void deleteOrganization(String orgId) {
        getSqlMapClientTemplate().update("deleteOrganization", orgId);
    }

    @Override
    public Organization getOrganization(String orgId) {
        return (Organization) getSqlMapClientTemplate().queryForObject("getOrganization", orgId);
    }

    @Override
    public List<Organization> listOrganization() {
        return getSqlMapClientTemplate().queryForList("listOrganization");
    }
}
