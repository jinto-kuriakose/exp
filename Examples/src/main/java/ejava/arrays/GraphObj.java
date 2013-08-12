/**
 * 
 */
package ejava.arrays;

import java.util.List;

/**
 * @author jinto.kuriakose
 * 11-Aug-2013
 *
 */
public class GraphObj {
	
	String vertex;
	List<GraphObj> edges;
	
	public String getVertex() {
		return vertex;
	}
	public void setVertex(String vertex) {
		this.vertex = vertex;
	}
	public List<GraphObj> getEdges() {
		return edges;
	}
	public void setEdges(List<GraphObj> edges) {
		this.edges = edges;
	}

}
