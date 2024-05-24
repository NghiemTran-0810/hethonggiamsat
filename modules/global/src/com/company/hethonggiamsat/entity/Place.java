package com.company.hethonggiamsat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HETHONGGIAMSAT_PLACE")
@Entity(name = "hethonggiamsat_Place")
@NamePattern("%s|namePlace")
public class Place extends StandardEntity {
    private static final long serialVersionUID = 996008365992699442L;

    @Column(name = "NAME_PLACE")
    private String namePlace;

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }
}