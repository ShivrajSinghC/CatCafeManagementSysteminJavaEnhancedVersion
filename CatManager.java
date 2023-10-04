import java.util.Scanner;

public class CatManager {
	  public static void main(String[] args) {
	        CatListHandler catListHandler = new CatListHandler();

	        System.out.println("Welcome to Purrfectly Brewed Cat Cafe!");
	        System.out.println("What would you like to do?");

	        Scanner scanner = new Scanner(System.in);
	        String input = "";

	        while (!input.equals("exit")) {
	            System.out.println("\nType one of the following commands:");
	            System.out.println("- addcat");
	            System.out.println("- removecat");
	            System.out.println("- showallcats");
	            System.out.println("- shownumberofcats");
	            System.out.println("- sortcats");
	            System.out.println("- sortcatsbyage");
	            System.out.println("- exit");

	            input = scanner.nextLine();

	            if (input.equals("addcat")) {
	                System.out.println("Enter the cat's name:");
	                String name = scanner.nextLine();

	                System.out.println("Enter the cat's breed:");
	                String breed = scanner.nextLine();

	                System.out.println("Enter the cat's age:");
	                int age = scanner.nextInt();

	                scanner.nextLine();

	                if (catListHandler.addCat(name, breed, age)) {
	                    System.out.println("Cat added successfully!");
	                } else {
	                    System.out.println("Cat with that name already exists!");
}
}
	        }
	  }
}
	        
	  
	  