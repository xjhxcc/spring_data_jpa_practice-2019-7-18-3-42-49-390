package com.tw.apistackbase.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CriminalElements {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @NotNull
    @Column(name = "subElement")
    private String subjectiveElementDescription;

    @NotNull
    @Column(name = "objElement")
    private String objectiveElementDescription;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectiveElementDescription() {
        return subjectiveElementDescription;
    }

    public void setSubjectiveElementDescription(String subjectiveElementDescription) {
        this.subjectiveElementDescription = subjectiveElementDescription;
    }

    public String getObjectiveElementDescription() {
        return objectiveElementDescription;
    }

    public void setObjectiveElementDescription(String objectiveElementDescription) {
        this.objectiveElementDescription = objectiveElementDescription;
    }
}
