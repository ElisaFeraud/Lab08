package it.polito.tdp.extflightdelays.db;

import java.util.List;

import it.polito.tdp.extflightdelays.model.Airport;

public class TestDAO {

	public static void main(String[] args) {

		ExtFlightDelaysDAO dao = new ExtFlightDelaysDAO();
    //    List<Airport> lista = dao.loadAllAirports();
		System.out.println(dao.loadAllAirlines());
		//System.out.println(dao.loadAllAirports());
		System.out.println(dao.loadAllFlights().size());
	    
	//	System.out.println(dao.getAllVoli(lista,1600).size());
		
	}

}
