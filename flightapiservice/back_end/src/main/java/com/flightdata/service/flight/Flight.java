package com.flightdata.service.flight;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Flight {


    private String carrier;
    private String depair;

    public Flight(String carrier, String depair) {
        this.carrier = carrier;
        this.depair = depair;
    }

    public Flight(){

    }

//    @XmlAttribute(name = "carrier")
    public String getFlightCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDepAir() {
        return depair;
    }
}
