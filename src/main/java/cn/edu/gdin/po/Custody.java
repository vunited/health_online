package cn.edu.gdin.po;

import java.util.Date;

public class Custody {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.id
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.user_account
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private String userAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.collection_time
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Date collectionTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.heart_rate
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Integer heartRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.systolic_pressure
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Integer systolicPressure;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.diastolic_pressur
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Integer diastolicPressur;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.temperature
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Float temperature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.blood_oxygen
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Float bloodOxygen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custody.uv_index
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    private Byte uvIndex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.id
     *
     * @return the value of custody.id
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.id
     *
     * @param id the value for custody.id
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.user_account
     *
     * @return the value of custody.user_account
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.user_account
     *
     * @param userAccount the value for custody.user_account
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.collection_time
     *
     * @return the value of custody.collection_time
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Date getCollectionTime() {
        return collectionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.collection_time
     *
     * @param collectionTime the value for custody.collection_time
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.heart_rate
     *
     * @return the value of custody.heart_rate
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Integer getHeartRate() {
        return heartRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.heart_rate
     *
     * @param heartRate the value for custody.heart_rate
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.systolic_pressure
     *
     * @return the value of custody.systolic_pressure
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Integer getSystolicPressure() {
        return systolicPressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.systolic_pressure
     *
     * @param systolicPressure the value for custody.systolic_pressure
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setSystolicPressure(Integer systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.diastolic_pressur
     *
     * @return the value of custody.diastolic_pressur
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Integer getDiastolicPressur() {
        return diastolicPressur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.diastolic_pressur
     *
     * @param diastolicPressur the value for custody.diastolic_pressur
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setDiastolicPressur(Integer diastolicPressur) {
        this.diastolicPressur = diastolicPressur;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.temperature
     *
     * @return the value of custody.temperature
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Float getTemperature() {
        return temperature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.temperature
     *
     * @param temperature the value for custody.temperature
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.blood_oxygen
     *
     * @return the value of custody.blood_oxygen
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Float getBloodOxygen() {
        return bloodOxygen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.blood_oxygen
     *
     * @param bloodOxygen the value for custody.blood_oxygen
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setBloodOxygen(Float bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custody.uv_index
     *
     * @return the value of custody.uv_index
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public Byte getUvIndex() {
        return uvIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custody.uv_index
     *
     * @param uvIndex the value for custody.uv_index
     *
     * @mbggenerated Sun Mar 05 16:13:32 CST 2017
     */
    public void setUvIndex(Byte uvIndex) {
        this.uvIndex = uvIndex;
    }
}