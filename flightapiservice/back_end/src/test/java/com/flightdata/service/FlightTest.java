package com.flightdata.service;

import com.flightdata.service.flight.Flight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private static Flight flight1;

    @Before
    public void setUp(){
       flight1 = new Flight("Cathay Pacific", "LHR");
    }

    @Test
    public void canGetFlightCarrier(){
        assertEquals("Cathay Pacific", flight1.getFlightCarrier());
    }

    @Test
    public void canGetDepair(){
        assertEquals("LHR", flight1.getDepAir());
    }
}
