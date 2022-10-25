package com.flightdata.service.flights;

import com.flightdata.service.flight.Flight;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//@XmlRootElement(name = "flights")
public class Flights {

    private ArrayList<Flight> flights;


    private Flight flight;

    public Flights(ArrayList<Flight> flights, Flight flight) {
        this.flights = new ArrayList<>();
        this.flight = flight;
    }

    public Flights(){

    }

//    public int getFlightsSize() {
//        return this.flights.size();
//    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

//    @XmlElement(name = "flight")
    public  ArrayList<Flight> getFlights(){
        return flights;
    }

    public Flight getFlight() {
        return flight;
    }
}
