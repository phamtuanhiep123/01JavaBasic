package OOP_Inheritance;

import OOP_Inheritance.Animal.Bird;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Bird bird = animal.new Bird (); 
		bird.fly();
		bird.walk();
	}

}
