package com.flightdata.service.flightschedule;

import com.flightdata.service.flight.Flight;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "flights")
public class FlightSchedule {

    private ArrayList<Flight> flights;


    public FlightSchedule(ArrayList<Flight> flights) {
        this.flights = new ArrayList<>();
    }

    public FlightSchedule() {

    }

    public int getFlightsSize() {
        return this.flights.size();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

    @XmlElement(name = "flight")
    public  ArrayList<Flight> getFlights(){
        return flights;
    }


}
