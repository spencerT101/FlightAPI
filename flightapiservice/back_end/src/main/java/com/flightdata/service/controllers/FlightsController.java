package com.flightdata.service.controllers;
import com.flightdata.service.flightschedule.FlightSchedule;
import com.flightdata.service.xmltojava.XmlToJava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
public class FlightsController {

    private XmlToJava unmarshal = new XmlToJava();

    @RequestMapping(value = "/flight/flightdata", method = RequestMethod.GET)
    public FlightSchedule getFlightData() throws IOException, JAXBException, SAXException {
        FlightSchedule flightSchedule = unmarshal.getUnmarshal();

        return flightSchedule;
    }
}
