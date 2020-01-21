
public class Cat {
	String name = "Murka";
	Cat(){}
	Cat(String name){
		this.name=name;
	}
	static class Toy{
		private Cat cat;
		String toyname = "mouse";
		Toy(Cat cat, String toyname){
			this.cat = cat;
			this.toyname= toyname;
		}
	}
	void startPlaying(String toyName){
		Cat.Toy toy = new Cat.Toy(this, toyName);
		System.out.println(this.name + " plays with a "+toy.toyname);
	}
}
