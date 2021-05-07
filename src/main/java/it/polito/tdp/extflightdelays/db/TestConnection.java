package it.polito.tdp.extflightdelays.db;

import java.sql.Connection;
import java.util.List;

import it.polito.tdp.extflightdelays.model.Airport;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			Connection connection = ConnectDB.getConnection();
			connection.close();
			System.out.println("Test PASSED");
			ExtFlightDelaysDAO dao = new ExtFlightDelaysDAO();
	      
             connection.close();
		} catch (Exception e) {
			System.err.println("Test FAILED");
		}
	}

}
