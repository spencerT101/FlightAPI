package com.flightdata.service;

import com.flightdata.service.flight.Flight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private static Flight flight1;
    private static final String DATE = "2018-05-05";
    private static final String TIME = "17:30:00";
    private static final String BUSINESS = "Business";

    @Before
    public void setUp(){
       flight1 = new Flight("Cathay Pacific", "LHR","DXB","1792211","2018-01-20","15:10:00", "LHR", "", "CX", "HKG","2018-01-05","15:05:00","Economy", "CX253", "0", "AUD","2567.240","2018-01-01","17:50:00", "", "CX", "2018-01-01", "11:25:00", "Economy", "CX162", "WW6VWU" );
    }

    @Test
    public void canGetFlightCarrier(){
        assertEquals("Cathay Pacific", flight1.getFlightCarrier());
    }

    @Test
    public void canSetFlightCarrier(){
        flight1.setCarrier("British Airways");
        assertEquals("British Airways", flight1.getFlightCarrier());
    }

    @Test
    public void canGetDepair(){
        assertEquals("LHR", flight1.getDepAir());
    }

    @Test
    public void canSetDepair(){
        flight1.setDepAir("LGW");
        assertEquals("LGW", flight1.getDepAir());
    }

    @Test
    public void canGetDestair(){
        assertEquals("DXB", flight1.getDestAir());
    }

    @Test
    public void canSetDestAir(){
        flight1.setDestAir("AUH");
        assertEquals("AUH", flight1.getDestAir());
    }

    @Test
    public void canGetInArrivalDate(){
        assertEquals("2018-01-20", flight1.getInArrivalDate());
    }

    @Test
    public void canSetInArrivalDate(){
        flight1.setInarrivalDate(DATE);
        assertEquals(DATE, flight1.getInArrivalDate());
    }

    @Test
    public void canGetInArrivalTime(){
        assertEquals("15:10:00", flight1.getInarrivalTime());
    }

    @Test
    public void canSetInArrivalTime(){
        flight1.setInarrivalTime(TIME);
        assertEquals(TIME, flight1.getInarrivalTime());
    }

    @Test
    public void canGetInArrivalCode(){
        assertEquals("LHR", flight1.getInarriveCode());
    }

    @Test
    public void canSetInArrivalCode(){
        flight1.setInarriveCode("DXB");
        assertEquals("DXB", flight1.getInarriveCode());
    }

   @Test
   public void canGetInBookingClass(){
        assertEquals("", flight1.getInbookingClass());
   }

   @Test
    public void canSetInBookingClass(){
        flight1.setInbookingClass(BUSINESS);
        assertEquals(BUSINESS, flight1.getInbookingClass());
   }

   @Test
    public void canGetInCarrierCode(){
       assertEquals("CX", flight1.getIncarrierCode());
   }

   @Test
    public void canSetInCarrierCode(){
        flight1.setIncarrierCode("BA");
        assertEquals("BA", flight1.getIncarrierCode());
   }

   @Test
    public void canGetInDepartCode(){
        assertEquals("HKG", flight1.getIndepartCode());
   }

   @Test
    public void canSetInDepartCode(){
        flight1.setIndepartCode("HKG");
        assertEquals("HKG", flight1.getIndepartCode());
   }

   @Test
    public void canGetInDepartDate(){
        assertEquals("2018-01-05", flight1.getInDepartDate());
   }

   @Test
    public void canSetInDepartDate(){
        flight1.setInDepartDate(DATE);
        assertEquals(DATE, flight1.getInDepartDate());
   }

   @Test
    public void canGetInDepartTime(){
        assertEquals("15:05:00", flight1.getInDepartTime());
   }

   @Test
    public void canSetInDepartTime(){
        flight1.setInDepartTime(TIME);
        assertEquals(TIME, flight1.getInDepartTime());
   }

   @Test
    public void canGetInFlightClass(){
        assertEquals("Economy", flight1.getInFlightClass());
   }

   @Test
    public void canSetInFlightClass(){
        flight1.setInFlightClass(BUSINESS);
        assertEquals(BUSINESS, flight1.getInFlightClass());
   }

   @Test
    public void canGetInFlightNo(){
        assertEquals("CX253", flight1.getInFlightNo());
   }

   @Test
    public void canSetInFlightNo(){
        flight1.setInFlightNo("CZ255");
        assertEquals("CZ255", flight1.getInFlightNo());
   }

   @Test
    public void canGetOneWay(){
        assertEquals("0", flight1.getOneWay());
   }

   @Test
    public void canSetOneWay(){
        flight1.setOneWay("1");
        assertEquals("1", flight1.getOneWay());
   }

   @Test
    public void canGetOriginalCurrency(){
        assertEquals("AUD", flight1.getOriginalCurrency());
   }

   @Test
    public void canSetOriginalCurrency(){
        flight1.setOriginalCurrency("USD");
        assertEquals("USD", flight1.getOriginalCurrency());
   }

   @Test
    public void canGetOriginalPrice(){
        assertEquals("2567.240", flight1.getOriginalPrice());
   }

   @Test
    public void canSetOriginalPrice(){
        flight1.setOriginalPrice("3000.000");
        assertEquals("3000.000", flight1.getOriginalPrice());
   }

   @Test
    public void canGetOutArrivalDate(){
        assertEquals("2018-01-01", flight1.getOutArrivalDate());
   }

   @Test
    public void canSetOutArrivalDate(){
        flight1.setOutArrivalDate(DATE);
        assertEquals(DATE, flight1.getOutArrivalDate());
   }

   @Test
   public void canGetOutArrivalTime(){
        assertEquals("17:50:00", flight1.getOutArrivalTime());
   }

   @Test
    public void canSetOutArrivalTime(){
        flight1.setOutArrivalTime(TIME);
        assertEquals(TIME, flight1.getOutArrivalTime());
   }

   @Test
    public void canGetOutBookingClass(){
        assertEquals("", flight1.getOutBookingClass());
   }

   @Test
    public void canSetOutBookingClass(){
        flight1.setOutBookingClass(BUSINESS);
        assertEquals(BUSINESS, flight1.getOutBookingClass());
   }

   @Test
    public void canGetOutCarrierCode(){
        assertEquals("CX", flight1.getOutCarrierCode());
   }

   @Test
    public void canSetOutCarrierCode(){
        flight1.setOutCarrierCode("CT");
        assertEquals("CT", flight1.getOutCarrierCode());
   }

   @Test
   public void canGetOutDepartDate(){
        assertEquals("2018-01-01", flight1.getOutDepartDate());
   }

   @Test
    public void canSetOutDepartDate(){
        flight1.setOutDepartDate(DATE);
        assertEquals(DATE, flight1.getOutDepartDate());
   }

   @Test
    public void canGetOutDepartTime(){
        assertEquals("11:25:00", flight1.getOutDepartTime());
   }

   @Test
    public void canSetOutDepartTime(){
        flight1.setOutDepartTime(TIME);
        assertEquals(TIME, flight1.getOutDepartTime());
   }

   @Test
    public void canGetOutFlightClass(){
        assertEquals("Economy", flight1.getOutFlightClass());
   }

   @Test
    public void canSetOutFlightClass(){
        flight1.setOutFlightClass(BUSINESS);
        assertEquals(BUSINESS, flight1.getOutFlightClass());
   }

   @Test
    public void canGetOutFlightNo(){
        assertEquals("CX162", flight1.getOutFlightNo());
   }

   @Test
    public void canSetOutFlightNo(){
        flight1.setOutFlightNo("ZZZZ");
        assertEquals("ZZZZ", flight1.getOutFlightNo());
   }

   @Test
    public void canGetReservation(){
        assertEquals("WW6VWU", flight1.getReservation());
   }

   @Test
    public void canSetReservation(){
        flight1.setReservation("RRRR");
        assertEquals("RRRR", flight1.getReservation());
   }

}
