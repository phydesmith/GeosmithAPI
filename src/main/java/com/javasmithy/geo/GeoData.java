package com.javasmithy.geo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="us_geodata")
public class GeoData {

    private @Id @GeneratedValue long id;
    private String countryCode;
    private String postalCode;
    private String placeName;
    private String stateName;
    private String stateCode;
    private String countyName;
    private String countyCode;
    private double latitude;
    private double longitude;
    private int accuracy;

    public GeoData() {}

    public GeoData(String countryCode, String postalCode, String placeName, String stateName, String stateCode, String countyName, String countyCode, double latitude, double longitude, int accuracy) {
        this.countryCode = countryCode;
        this.postalCode = postalCode;
        this.placeName = placeName;
        this.stateName = stateName;
        this.stateCode = stateCode;
        this.countyName = countyName;
        this.countyCode = countyCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoData geodata = (GeoData) o;
        return id == geodata.id && Double.compare(geodata.latitude, latitude) == 0 && Double.compare(geodata.longitude, longitude) == 0 && accuracy == geodata.accuracy && Objects.equals(countryCode, geodata.countryCode) && Objects.equals(postalCode, geodata.postalCode) && Objects.equals(placeName, geodata.placeName) && Objects.equals(stateName, geodata.stateName) && Objects.equals(stateCode, geodata.stateCode) && Objects.equals(countyName, geodata.countyName) && Objects.equals(countyCode, geodata.countyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryCode, postalCode, placeName, stateName, stateCode, countyName, countyCode, latitude, longitude, accuracy);
    }

    @Override
    public String toString() {
        return "Geodata{" +
                "id=" + id +
                ", countryCode='" + countryCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", placeName='" + placeName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", countyName='" + countyName + '\'' +
                ", countyCode='" + countyCode + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", accuracy=" + accuracy +
                '}';
    }
}
