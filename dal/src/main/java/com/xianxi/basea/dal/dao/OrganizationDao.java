package com.xianxi.basea.dal.dao;

import com.xianxi.basea.dal.po.Organization;

import java.util.List;

/**
 * 组件数据访问对象
 *
 * @author zengxianxi
 * @since 12/17/13 0:12
 */
public interface OrganizationDao {

    /**
     * 插入组织
     *
     * @param organization
     */
    void insertOrganization(Organization organization);

    /**
     * 更新组织
     *
     * @param organization
     */
    void updateOrganization(Organization organization);

    /**
     * 删除组织
     *
     * @param orgId
     */
    void deleteOrganization(String orgId);

    /**
     * 根据组织id得到组织对象
     *
     * @param orgId
     * @return
     */
    Organization getOrganization(String orgId);


    /**
     * 得到Oraganization的列表
     *
     * @return
     */
    List<Organization> listOrganization();
}
