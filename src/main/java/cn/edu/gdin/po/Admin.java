package cn.edu.gdin.po;

import java.util.Date;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_id
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    private Integer adminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_name
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_password
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    private String adminPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.create_time
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_id
     *
     * @return the value of admin.admin_id
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_id
     *
     * @param adminId the value for admin.admin_id
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_name
     *
     * @return the value of admin.admin_name
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_name
     *
     * @param adminName the value for admin.admin_name
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_password
     *
     * @return the value of admin.admin_password
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_password
     *
     * @param adminPassword the value for admin.admin_password
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.create_time
     *
     * @return the value of admin.create_time
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.create_time
     *
     * @param createTime the value for admin.create_time
     *
     * @mbggenerated Sat Feb 25 08:53:04 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}