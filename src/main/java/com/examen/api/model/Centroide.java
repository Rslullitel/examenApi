package com.examen.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Centroide {

    @JsonProperty("lat")
    private double lat;

    @JsonProperty("lon")
    private double lon;

    public Centroide() {}

    public Centroide(double lat, double lon){
        this.lat = lat;
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
