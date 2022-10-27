package com.flightdata.service.flight;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.xml.bind.annotation.XmlAttribute;


@JsonPropertyOrder({"flightCarrier", "depAir", "destAir", "id", "inArrivalDate", "inArrivalTime", "inarriveCode", "inbookingClass", "incarrierCode", "indepartCode",
        "inDepartDate", "inDepartTime", "inFlightClass", "inFlightNo", "oneWay", "originalCurrency", "originalPrice", "outArrivalDate", "outArrivalTime", "outBookingClass", "outCarrierCode",
        "outDepartDate", "outDepartTime", "outFlightClass", "outFlightNo", "reservation"})
public class Flight {

    private String carrier;
    private String depair;
    private String destair;
    private String id;
    private String inArrivalDate;
    private String inArrivalTime;
    private String inArriveCode;
    private String inBookingClass;
    private String inCarrierCode;
    private String inDepartCode;
    private String inDepartDate;
    private String inDepartTime;
    private String inFlightClass;
    private String inFlightNo;
    private String oneWay;
    private String originalCurrency;
    private String originalPrice;
    private String outArrivalDate;
    private String outArrivalTime;
    private String outBookingClass;
    private String outCarrierCode;
    private String outDepartDate;
    private String outDepartTime;
    private String outFlightClass;
    private String outFlightNo;
    private String reservation;

    public Flight(String carrier, String depair, String destair, String id, String inArrivalDate, String inArrivalTime, String inArriveCode, String inBookingClass, String inCarrierCode, String inDepartCode, String inDepartDate, String inDepartTime, String inFlightClass, String inFlightNo, String oneWay, String originalCurrency, String originalPrice, String outArrivalDate, String outArrivalTime, String outBookingClass, String outCarrierCode, String outDepartDate, String outDepartTime, String outFlightClass, String outFlightNo, String reservation) {
        this.carrier = carrier;
        this.depair = depair;
        this.destair = destair;
        this.id = id;
        this.inArrivalDate = inArrivalDate;
        this.inArrivalTime = inArrivalTime;
        this.inArriveCode = inArriveCode;
        this.inBookingClass = inBookingClass;
        this.inCarrierCode = inCarrierCode;
        this.inDepartCode = inDepartCode;
        this.inDepartDate = inDepartDate;
        this.inDepartTime = inDepartTime;
        this.inFlightClass = inFlightClass;
        this.inFlightNo = inFlightNo;
        this.oneWay = oneWay;
        this.originalCurrency = originalCurrency;
        this.originalPrice = originalPrice;
        this.outArrivalDate = outArrivalDate;
        this.outArrivalTime = outArrivalTime;
        this.outBookingClass = outBookingClass;
        this.outCarrierCode = outCarrierCode;
        this.outDepartDate = outDepartDate;
        this.outDepartTime = outDepartTime;
        this.outFlightClass = outFlightClass;
        this.outFlightNo = outFlightNo;
        this.reservation = reservation;
    }

    public Flight() {

    }

    public String getFlightCarrier() {
        return carrier;
    }

    @XmlAttribute(name = "carrier")
    public void setFlightCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDepAir() {
        return depair;
    }

    @XmlAttribute(name = "depair")
    public void setDepAir(String depair) {
        this.depair = depair;
    }

    public String getDestAir() {
        return destair;
    }

    @XmlAttribute(name = "destair")
    public void setDestAir(String destair) {
        this.destair = destair;
    }

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getInArrivalDate() {
        return inArrivalDate;
    }

    @XmlAttribute(name = "inarrivaldate")
    public void setInarrivalDate(String inArrivalDate) {
        this.inArrivalDate = inArrivalDate;
    }

    public String getInarrivalTime() {
        return inArrivalTime;
    }

    @XmlAttribute(name = "inarrivaltime")
    public void setInarrivalTime(String inArrivalTime) {
        this.inArrivalTime = inArrivalTime;
    }

    public String getInarriveCode() {
        return inArriveCode;
    }

    @XmlAttribute(name = "inarrivecode")
    public void setInarriveCode(String inArriveCode) {
        this.inArriveCode = inArriveCode;
    }

    public String getInbookingClass() {
        return inBookingClass;
    }

    @XmlAttribute(name = "inbookingclass")
    public void setInbookingClass(String inBookingClass) {
        this.inBookingClass = inBookingClass;
    }

    public String getIncarrierCode() {
        return inCarrierCode;
    }

    @XmlAttribute(name = "incarriercode")
    public void setIncarrierCode(String inCarrierCode) {
        this.inCarrierCode = inCarrierCode;
    }


    public String getIndepartCode() {
        return inDepartCode;
    }

    @XmlAttribute(name = "indepartcode")
    public void setIndepartCode(String inDepartCode) {
        this.inDepartCode = inDepartCode;
    }


    public String getInDepartDate() {
        return inDepartDate;
    }

    @XmlAttribute(name = "indepartdate")
    public void setInDepartDate(String inDepartDate) {
        this.inDepartDate = inDepartDate;
    }

    public String getInDepartTime() {
        return inDepartTime;
    }

    @XmlAttribute(name = "indeparttime")
    public void setInDepartTime(String inDepartTime) {
        this.inDepartTime = inDepartTime;
    }

    public String getInFlightClass() {
        return inFlightClass;
    }

    @XmlAttribute(name = "inflightclass")
    public void setInFlightClass(String inFlightClass) {
        this.inFlightClass = inFlightClass;
    }


    public String getInFlightNo() {
        return inFlightNo;
    }

    @XmlAttribute(name = "inflightno")
    public void setInFlightNo(String inFlightNo) {
        this.inFlightNo = inFlightNo;
    }


    public String getOneWay() {
        return oneWay;
    }

    @XmlAttribute(name = "oneway")
    public void setOneWay(String oneWay) {
        this.oneWay = oneWay;
    }


    public String getOriginalCurrency() {
        return originalCurrency;
    }

    @XmlAttribute(name = "originalcurrency")
    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    @XmlAttribute(name = "originalprice")
    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOutArrivalDate() {
        return outArrivalDate;
    }

    @XmlAttribute(name = "outarrivaldate")
    public void setOutArrivalDate(String outArrivalDate) {
        this.outArrivalDate = outArrivalDate;
    }


    public String getOutArrivalTime() {
        return outArrivalTime;
    }

    @XmlAttribute(name = "outarrivaltime")
    public void setOutArrivalTime(String outArrivalTime) {
        this.outArrivalTime = outArrivalTime;
    }


    public String getOutBookingClass() {
        return outBookingClass;
    }

    @XmlAttribute(name = "outcarriercode")
    public void setOutBookingClass(String outBookingClass) {
        this.outBookingClass = outBookingClass;
    }

    public String getOutCarrierCode() {
        return outCarrierCode;
    }

    @XmlAttribute(name = "outbookingclass")
    public void setOutCarrierCode(String outCarrierCode) {
        this.outCarrierCode = outCarrierCode;
    }


    public String getOutDepartDate() {
        return outDepartDate;
    }

    @XmlAttribute(name = "outdepartdate")
    public void setOutDepartDate(String outDepartDate) {
        this.outDepartDate = outDepartDate;
    }

    public String getOutDepartTime() {
        return outDepartTime;
    }

    @XmlAttribute(name = "outdeparttime")
    public void setOutDepartTime(String outDepartTime) {
        this.outDepartTime = outDepartTime;
    }

    public String getOutFlightClass() {
        return outFlightClass;
    }

    @XmlAttribute(name = "outflightclass")
    public void setOutFlightClass(String outFlightClass) {
        this.outFlightClass = outFlightClass;
    }

    public String getOutFlightNo() {
        return outFlightNo;
    }

    @XmlAttribute(name = "outflightno")
    public void setOutFlightNo(String outFlightNo) {
        this.outFlightNo = outFlightNo;
    }

    public String getReservation() {
        return reservation;
    }

    @XmlAttribute(name = "reservation")
    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}
