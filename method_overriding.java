package anudip;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

// Subclass Dog 
class Dog extends Animal {

	void makeSound() {
		System.out.println("Dog barks");
	}
}

// Subclass Cat 
class Cat extends Animal {

	void makeSound() {
		System.out.println("Cat meows");
	}

}

public class method_overriding {

	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myDog.makeSound();
		myCat.makeSound();

	}

}
