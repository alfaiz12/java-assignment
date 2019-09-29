interface Animal{
	void displayName(String name);
}

class Vertebrates implements Animal{
	double w;
	public void setWeight(double weight){
			w = weight;
			
	}
	public double gettweight(){
		return(w);
	}
	public void displayName(String name){
		System.out.println("Vertebrates " + name);
	}
}
class Mammals extends Vertebrates{
	Mammals(double w,String n){
		setWeight(w);
		displayName(n);	
	}
}

class Invertebrates implements Animal{
	double w;
	public void setWeight(double weight){
		w = weight;
	}
	public double gettweight(){
		return(w);
	}
	public void displayName(String name){
		System.out.println("Invertebrates " + name);
	}
}
class Archanids extends Invertebrates{
	Archanids(double w,String n){
		displayName(n);
		setWeight(w);
	}
}
class InheritanceDemo{
	public static void main(String[] args){
		Animal a = new Mammals(20.5,"alfaiz");
		
		Animal b = new Archanids(30.5,"priya");
		
		
		//Point p1, p2, origin;
		//p1 = new Point(1,1);
		//p2 = new Point(5,5);
		//origin = new Point();
		//p1.getDistance(p2);
		//origin.getDistance(p2);
	}
}