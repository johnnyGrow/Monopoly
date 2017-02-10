public class Property 
{
	String name;
 int cost;

	String color;

	String type;



	public Property(String n, int c, String col, String t)

	{

	name=n;

	cost=c;

	color=col;
	
	type=t;




	}



	public int getRent() {
		return rent;
	}



	public void setRent(int rent) {
		this.rent = rent;
	}



	public String getName()

	{

	return name;

	}


	public void setName(String name)

	{

	Property.name = name;

	}


	public int getCost()

	{

	return cost;

	}


	public  void setCost(int cost)

	{

	Property.cost = cost;

	}


	public String getColor()

	{

	return color;

	}


	public void setColor(String color)

	{

	Property.color = color;

	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		Property.type = type;
	}



	

}
