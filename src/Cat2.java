
public class Cat2 {
	String name = "Murka";
	Cat2(){}
	Cat2(String name){
		this.name=name;
	}
	class Toy{
		String toyName = "mouse";
		Toy(Cat2 cat, String toyName){
		name = cat.name;
		this.toyName= toyName;
		}
	}
	void startPlaying(String toyName){
		Cat2.Toy toy = this.new Toy(this, toyName);
		System.out.println(this.name + " plays with a "+toy.toyName);
	}
}
