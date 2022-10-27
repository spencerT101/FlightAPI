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
import java.util.ArrayList;
import java.util.List;


public class XmlToJava {

    private static final String PATH = "/Users/spencertaber/coding_projects/Java/FlightAPI/flightapiservice/back_end/src/main/resources/flighdata.xml";

//    public  void  getUnmarshaller() throws JAXBException, SAXException, IOException {
////        String fileRoute = PATH;
////        unmarshalFlightData();
//    }

    public static void main(String[] args) throws JAXBException, IOException {

        File file = new File(PATH);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st = null;

        StringBuffer sb = new StringBuffer();

        try {
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                sb.append(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        JAXBContext context = JAXBContext.newInstance(FlightSchedule.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        StringReader reader = new StringReader(sb.toString());
        FlightSchedule flightSchedule = (FlightSchedule) unmarshaller.unmarshal(reader);

        List<Flight> list = flightSchedule.getFlights();

        if (list != null) {
            for (Flight fli : list)
                System.out.println(fli.getFlightCarrier());
        } else {
            System.out.println("xml file is not marshalling");
        }
    }
}
