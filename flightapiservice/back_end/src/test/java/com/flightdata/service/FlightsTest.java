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
        flight1 = new Flight("Cathay Pacific","LHR", "AUH", "1792211", "2018-01-05", "20:15:00", "LHR", "", "CX", "HKG", "2018-01-05","15:05:00", "Economy", "CX253", "0", "AUD","2567.240","2018-01-01","17:50:00", "","CX", "2018-01-01", "11:25:00", "Economy", "CX162", "WW6VWU");
        flight2 = new Flight("British Airways", "LHR", "DXB", "1803064","2018-01-20","15:10:00", "LHR", "", "BA", "DEL","2018-01-20","11:05:00","Economy", "BA256", "0","GBP", "1018.140","2018-01-02", "08:35:00", "", "BA", "2018-01-01", "21:40:00", "Economy", "BA109", "VX93UK" );
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
