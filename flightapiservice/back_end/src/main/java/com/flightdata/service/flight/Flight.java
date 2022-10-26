package com.flightdata.service.flight;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

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

    public Flight(){

    }

    @XmlAttribute(name = "carrier")
    public String getFlightCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @XmlAttribute(name = "depair")
    public String getDepAir() {
        return depair;
    }

    public void setDepAir(String depair) {
        this.depair = depair;
    }

    @XmlAttribute(name = "destair")
    public String getDestAir(){
        return destair;
    }

    public void setDestAir(String destair) {
        this.destair = destair;
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "inarrivaldate")
    public String getInArrivalDate() {
        return inArrivalDate;
    }

    public void setInarrivalDate(String inArrivalDate) {
        this.inArrivalDate = inArrivalDate;
    }

    @XmlAttribute(name = "inarrivaltime")
    public String getInarrivalTime() {
        return inArrivalTime;
    }

    public void setInarrivalTime(String inArrivalTime) {
        this.inArrivalTime = inArrivalTime;
    }

    @XmlAttribute(name = "inarrivalcode")
    public String getInarriveCode() {
        return inArriveCode;
    }

    public void setInarriveCode(String inArriveCode) {
        this.inArriveCode = inArriveCode;
    }

    @XmlAttribute(name = "inbookingclass")
    public String getInbookingClass() {
        return inBookingClass;
    }

    public void setInbookingClass(String inBookingClass) {
        this.inBookingClass = inBookingClass;
    }

    @XmlAttribute(name = "incarriercode")
    public String getIncarrierCode() {
        return inCarrierCode;
    }

    public void setIncarrierCode(String inCarrierCode) {
        this.inCarrierCode = inCarrierCode;
    }

    @XmlAttribute(name = "indepartcode")
    public String getIndepartCode() {
        return inDepartCode;
    }

    public void setIndepartCode(String inDepartCode) {
        this.inDepartCode = inDepartCode;
    }

    @XmlAttribute(name = "indepartdate")
    public String getInDepartDate() {
        return inDepartDate;
    }

    public void setInDepartDate(String inDepartDate) {
        this.inDepartDate = inDepartDate;
    }

    @XmlAttribute(name = "indeparttime")
    public String getInDepartTime() {
        return inDepartTime;
    }

    public void setInDepartTime(String inDepartTime) {
        this.inDepartTime = inDepartTime;
    }

    @XmlAttribute(name = "inflightclass")
    public String getInFlightClass() {
        return inFlightClass;
    }

    public void setInFlightClass(String inFlightClass) {
        this.inFlightClass = inFlightClass;
    }

    @XmlAttribute(name = "inflightno")
    public String getInFlightNo() {
        return inFlightNo;
    }

    public void setInFlightNo(String inFlightNo) {
        this.inFlightNo = inFlightNo;
    }

    @XmlAttribute(name = "oneway")
    public String getOneWay() {
        return oneWay;
    }


    public void setOneWay(String oneWay) {
        this.oneWay = oneWay;
    }

    @XmlAttribute(name = "orginalcurrency")
    public String getOriginalCurrency() {
        return originalCurrency;
    }

    public void setOriginalCurrency(String originalCurrency) {
        this.originalCurrency = originalCurrency;
    }

    @XmlAttribute(name = "orginalprice")
    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    @XmlAttribute(name="outarrivaldate")
    public String getOutArrivalDate() {
        return outArrivalDate;
    }

    public void setOutArrivalDate(String outArrivalDate) {
        this.outArrivalDate = outArrivalDate;
    }

    @XmlAttribute(name = "outarrivaldate")
    public String getOutArrivalTime() {
        return outArrivalTime;
    }

    public void setOutArrivalTime(String outArrivalTime) {
        this.outArrivalTime = outArrivalTime;
    }

    @XmlAttribute(name = "outbookingclass")
    public String getOutBookingClass() {
        return outBookingClass;
    }

    public void setOutBookingClass(String outBookingClass) {
        this.outBookingClass = outBookingClass;
    }

    @XmlAttribute(name = "outcarriercode")
    public String getOutCarrierCode() {
        return outCarrierCode;
    }

    public void setOutCarrierCode(String outCarrierCode) {
        this.outCarrierCode = outCarrierCode;
    }

    @XmlAttribute(name = "outdepartdate")
    public String getOutDepartDate() {
        return outDepartDate;
    }

    public void setOutDepartDate(String outDepartDate) {
        this.outDepartDate = outDepartDate;
    }

    @XmlAttribute(name = "outdeparttime")
    public String getOutDepartTime() {
        return outDepartTime;
    }

    public void setOutDepartTime(String outDepartTime) {
        this.outDepartTime = outDepartTime;
    }

    @XmlAttribute(name = "outflightclass")
    public String getOutFlightClass() {
        return outFlightClass;
    }

    public void setOutFlightClass(String outFlightClass) {
        this.outFlightClass = outFlightClass;
    }

    @XmlAttribute(name = "outflightno")
    public String getOutFlightNo() {
        return outFlightNo;
    }

    public void setOutFlightNo(String outFlightNo) {
        this.outFlightNo = outFlightNo;
    }

    @XmlAttribute(name = "reservation")
    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}
