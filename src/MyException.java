public class MyException extends Exception{

/**
*
*/
//private static final long serialVersionUID = 1L;
MyException(){
super();
System.out.println("Empty constructor");
}
MyException(String message){
super(message);
System.out.println("Message constructor");
}
MyException(Cat cat){
super(cat.name);
System.out.println("Cat " + cat.name + " constructor");
}

}