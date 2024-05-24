package com.company.hethonggiamsat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HETHONGGIAMSAT_SOURCE")
@Entity(name = "hethonggiamsat_Source")
@NamePattern("%s|nameSource")
public class Source extends StandardEntity {
    private static final long serialVersionUID = -5953933786071178584L;

    @Column(name = "NAME_SOURCE")
    private String nameSource;

    public String getNameSource() {
        return nameSource;
    }

    public void setNameSource(String nameSource) {
        this.nameSource = nameSource;
    }



}