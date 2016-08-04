package com.goeuro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Yevhenii on 04/08/2016.
 */
public class Suggest {
    @JsonProperty("_id")
    Long id;
    String key;
    String name;
    String fullName;
    @JsonProperty("iata_airport_code")
    String iataAirportCode;
    String type;
    String country;
    @JsonProperty("geo_position")
    GeoPosition geoPosition;
    Long locationId;
    Long countryId;
    String countryCode;
    Boolean inEurope;
    Boolean coreCountry;
    String distance;
    Object names;
    Object alternativeNames;

    public String toCSVRow(String[] fields, String separator){
        StringBuilder resultRow = new StringBuilder();
        for (int i = 0; i < fields.length; i++){
            String field = fields[i];
            switch (field){
                case "_id": resultRow.append(id); break;
                case "key": resultRow.append(key); break;
                case "name": resultRow.append(name); break;
                case "fullName": resultRow.append(fullName); break;
                case "iata_airport_code": resultRow.append(iataAirportCode); break;
                case "type": resultRow.append(type); break;
                case "country": resultRow.append(country); break;
                case "latitude": resultRow.append(geoPosition.getLatitude()); break;
                case "longitude": resultRow.append(geoPosition.getLongitude()); break;
                case "locationId": resultRow.append(locationId); break;
                case "countryId": resultRow.append(countryId); break;
                case "countryCode": resultRow.append(countryCode); break;
                case "inEurope": resultRow.append(inEurope); break;
                case "coreCountry": resultRow.append(coreCountry); break;
                case "distance": resultRow.append(distance); break;
                case "names": resultRow.append(names); break;
                case "alternativeNames": resultRow.append(alternativeNames); break;
            }
            if (i+1 != fields.length){
                resultRow.append(separator);
            }
        }
        resultRow.append("\n");
        return resultRow.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Object getNames() {
        return names;
    }

    public void setNames(Object names) {
        this.names = names;
    }

    public Object getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(Object alternativeNames) {
        this.alternativeNames = alternativeNames;
    }
}
