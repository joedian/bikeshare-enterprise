package com.bikeapolis.bikeshare.data.domain.objects;

import org.springframework.data.annotation.Id;

/**
 * Created by princ on 18/03/2018.
 */
public class Country {
    @Id
    private int countryId;

    private String countryName;

    private String countryAbbreviation;

    public Country(String countryName, String countryAbbreviation) {
        this.countryName = countryName;
        this.countryAbbreviation = countryAbbreviation;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", countryAbbreviation='" + countryAbbreviation + '\'' +
                '}';
    }
}
