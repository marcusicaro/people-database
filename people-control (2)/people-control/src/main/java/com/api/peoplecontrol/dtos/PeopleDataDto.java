package com.api.peoplecontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class PeopleDataDto {


    @NotBlank
    private String peopleDataName;
    @NotBlank
    @Size(max = 10)
    private String peopleDataSurname;
    @NotBlank
    private String peopleDataWeight;
    @NotBlank
    private String getPeopleDataHeight;

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

    public String getGetPeopleDataHeight() {
        return getPeopleDataHeight;
    }

    public void setGetPeopleDataHeight(String getPeopleDataHeight) {
        this.getPeopleDataHeight = getPeopleDataHeight;
    }
}
