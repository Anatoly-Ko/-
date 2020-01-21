
public abstract class AbstractCatClass {
	String name = "Murka";
	AbstractCatClass(){}
	AbstractCatClass(String name){
		this.name = name;
	}
	abstract void startPlaying (String toyName);
}
