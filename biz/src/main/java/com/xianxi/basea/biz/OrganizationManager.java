package com.xianxi.basea.biz;

import com.xianxi.basea.dal.po.Organization;

import java.util.List;

/**
 * 组织管理的相关业务逻辑
 *
 * @author zengxianxi
 * @since 12/17/13 14:02
 */
public interface OrganizationManager {

    /**
     * 添加一个新的组织
     *
     * @param organization 组织对象
     */
    void addOrganization(Organization organization);

    /**
     * 删除一个组织，如果该组织存在下级组织，则返回不能删除
     *
     * @param orgId 组织ID
     */
    void removeOrganization(String orgId);

    /**
     * 取得指定id的组织对象
     *
     * @param orgId 组织ID
     * @return
     */
    Organization getOrganization(String orgId);

    /**
     * 返回组织列表
     *
     * @return
     */
    List<Organization> listOrganization();
}
