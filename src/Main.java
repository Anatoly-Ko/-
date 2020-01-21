
public class Main {

	public static void main(String[] args) {
	AbstractCatClass abCat = new AbstractCatClass("Lala"){
		void startPlaying (String toyName){
			System.out.println(this.name + " plays with a "+toyName);
		}
	};
	abCat.startPlaying("dfghjkl");
			
	}
}


