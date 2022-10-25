package com.flightdata.service;

import com.flightdata.service.flight.Flight;
import com.flightdata.service.flights.Flights;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightsTest {

    private static Flight flight1;
    private static Flight flight2;
//    private static ArrayList<Flight> flightArray;
    private static Flights flightsSchedule;


    @Before
    public void setUp(){
        flight1 = new Flight("Cathay Pacific","LHR");
        flight2 = new Flight("British Airways", "LHR");
//        flightArray = new ArrayList<>();
//        flightsSchedule = new Flights(flightArray);
    }

//    @Test
//    public void canAddFlightToArrayList(){
//         flightsSchedule.addFlight(flight1);
//         flightsSchedule.addFlight(flight2);
//         assertEquals(2, flightsSchedule.getFlightsSize());
//    }

//    @Test
//    public void canRemoveFlightFromArrayList(){
//        flightsSchedule.addFlight(flight1);
//        flightsSchedule.addFlight(flight2);
//        flightsSchedule.removeFlight(flight1);
//        assertEquals(1, flightsSchedule.getFlightsSize());
//    }
}
