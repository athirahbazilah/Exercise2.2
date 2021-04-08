package AnimalFile;

public class Animal {
	
	String breed, colour, size;
	char gender;
	int leg, quantity, times;
	double weight, food;
	
	void printFeat(String b, String c, String s, char g, int l, double w) {
		
		System.out.println("Breed: " + b);
		System.out.println("Colour: " + c);
		System.out.println("Size: " + s);
		System.out.println("Number of Legs: " + l);
		System.out.println("Weight: " + w + " kg");
		
	}
	
	void calcTotalLeg(int l, int q) {
		
		int tl = l * q;
		System.out.println("Total of the legs base on the quantity: " + tl);
	}
	
	void TotalWeight(double w, int q) {
		
		double tw = w * q;
		System.out.println("Total weight: " + tw + "kg");
	}
	
	void TotalFood(int q, double f, int t) {
		
		double tf = (q * f)/t;
		System.out.println("Total food needed every meal time: " + tf + "g");
	}

}
