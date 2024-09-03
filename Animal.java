// Q No: 01 Animal Kingdom
class Animal{
	public String makeSound(){
        return "The Animal Sound";
	}
}
class Dog extends Animal{
	public String makeSound(){
		return "The Dog Sound is Bahu Bahu";
	}
}
class Cat extends Animal{
	public String makeSound(){
		return "The Cat Sound is Meow Meow";
	}
}
class Bird extends Animal{
	public String makeSound(){
		return "The Bird Sound is kikh kikh";
	}
}
public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound();
		
		Animal dog = new Dog();
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
		
		Animal bird = new Bird();
		bird.makeSound();
		
		Animal animals[] = new Animal[4];
		animals[0] = animal;
		animals[1] = dog;
		animals[2] = cat;
		animals[3] = bird;
		for (int i =0;i<animals.length;i++){
			System.out.println(animals[i].makeSound());
		}
	}
}