package AnimalFile;

public class Main {

	public static void main(String[] args) {
		
		Animal Bird = new Animal();
		Animal Cat = new Animal();
		Animal Dog = new Animal();
		Animal Chicken = new Animal();
		
		System.out.println("BIRD FEATURES");
		Bird.printFeat(" Amazon Parrot", "Green", "Medium", 'F', 2, 1.2);
		Bird.calcTotalLeg(2, 4);
		Bird.TotalWeight(1.2, 4);
		Bird.TotalFood(4, 50, 3);
		System.out.println();
		
		System.out.println("CAT FEATURES");
		Cat.printFeat("Persian", "Grey", "Large", 'M', 4, 5.4);
		Cat.calcTotalLeg(4, 5);
		Cat.TotalWeight(5.4, 5);
		Cat.TotalFood(5, 200, 4);
		System.out.println();
		
		System.out.println("DOG FEATURES");
		Dog.printFeat("Bulldog", "Black", "Large", 'M', 4, 23.3);
		Dog.calcTotalLeg(4, 3);
		Dog.TotalWeight(23.3, 3);
		Dog.TotalFood(3, 250, 2);
		System.out.println();
		
		System.out.println("CHICKEN FEATURES");
		Chicken.printFeat("Leghorn", "White", "Small", 'F', 2, 2.2);
		Chicken.calcTotalLeg(2, 6);
		Chicken.TotalWeight(2.2, 6);
		Chicken.TotalFood(6, 100, 5);
		System.out.println();
		
		
		

	}

}
