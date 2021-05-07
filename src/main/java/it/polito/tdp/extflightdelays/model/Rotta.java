package it.polito.tdp.extflightdelays.model;

public class Rotta {
   
	Airport origine;
    Airport destinazione;
    int avg_distance;
	public Rotta(Airport origine, Airport destinazione, int avg_distance) {
		this.origine = origine;
		this.destinazione = destinazione;
		this.avg_distance = avg_distance;
	}
	public Airport getOrigine() {
		return origine;
	}
	public void setOrigine(Airport origine) {
		this.origine = origine;
	}
	public Airport getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(Airport destinazione) {
		this.destinazione = destinazione;
	}
	public int getAvg_distance() {
		return avg_distance;
	}
	public void setAvg_distance(int avg_distance) {
		this.avg_distance = avg_distance;
	}
	 @Override
		public String toString() {
			return "" + origine + "-" + destinazione ;
		}

}
