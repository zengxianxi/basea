package com.xianxi.basea.dal.po;

/**
 * 组织
 *
 * @author zengxianxi
 * @since 12/16/13 23:53
 */
public class Organization {
    private String orgId;
    private String orgName;
    private String description;
    private Organization parentOrg;

    public Organization getParentOrg() {
        return parentOrg;
    }

    public void setParentOrg(Organization parentOrg) {
        this.parentOrg = parentOrg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

}
