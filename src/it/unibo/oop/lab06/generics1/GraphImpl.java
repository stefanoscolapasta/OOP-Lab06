package it.unibo.oop.lab06.generics1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphImpl<N> implements Graph<N> {

	private Map<N, ArrayList<N>> graph;
	
	public GraphImpl() {
		this.graph = new HashMap<>();
	}
	
	public void addNode(N node) {
		if(node != null && !this.graph.containsKey(node)) {
			this.graph.put(node, new ArrayList<N>());
		}
	}

	public void addEdge(N source, N target) {
		if(source != null || target != null) {
			this.graph.get(source).add(target);
		}
	}

	public Set<N> nodeSet() {
		return new HashSet<>(this.graph.keySet());
	}

	public Set<N> linkedNodes(N node) {
		return new HashSet<>(this.graph.get(node));
	}

	public List<N> getPath(N source, N target) {
		final List<N> listPath = this.BFS(source, target, new ArrayList<N>());
		return listPath;
	}
	
	private ArrayList<N> BFS(N source, N target, ArrayList<N> listPath) {
		 if(this.graph.get(source).contains(target)) {
			 listPath.add(0, target);
			 listPath.add(0, source);
			 return listPath;
		 }
		 
		 for(N n : this.graph.get(source)) {
			 ArrayList<N> suppList = BFS(n, target, listPath);
			 if(hasBFSfoundThePath(suppList)) {
				 listPath = suppList;
				 
				 if(!listPath.contains(target)) {
					 listPath.add(0, target);
				 }
				 if(!listPath.contains(source)) {
					 listPath.add(0, source);
				 } 
				 return listPath;
			 }
		 }
		 return listPath;
	}
	
	private boolean hasBFSfoundThePath(ArrayList<N> suppList) {
		return suppList.size() > 0;
	}
}
