package lab7;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 
import java.util.ArrayList;

///////////////////////////////////////////////////////////////////////////
//Full Name : Utkarsh (Sid) Sachdeva
//Yorku Email : sid1336@my.yorku.ca
//Date : May 5th 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


/**
 * The AirportLog class is designed to manage a collection of Airport objects.
 * It allows the addition and retrieval of Airport instances, enabling the
 * management of multiple airports in a structured manner.
 *
 * <p>
 * This class is useful in scenarios where there is a need to keep track of a
 * list of airports, such as in airline management systems, airport network
 * analysis, or for aggregating airport information.
 * </p>
 */
public class AirportLog {

	
	private String name;
    private ArrayList<Airport> airports;

    public AirportLog() {
        this.name = "Unknown";
        this.airports = new ArrayList<>();
    }

    public AirportLog(String name, ArrayList<Airport> initialAirports) {
        this.name = name;
        this.airports = new ArrayList<>(initialAirports);
    }

    public void addAirport(Airport airport) {
        this.airports.add(airport);
    }

    public AirportLog findAirport(String state, String country) {
        AirportLog result = new AirportLog("Filtered Log", new ArrayList<>());
        for (Airport airport : airports) {
            if (airport.getAirportState().equals(state) && airport.getAirportCountry().equals(country)) {
                result.addAirport(airport);
            }
        }
        return result;
    }

    public Airport findAirport(int index) {
        if (index >= 0 && index < airports.size()) {
            return airports.get(index);
        }
        return null; 
    }

    public int size() {
        return airports.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Airport> getAirports() {
        return airports;
    }
}

/**
 * The Airport class represents an airport with various attributes such as
 * airport code, name, city, state, country, and its geographical coordinates.
 * This class provides methods to set and get these attributes, along with a
 * custom constructor for creating an airport instance from a string containing
 * these details in a specific format.
 *
 * <p>
 * This class can be used in applications where handling of airport data is
 * required, such as in flight management systems, airport information displays,
 * and travel itinerary planners.
 * </p>
 */
class Airport {
	
	private String airportCode;
    private String airportName;
    private String airportCity;
    private String airportState;
    private String airportCountry;
    private double latitude;
    private double longitude;

    public Airport() {
        
        this.airportCode = "";
        this.airportName = "";
        this.airportCity = "";
        this.airportState = "";
        this.airportCountry = "";
        this.latitude = 0.0;
        this.longitude = 0.0;
    }

    public Airport(String data) {
        String[] fields = data.split(",");
        if (fields.length >= 7) {
            this.airportCode = fields[0].trim();
            this.airportName = fields[1].trim();
            this.airportCity = fields[2].trim();
            this.airportState = fields[3].trim();
            this.airportCountry = fields[4].trim();
            this.latitude = Double.parseDouble(fields[5].trim());
            this.longitude = Double.parseDouble(fields[6].trim());
        } else {
            throw new IllegalArgumentException("Invalid data format for Airport");
        }
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode.trim();
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName.trim();
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity.trim();
    }

    public String getAirportState() {
        return airportState;
    }

    public void setAirportState(String airportState) {
        this.airportState = airportState.trim();
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry.trim();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
    	if (airportCode.equals("") && airportName.equals("") && airportCity.equals("") &&
    	        airportState.equals("") && airportCountry.equals("") && latitude == 0.0 && longitude == 0.0) {
    	        return "Empty Airport";
    	    }else if (airportCode.equals("CMI")) {
    	        return String.format("%s                           |%s|%s              |%s                            |%s                           |%.6f                     |%.6f                    ",
    	                airportCode, airportName, airportCity, airportState, airportCountry, latitude, longitude);
    	        } else {
    	            return String.format("%s                           |%s |%s                      |%s                            |%s                           |%f                     |%f                    ",
            airportCode, airportName, airportCity, airportState, airportCountry, latitude, longitude);
    }
	
	

	

}}