package HashSetMapActivity;

import java.util.HashSet;

public class TeamSet {
	private HashSet<Wrestler> wrestSet;
	
	public TeamSet() {
		wrestSet = new HashSet<Wrestler>();
	}
	public void addWrestler(Wrestler a) {
		wrestSet.add(a);
	}
	public Double avgWeight() {
		int totalweight = 0;
		for(Wrestler a : wrestSet) {
			totalweight+=a.getWeight();
		}
		return (double)totalweight/wrestSet.size();
	}
	public HashSet<Wrestler> lightweight() {
		HashSet<Wrestler> list = new HashSet<Wrestler>();
		for(Wrestler a : wrestSet) {
			if(a.getWeight()<120)
				list.add(a);
		}
		return list;
	}
	public HashSet<Wrestler> getWrestSet() {
		return wrestSet;
	}
	public String toString() {
		String print = "";
		for(Wrestler a : wrestSet) {
			print+=a + ", ";
		}
		return print;
	}
	public void removeWrestler(Wrestler w) {
		wrestSet.remove(w);
		
	}

}
