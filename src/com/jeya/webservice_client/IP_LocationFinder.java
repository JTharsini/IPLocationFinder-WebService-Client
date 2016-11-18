package com.jeya.webservice_client;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IP_LocationFinder {

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.err.println("Should pass an argument");
		}
		else
		{
			String ipAddress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap stub = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = stub.getGeoIP(ipAddress);
			System.out.println(geoIP.getCountryName());
		}
	}

}
