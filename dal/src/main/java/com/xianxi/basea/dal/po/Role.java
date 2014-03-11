package com.xianxi.basea.dal.po;

/**
 * @author zengxianxi
 * @since 12/17/13 0:36
 */
public class Role {
    private String roleId;
    private String roleName;
    private String description;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
