package HashSetMapActivity;

import java.util.HashMap;
import java.util.Set;

public class TeamMap {

	private HashMap<Integer, TeamSet> wrestMap;

	public TeamMap() {
		wrestMap = new HashMap<Integer, TeamSet>();
		TeamSet a = new TeamSet();
		TeamSet b = new TeamSet();
		TeamSet c = new TeamSet();
		TeamSet d = new TeamSet();
		TeamSet e = new TeamSet();
		TeamSet f = new TeamSet();
		TeamSet g = new TeamSet();
		TeamSet h = new TeamSet();
		TeamSet i = new TeamSet();
		TeamSet z = new TeamSet();
		
		wrestMap.put(0, a);
		wrestMap.put(1, b);
		wrestMap.put(2, c);
		wrestMap.put(3, d);
		wrestMap.put(4, e);
		wrestMap.put(5, f);
		wrestMap.put(6, g);
		wrestMap.put(7, h);
		wrestMap.put(8, i);
		wrestMap.put(9, z);
	}
	public void addWrestler(Wrestler a) {
		if(wrestMap.containsKey(a.hashCode())) {
			TeamSet c = wrestMap.get(a.hashCode());
			c.addWrestler(a);
			wrestMap.put(a.hashCode(), c);
		}
		else {
			TeamSet c = new TeamSet();
			c.addWrestler(a);
			wrestMap.put(a.hashCode(), c);
		}
	}
	public int getWeightGroup(Wrestler a ) {
		for(int h : wrestMap.keySet()) {
			if(wrestMap.get(h).getWrestSet().contains(a))
				return h;
		}
		return a.hashCode();
	}
	public void changeWeightGroup(Wrestler w, int group) {
		if(w.hashCode() >= group) {
			System.out.println("Can't change this persons weight group");
			return;
		}
		else {
			wrestMap.get(w.hashCode()).removeWrestler(w);
			wrestMap.get(group).addWrestler(w);
		}
	}

	public void changeWeight(Wrestler a, int b) {
		//finish this method
		for(int h : wrestMap.keySet()) {
			if(wrestMap.get(h).getWrestSet().contains(a)) {
				wrestMap.get(h).removeWrestler(a);
				Wrestler y = new Wrestler(a.getName(), b);
				wrestMap.get(h).addWrestler(y);
			}
		}
	}
	public String toString() {
		String output = "";
		for(int h: wrestMap.keySet()) {
			output+="\nWrestler Weight Group " + h + ": ";
			output+=wrestMap.get(h);
		}
		return output;
	}
}
