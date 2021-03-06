package com.noslowq.newsql.newsql.persistence.ddl;

import java.io.Serializable;

public class DbInfoDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.app_name
     *
     * @mbg.generated
     */
    private String appName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.mhost
     *
     * @mbg.generated
     */
    private String mhost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.mport
     *
     * @mbg.generated
     */
    private String mport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.muser
     *
     * @mbg.generated
     */
    private String muser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.mpwd
     *
     * @mbg.generated
     */
    private String mpwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.mdb
     *
     * @mbg.generated
     */
    private String mdb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column db_info.ctime
     *
     * @mbg.generated
     */
    private Integer ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table db_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.id
     *
     * @return the value of db_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.id
     *
     * @param id the value for db_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.app_name
     *
     * @return the value of db_info.app_name
     *
     * @mbg.generated
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.app_name
     *
     * @param appName the value for db_info.app_name
     *
     * @mbg.generated
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.mhost
     *
     * @return the value of db_info.mhost
     *
     * @mbg.generated
     */
    public String getMhost() {
        return mhost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.mhost
     *
     * @param mhost the value for db_info.mhost
     *
     * @mbg.generated
     */
    public void setMhost(String mhost) {
        this.mhost = mhost == null ? null : mhost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.mport
     *
     * @return the value of db_info.mport
     *
     * @mbg.generated
     */
    public String getMport() {
        return mport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.mport
     *
     * @param mport the value for db_info.mport
     *
     * @mbg.generated
     */
    public void setMport(String mport) {
        this.mport = mport == null ? null : mport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.muser
     *
     * @return the value of db_info.muser
     *
     * @mbg.generated
     */
    public String getMuser() {
        return muser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.muser
     *
     * @param muser the value for db_info.muser
     *
     * @mbg.generated
     */
    public void setMuser(String muser) {
        this.muser = muser == null ? null : muser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.mpwd
     *
     * @return the value of db_info.mpwd
     *
     * @mbg.generated
     */
    public String getMpwd() {
        return mpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.mpwd
     *
     * @param mpwd the value for db_info.mpwd
     *
     * @mbg.generated
     */
    public void setMpwd(String mpwd) {
        this.mpwd = mpwd == null ? null : mpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.mdb
     *
     * @return the value of db_info.mdb
     *
     * @mbg.generated
     */
    public String getMdb() {
        return mdb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.mdb
     *
     * @param mdb the value for db_info.mdb
     *
     * @mbg.generated
     */
    public void setMdb(String mdb) {
        this.mdb = mdb == null ? null : mdb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column db_info.ctime
     *
     * @return the value of db_info.ctime
     *
     * @mbg.generated
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column db_info.ctime
     *
     * @param ctime the value for db_info.ctime
     *
     * @mbg.generated
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table db_info
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appName=").append(appName);
        sb.append(", mhost=").append(mhost);
        sb.append(", mport=").append(mport);
        sb.append(", muser=").append(muser);
        sb.append(", mpwd=").append(mpwd);
        sb.append(", mdb=").append(mdb);
        sb.append(", ctime=").append(ctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}