package com.company.hethonggiamsat.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "HETHONGGIAMSAT_LANGUAGE")
@Entity(name = "hethonggiamsat_Language")
@NamePattern("%s|nameLanguage")
public class Language extends StandardEntity {
    private static final long serialVersionUID = 281783645651685571L;

    @Column(name = "NAME_LANGUAGE")
    private String nameLanguage;

    public String getNameLanguage() {
        return nameLanguage;
    }

    public void setNameLanguage(String nameLanguage) {
        this.nameLanguage = nameLanguage;
    }
}