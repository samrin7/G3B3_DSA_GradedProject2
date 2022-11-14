package SkyScraper;

public class Main {
	public static void main(String[] args) {

		DriverClass ProjectSkyScraper = new DriverClass();

		int size = ProjectSkyScraper.GetUserInput();

		if (size > 0) {

			ProjectSkyScraper.insert(size);
			ProjectSkyScraper.ConstructionOrder(size);
		} else {
			System.out.println("Total no of floors Can't be Zero or can't be Negative !!");
		}

	}

}
