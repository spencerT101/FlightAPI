package com.flightdata.service.xmltojava;

import com.flightdata.service.flights.Flights;
//import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

//public class XmlToJava {
//
//    private static final String PATH = "src/main/java/com/flightdata/service/xmltojava/flighdata.xml";
//
//    public  void  getUnmarshaller() throws JAXBException, SAXException, IOException{
////        String fileRoute = PATH;
////        unmarshalFlightData();
//    }
//
//    public static void main(String[] args) throws JAXBException, IOException {
//
////        System.out.println(path.isFile());
////        System.out.println(file.exists());
//
//
//       JAXBContext context = JAXBContext.newInstance(Flights.class);
//
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//
//        JAXBElement<Flights> rootElement = unmarshaller.unmarshal(new StreamSource(new File(PATH)), Flights.class);
//
//        Flights flights = rootElement.getValue();
//
//        System.out.println(flights);
//    }
//}
