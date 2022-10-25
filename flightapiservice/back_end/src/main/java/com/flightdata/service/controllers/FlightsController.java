package com.flightdata.service.controllers;

import com.flightdata.service.flight.Flight;
import com.flightdata.service.flights.Flights;
//import com.flightdata.service.xmltojava.XmlToJava;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class FlightsController {

    private Flights flights1 = new Flights();
    private Flight flightDetail = new Flight("Cathay Pacific", "LHR","DXB", "1792211","2018-01-05", "20:15:00", "LHR", "", "CX", "HKG","2018-01-05","15:05:00", "Economy", "CX253", "0", "AUD", "2567.240","2018-01-01","17:50:00", "", "CX", "2018-01-01", "11:25:00", "Economy", "CX162", "WW6VWU");
    private ArrayList<Flight> flights  = new ArrayList<>();
//    private XmlToJava unmarshal = new XmlToJava();

    @RequestMapping(value = "/flight/flightdata", method = RequestMethod.GET)
    public Flight getFlightData() throws IOException, JAXBException, SAXException {
//        unmarshal.getUnmarshaller();

        return flightDetail;
    }
}
