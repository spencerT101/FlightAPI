# FlightAPI
Take home assignment to create an API using an XML file of flight data and perform some analytics on it that can be viewed in a front end.

You should produce an API designed to run as a web service that can output the flight data provided above in a JSON format.

You should then create a web-page that that can retrieve the data from your API, and process it to produce the following data points:

– Which flight has the most stops?
– Which airport day has the most departures from Manchester (MAN)?
– How many different flight numbers are on each day?
– What proportion of the flights are business class?
– At least one other statistic that you find interesting

## Plan

- Create SpringBoot backend to unmarshal xml file to Java object and build an API to return the data as a JSON response.

- Build a front end in React to call the API and receive the data in state in the front end.

- Using a library such as Chart.JS, ReCharts etc to visualise the data and answer the questions for the assignment.

## Installation and set up...

- Clone the repository and open in your chosen IDE (Intellij recommended).
- Run the application either from the FlightserviceApplication class or from the drop down menu select FlightserviceApplication and push the play icon.
- In your chosen API client create a GET request.
- Set url to localhost:8080/flight/flightdata.
- CURRENTLY UNABLE TO RETURN A JSON RESPONSE AS OF YET. PLEASE SEE ISSUES SECTION BELOW.

## Issues

- Had issues trying to unmarshal the file, this posed a bigger challenge than I anticipated and as a result I am still working to return the data in JSON format.

- So far I am not able to satisy any of the requirements for the assignment much to my frustration. However, I have decided to continue to complete this assignment as a personal project as it is a useful coding challenge to focus on.
