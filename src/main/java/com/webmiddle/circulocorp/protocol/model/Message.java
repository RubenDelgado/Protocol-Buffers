/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webmiddle.circulocorp.protocol.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ruben
 */
public class Message implements Serializable {

    private String latitude;
    private String longitude;
    private String unitId;
    private int templateId; // es el evento = 1
    private Date utcTimestamp;
    private String vin;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public Date getUtcTimestamp() {

        return utcTimestamp;
    }

    public void setUtcTimestamp(Date utcTimestamp) {

        this.utcTimestamp = utcTimestamp;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

}
