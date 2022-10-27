package com.flightdata.service.xmltojava;

import com.flightdata.service.FlightapiserviceApplication;
import com.flightdata.service.flight.Flight;
import com.flightdata.service.flightschedule.FlightSchedule;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.List;


public class XmlToJava {

    private static final String PATH = "/Users/spencertaber/coding_projects/Java/FlightAPI/flightapiservice/back_end/src/main/resources/flighdata.xml";

    public FlightSchedule getUnmarshal() throws JAXBException, IOException {

        File file = new File(PATH);

        JAXBContext context = JAXBContext.newInstance(FlightSchedule.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        FileReader reader = new FileReader(file);
        FlightSchedule flightSchedule = (FlightSchedule) unmarshaller.unmarshal(new StreamSource(reader));

        List<Flight> list = flightSchedule.getFlights();

        if (list.equals(null)) {
            System.out.println("Error List is null. Check xml file or debug unmarshal method");

        }

        return flightSchedule;
    }
}
