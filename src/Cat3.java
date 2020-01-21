import Cat2.Toy;


public class Cat3 {
String name = "Murka";
String toyname;
Cat3(){}
Cat3(String name){
	this.name=name;
}
class Toy{
	String toyName = "mouse";
	Toy(Cat3 cat, String toyName){
	name = cat.name;
	this.toyName= toyName;
	}
}
void startPlaying(final String toyName){
	class Toy{
		String toyNameInner = "mouse";
		Toy(Cat3 cat){
		name = cat.name;
		this.toyNameInner= toyName;
		}
	}
	
	
	
	Toy toy = new Toy(this);
	System.out.println(this.name + " plays with a "+toy.toyName);
}
}

}
