package lab7;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

import java.util.ArrayList;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
//NO NEED TO SUBMIT THIS FILE

/*
 * Tests included in this class serve as documentation on how instances of a
 * class work.
 * 
 * Be sure to also read the Lab instructions PDF carefully
 * 
 * Programming IDEs such as Eclipse are able to fix such compilation errors for
 * you. However, you are advised to follow the guidance as specified in the
 * written Lab instructions PDF to fix these compilation errors manually,
 * because: 1) it helps you better understand how the intended classes and
 * methods work together; and 2) you may be tested in a written test or exam
 * without the assistance of IDEs.
 * 
 */
public class JunitTest_AirportLogTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	// Test Airport Default Constructor
	@Test
	public void test_1_0() {
		Airport airport = new Airport();
		assertEquals("Test Airport Default Constructor failed", "Empty Airport", airport.toString());
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_1() {
		Airport airport = new Airport(
				"JFK, John F. Kennedy International Airport(New York International Airport), New York, NY , USA , 40.63975 , -73.77893 ");

		assertEquals("Test getAirportCity failed", "New York", airport.getAirportCity());
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_2() {
		Airport airport = new Airport(
				"JFK, John F. Kennedy International Airport(New York International Airport), New York, NY , USA , 40.63975 , -73.77893 ");

		assertEquals("Test getAirportCode failed", "JFK", airport.getAirportCode());
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_3() {
		Airport airport = new Airport(
				" JAX, Jacksonville International Airport  , 	Jacksonville,  FL,   USA   , 30.49406, -81.68786");

		assertEquals("Test getAirportCountry failed", "USA", airport.getAirportCountry());
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_4() {
		Airport airport = new Airport("ACV, Arcata Airport, Arcata/Eureka, CA , USA , 40.97812, -124.10862");

		assertEquals("Test getAirportCity failed", "Arcata/Eureka", airport.getAirportCity());
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_5() {
		Airport airport = new Airport("ACV, Arcata Airport, Arcata/Eureka, CA , USA , 40.97812  , -124.10862  ");

		assertEquals("Test getLatitude failed", 40.97812, airport.getLatitude(), 0.001);
		airport.setLatitude(40.8885);
		assertEquals("Test setLatitude failed", 40.8885, airport.getLatitude(), 0.001);
	}

	// Test Airport Parameterized Constructor with Valid Data
	@Test
	public void test_1_6() {
		Airport airport = new Airport("ACV, Arcata Airport, Arcata/Eureka, CA , USA , 40.97812  , -124.10862  ");

		assertEquals("Test getLongitude failed", -124.10862, airport.getLongitude(), 0.001);
		airport.setLongitude(-128.108);
		assertEquals("Test setLongitude failed", -128.108, airport.getLongitude(), 0.001);
	}
	
	@Test
	public void test_1_7() {
	
		Airport airport = new Airport("ACV, Arcata Airport, Eureka, CA , USA , 40.97812  , -124.10862  ");	
		assertEquals("Test getAirportCity failed", "Eureka", airport.getAirportCity());
		airport.setAirportCity("Arcata/Eureka");
		assertEquals("Test setAirportCity failed", "Arcata/Eureka", airport.getAirportCity());
	}
	
	@Test
	public void test_1_8() {
	
		Airport airport = new Airport("ACV, Arcata Airport, Arcata/Eureka,  , USA , 40.97812  , -124.10862  ");	
		assertEquals("Test getAirportState failed", "", airport.getAirportState());
		airport.setAirportState("CA");
		assertEquals("Test setAirportState failed", "CA", airport.getAirportState());
		
	}
	
	@Test
	public void test_1_9() {
	
		Airport airport = new Airport("ACV, Arcata Airport, Arcata/Eureka, CA , CA , 40.97812  , -124.10862  ");	
		assertEquals("Test getAirportCountry failed", "CA", airport.getAirportCountry());
		airport.setAirportCountry("USA");
		assertEquals("Test setAirportCountry failed", "USA", airport.getAirportCountry());
		
	}

	// Test Airport Parameterized Constructor with Invalid Data
	@Test
	public void test_2_0() {
		try {
			new Airport("Invalid data");
			fail("Test Airport Parameterized Constructor with Invalid Data failed");
		} catch (IllegalArgumentException e) {
			// do nothing
		}
	}

	// Test Airport Parameterized Constructor with Invalid Data
	@Test
	public void test_2_1() {
		try {
			new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768L,	-156.64922");
			fail("Test Airport Parameterized Constructor with Invalid Data failed");
		} catch (IllegalArgumentException e) {
			// do nothing
		}
	}

	// Test Airport Parameterized Constructor with Invalid Data
	@Test
	public void test_2_2() {
		try {
			new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922LA");
			fail("Test Airport Parameterized Constructor with Invalid Data failed");
		} catch (IllegalArgumentException e) {
			// do nothing
		}
	}

	// Test Airport Parameterized Constructor with Invalid Data
	@Test
	public void test_2_3() {
		try {
			new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, USA,  58.6768,	-156.64922");
			fail("Test Airport Parameterized Constructor with Invalid Data failed");
		} catch (IllegalArgumentException e) {
			// do nothing
		}
	}

	// Test Airport Set and Get Code
	@Test
	public void test_4_0() {
		Airport airport = new Airport();
		airport.setAirportCode("   JFK   ");
		assertEquals("Test Airport Set and Get Code Failed", "JFK", airport.getAirportCode());
	}

	// Test Airport Set and Get Name
	@Test
	public void test_4_1() {
		Airport airport = new Airport();
		airport.setAirportName("     Appleton International Airport   ");
		assertEquals("Test Airport Set and Get Name failed", "Appleton International Airport",
				airport.getAirportName());

	}
	
	//Test Set and Get Latitude
	@Test
	public void test_5_0() {
		Airport airport = new Airport();
	    airport.setLatitude(40.641766);
	    assertEquals("Test Set and Get Latitude failed ",40.641766, airport.getLatitude(), 0.0);
	}

	// Test Airport toString
	@Test
	public void test_7_0() {
		Airport airport = new Airport("CAE, Columbia Metropolitan Airport, Columbia, SC, USA, 33.93884, -81.11954");
		assertEquals("Test Airport toString",
				"CAE                           |Columbia Metropolitan Airport |Columbia                      |SC                            |USA                           |33.938840                     |-81.119540                    ",
				airport.toString());
	}

	// Test Airport toString
	@Test
	public void test_7_1() {
		Airport airport = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		assertEquals("Test Airport toString",
				"CMI                           |University of Illinois - Willard Airport|Champaign/Urbana              |IL                            |USA                           |40.039250                     |-88.278060                    ",
				airport.toString());
	}

	// Test AirportLog Default Constructor
	@Test
	public void test_10_0() {
		AirportLog log = new AirportLog();
		assertEquals("Test AirportLog Default Constructor failed ", "Unknown", log.getName());
		assertTrue("Test AirportLog Default Constructor failed ", log.getAirports().isEmpty());
	}

	// Test AirportLog Parameterized Constructor
	@Test
	public void test_10_1() {
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806"));
		AirportLog log = new AirportLog("Test Log", airports);
		assertEquals("Test AirportLog Parameterized Constructor failed ", "Test Log", log.getName());
		assertEquals("Test AirportLog Parameterized Constructor failed ", 1, log.size());
	}

	// Test AirportLog Add Airport
	@Test
	public void test_10_2() {
		AirportLog log = new AirportLog();
		Airport airport = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		log.addAirport(airport);
		assertEquals("Test AirportLog Add Airport failed ", 1, log.size());

	}

	// Test AirportLog Find Airport by State and Country
	@Test
	public void test_10_3() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		AirportLog log = new AirportLog("Test Log1", airports);
		AirportLog result = log.findAirport("NY", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 0, result.size());
		log.addAirport(airport13);
		result = log.findAirport("NY", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 1, result.size());
		log.addAirport(airport10);
		log.addAirport(airport11);
		log.addAirport(airport12);
		log.addAirport(airport9);
		result = log.findAirport("NY", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 2, result.size());

	}

	// Test AirportLog Find Airport by State and Country
	@Test
	public void test_10_4() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		AirportLog log = new AirportLog("Test Log1", airports);
		AirportLog result = log.findAirport("MI", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 7, result.size());
		log.addAirport(airport11);
		log.addAirport(airport12);
		log.addAirport(airport13);
		result = log.findAirport("MI", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 8, result.size());

	}

	// Test AirportLog Find Airport by State and Country
	@Test
	public void test_10_5() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		airports.add(airport11);
		airports.add(airport12);
		AirportLog log = new AirportLog("Test Log1", airports);
		AirportLog result = log.findAirport("AK", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 1, result.size());
		log.addAirport(airport13);
		result = log.findAirport("NY", "USA");
		assertEquals("Test AirportLog Find Airport by State and Country Failed", 2, result.size());

	}

	// Test AirportLog Find Airport by Index
	@Test
	public void test_10_6() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		airports.add(airport11);
		airports.add(airport12);
		airports.add(airport13);
		AirportLog log = new AirportLog("Test Log2", airports);
		assertSame("Test AirportLog Find Airport by Index Failed", airport1, log.findAirport(0));
		assertSame("Test AirportLog Find Airport by Index Failed", airport3, log.findAirport(2));

	}

	// Test AirportLog Find Airport by Index
	@Test
	public void test_10_7() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		airports.add(airport11);
		airports.add(airport12);
		airports.add(airport13);
		AirportLog log = new AirportLog("Test Log2", airports);
		assertSame("Test AirportLog Find Airport by Index Failed", airport13, log.findAirport(12));
		assertSame("Test AirportLog Find Airport by Index Failed", airport12, log.findAirport(11));

	}

	// Test AirportLog Find Airport by Invalid Index
	@Test
	public void test_10_8() {
		AirportLog log = new AirportLog();
		assertNull("Test AirportLog Find Airport by Invalid Index failed",log.findAirport(-1));
		assertNull("Test AirportLog Find Airport by Invalid Index failed",log.findAirport(1));
	}

	// Test AirportLog Find Airport by Invalid Index
	@Test
	public void test_10_9() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		AirportLog log = new AirportLog("Test Log2", airports);
		assertNull("Test AirportLog Find Airport by Invalid Index failed",log.findAirport(3));
		assertNull("Test AirportLog Find Airport by Invalid Index failed",log.findAirport(4));
	}
	
	//Test AirportLog Size
	@Test
	public void test_10_10() {
		 AirportLog log = new AirportLog();
		    assertEquals("Test AirportLog Size failed",0, log.size());
		    log.addAirport(new Airport());
		    assertEquals("Test AirportLog Size failed",1, log.size());
		
	}
	//Test AirportLog GetName
	@Test
	public void test_10_11() {
		
		 AirportLog log = new AirportLog("My Log", new ArrayList<>());
		    assertEquals("Test AirportLog GetName","My Log", log.getName());
	}
	
	@Test
	public void test_10_12() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		airports.add(airport11);
		airports.add(airport12);
		airports.add(airport13);
		AirportLog log1 = new AirportLog("Test Log1", airports);
		AirportLog log2 = new AirportLog("Test Log2", airports);
		assertSame("Test AirportLog object does not own the airport object failed", log2.findAirport(12), log1.findAirport(12));
		assertSame("Test AirportLog object does not own the airport object failed", log2.findAirport(11), log1.findAirport(11));

	}
	
	
	@Test
	public void test_10_13() {
		Airport airport1 = new Airport("DTW, Detroit Metropolitan Airport, Detroit, MI, USA, 42.21206, -83.34884");
		Airport airport2 = new Airport("ACV, Arcata Airport,Arcata/Eureka, CA , USA , 40.97812, -124.10862");
		Airport airport3 = new Airport("AKN, King Salmon Airport, King Salmon, AK, USA, 58.6768,	-156.64922");
		Airport airport4 = new Airport(
				"CMI, University of Illinois - Willard Airport,  Champaign/Urbana, IL, USA, 40.03925, -88.27806");
		Airport airport5 = new Airport(" MKG, Muskegon County Airport, Muskegon, MI, USA, 43.16949, -86.23822");
		Airport airport6 = new Airport(" MBS, MBS International Airport, Saginaw, MI, USA,	43.53291, -84.07965");
		Airport airport7 = new Airport(
				" LAN, Capital Region International Airport( Lansing Capital City), Lansing, MI, USA, 42.7787, -84.58736");
		Airport airport8 = new Airport(" IMT, Ford Airport	Iron,  Mountain/Kingsford, MI, 	USA, 45.81835, -88.11454");
		Airport airport9 = new Airport(
				" GRR, Gerald R. Ford International Airport, Grand Rapids, MI, USA, 42.88082, -85.52277");
		Airport airport10 = new Airport("FNT, Bishop International Airport, Flint, MI, USA, 42.9655, -83.74346");
		Airport airport11 = new Airport(" ESC, Delta County Airport,	Escanaba, MI, USA, 45.72267, -87.09373");
		Airport airport12 = new Airport("BGM, Greater Binghamton Airport, Binghamton, NY, USA, 42.20848, -75.97961");
		Airport airport13 = new Airport(
				"BUF, Buffalo Niagara International Airport, Buffalo, NY, USA, 42.94052, -78.73217");
		ArrayList<Airport> airports = new ArrayList<>();
		airports.add(airport1);
		airports.add(airport2);
		airports.add(airport3);
		airports.add(airport4);
		airports.add(airport5);
		airports.add(airport6);
		airports.add(airport7);
		airports.add(airport8);
		airports.add(airport9);
		airports.add(airport10);
		airports.add(airport11);
		airports.add(airport12);
		airports.add(airport13);
		AirportLog log1 = new AirportLog("Test Log1", airports);
		AirportLog log2 = new AirportLog("Test Log2", airports);
		assertNotSame("Test AirportLog object owns the list of AirPort objects failed", log2.getAirports(), log1.getAirports());
		

	}
	
}
