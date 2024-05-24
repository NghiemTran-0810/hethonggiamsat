package com.company.hethonggiamsat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HETHONGGIAMSAT_TIME_RANGE")
@Entity(name = "hethonggiamsat_TimeRange")
@NamePattern("%s|timeRange")
public class TimeRange extends StandardEntity {
    private static final long serialVersionUID = -7719784833980501175L;

    @Column(name = "TIME_RANGE")
    private String timeRange;

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }
}