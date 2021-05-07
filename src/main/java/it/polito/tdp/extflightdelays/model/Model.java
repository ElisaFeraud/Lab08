package it.polito.tdp.extflightdelays.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {
    
	Graph<Airport,DefaultWeightedEdge> grafo ;
	private ExtFlightDelaysDAO dao;
	private Map<Integer,Airport> idMap;
	public Model() {
		dao = new ExtFlightDelaysDAO();	
		idMap= new HashMap<>();
		dao.loadAllAirports(idMap);
	}
	public void creaGrafo(int x) {
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);	
		 Graphs.addAllVertices(grafo, idMap.values());
		//crea archi "filtrati"
		for(Rotta r: dao.getArchi(idMap, x)) {
			if(this.grafo.containsVertex(r.getOrigine()) && this.grafo.containsVertex(r.getDestinazione())) {
				DefaultWeightedEdge e = this.grafo.getEdge(r.getOrigine(), r.getDestinazione());
				if(e==null) {
					Graphs.addEdgeWithVertices(grafo, r.getOrigine(), r.getDestinazione(),r.getAvg_distance());
				}
				
			}
		}
		
			 
		
		System.out.format("Grafo creato con %d vertici e %d archi\n", this.grafo.vertexSet().size(),this.grafo.edgeSet().size());
		System.out.println("Archi: "+ this.grafo.edgeSet());
		
		
	}
	public int getNumeroVertici() {
		return grafo.vertexSet().size();
	}
	public int getNumeroArchi() {
		return grafo.edgeSet().size();
	}
	public String getOutput(){
		String s="";
		for(DefaultWeightedEdge e : grafo.edgeSet()) {
			s+= e.toString()+ " "+ grafo.getEdgeWeight(e) + "\n";
		}
		return s;
	}
}
