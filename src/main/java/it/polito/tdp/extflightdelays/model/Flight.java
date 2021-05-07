package it.polito.tdp.extflightdelays.model;

import java.time.LocalDateTime;

public class Flight {

	private int id;
	private int airlineId;
	private int flightNumber;
	private String tailNumber;
	private int originAirportId;
	private int destinationAirportId;
	private LocalDateTime scheduledDepartureDate;
	private Double departureDelay;
	private Double elapsedTime;
	private int distance;
	private LocalDateTime arrivalDate;
	private Double arrivalDelay;
	private Airport a_partenza;
	private Airport a_arrivo;
	private Airport a_p;
	private Airport a_a;

	public Flight(int id, int airlineId, int flightNumber, String tailNumber, int originAirportId,
			int destinationAirportId, LocalDateTime scheduledDepartureDate, Double departureDelay, Double elapsedTime,
			int distance, LocalDateTime arrivalDate, Double arrivalDelay) {
		this.id = id;
		this.airlineId = airlineId;
		this.flightNumber = flightNumber;
		this.tailNumber = tailNumber;
		this.originAirportId = originAirportId;
		this.destinationAirportId = destinationAirportId;
		this.scheduledDepartureDate = scheduledDepartureDate;
		this.departureDelay = departureDelay;
		this.elapsedTime = elapsedTime;
		this.distance = distance;
		this.arrivalDate = arrivalDate;
		this.arrivalDelay = arrivalDelay;
	}
 public Flight(int id, int flightNumber  ,Airport a_p, Airport a_a) {
	 this.id=id;
	 this.a_p=a_p; 
	 this.a_a=a_a;
	 this.destinationAirportId=a_a.getId();
	 this.originAirportId= a_p.getId();
	 this.flightNumber=flightNumber;
 }
	public Airport getA_partenza() {
	return a_p;
}
public void setA_partenza(Airport a_partenza) {
	this.a_partenza = a_partenza;
}
public Airport getA_arrivo() {
	return a_a;
}
public void setA_arrivo(Airport a_arrivo) {
	this.a_arrivo = a_arrivo;
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}

	public int getOriginAirportId() {
		return originAirportId;
	}

	public void setOriginAirportId(int originAirportId) {
		this.originAirportId = originAirportId;
	}

	public int getDestinationAirportId() {
		return destinationAirportId;
	}

	public void setDestinationAirportId(int destinationAirportId) {
		this.destinationAirportId = destinationAirportId;
	}

	public LocalDateTime getScheduledDepartureDate() {
		return scheduledDepartureDate;
	}

	public void setScheduledDepartureDate(LocalDateTime scheduledDepartureDate) {
		this.scheduledDepartureDate = scheduledDepartureDate;
	}

	public Double getDepartureDelay() {
		return departureDelay;
	}

	public void setDepartureDelay(Double departureDelay) {
		this.departureDelay = departureDelay;
	}

	public Double getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(Double elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public LocalDateTime getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Double getArrivalDelay() {
		return arrivalDelay;
	}

	public void setArrivalDelay(Double arrivalDelay) {
		this.arrivalDelay = arrivalDelay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + airlineId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (airlineId != other.airlineId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", originAirportId=" + originAirportId
				+ ", destinationAirportId=" + destinationAirportId + "]";
	}

}
