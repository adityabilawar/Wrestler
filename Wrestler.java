package HashSetMapActivity;

public class Wrestler
{
	private String name;
	private int weight;

	public Wrestler( String theName, int theWeight)
	{
		name= theName;
		weight=theWeight;
	}
	public int getWeight()
	{
		return weight;
	}
	public boolean equals(Object obj) {
		return (weight==(((Wrestler)obj).getWeight()));
		
	}
	public String toString() {
		return name + " " + weight;
	}
	public String getName() {
		return name;
	}
	public int hashCode() {
		return (weight/10)%10;
	}

}