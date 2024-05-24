package com.company.hethonggiamsat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "HETHONGGIAMSAT_CONFIG_STORAGES")
@Entity(name = "hethonggiamsat_ConfigStorages")
@NamePattern("%s|topicName")
public class ConfigStorages extends StandardEntity {
    private static final long serialVersionUID = 3547592701384576419L;

    @Column(name = "TOPIC_NAME")
    private String topicName;

    @Column(name = "KEYWORK")
    private String keyword;

    @Column(name = "EXCLUSION")
    private String exclusion;

    @Column(name = "NUM_OF_RECORDS")
    private Integer numOfRecords;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LANGUAGE_ID")
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SOURCE_ID")
    private Source source;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIME_RANGE_ID")
    private TimeRange timeRange;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLACE_ID")
    private Place place;

    // Getters and setters

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getExclusion() {
        return exclusion;
    }

    public void setExclusion(String exclusion) {
        this.exclusion = exclusion;
    }

    public Integer getNumOfRecords() {
        return numOfRecords;
    }

    public void setNumOfRecords(Integer numOfRecords) {
        this.numOfRecords = numOfRecords;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
