package com.api.peoplecontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_PEOPLE_DATA")
public class PeopleDataModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String peopleDataName;
    @Column(nullable = false, unique = true, length = 10)
    private String peopleDataSurname;
    @Column(nullable = false, length = 5)
    private String peopleDataWeight;
    @Column(nullable = false, length = 5)
    private String peopleDataHeight;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPeopleDataName() {
        return peopleDataName;
    }

    public void setPeopleDataName(String peopleDataName) {
        this.peopleDataName = peopleDataName;
    }

    public String getPeopleDataSurname() {
        return peopleDataSurname;
    }

    public void setPeopleDataSurname(String peopleDataSurname) {
        this.peopleDataSurname = peopleDataSurname;
    }

    public String getPeopleDataWeight() {
        return peopleDataWeight;
    }

    public void setPeopleDataWeight(String peopleDataWeight) {
        this.peopleDataWeight = peopleDataWeight;
    }

    public String getPeopleDataHeight() {
        return peopleDataHeight;
    }

    public void setPeopleDataHeight(String peopleDataHeight) {
        this.peopleDataHeight = peopleDataHeight;
    }
}
