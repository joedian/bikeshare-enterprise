package com.bikeapolis.bikeshare.data.domain.objects;

import org.springframework.data.annotation.Id;

/**
 * Created by princ on 18/03/2018.
 */
public class Address {
    @Id
    private long addressId;

    private String streetName;
    private String streetDirection;
    private String streetNumber;
    private City city;
    private Country country;

    public Address(String streetName, String streetDirection, String streetNumber, City city, Country country) {
        this.streetName = streetName;
        this.streetDirection = streetDirection;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetDirection() {
        return streetDirection;
    }

    public void setStreetDirection(String streetDirection) {
        this.streetDirection = streetDirection;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", streetName='" + streetName + '\'' +
                ", streetDirection='" + streetDirection + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", city=" + city +
                ", country=" + country +
                '}';
    }
}
