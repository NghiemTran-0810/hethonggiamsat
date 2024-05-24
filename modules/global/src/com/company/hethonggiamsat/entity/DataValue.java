package com.company.hethonggiamsat.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;
import com.haulmont.chile.core.annotations.NamePattern;


@NamePattern("%s - %s|date,value")
@Table(name = "HETHONGGIAMSAT_DATA_VALUE")
@Entity(name = "hethonggiamsat_DataValue")
public class DataValue extends StandardEntity {
    private static final long serialVersionUID = 3734177542523362527L;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_", nullable = false)
    protected Date date;

    @Column(name = "VALUE_", nullable = false)
    protected Integer value;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}