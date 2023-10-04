
public class CatListTester {
	public static void main(String[] args) {
        // test addCat
        CatListHandler catList = new CatListHandler();
        System.out.println(catList.addCat("Whiskers", "Persian", 5)); // true
        System.out.println(catList.addCat("Mittens", "Siamese", 3)); // true
        System.out.println(catList.addCat("Whiskers", "British Shorthair", 2)); // false
        
        // test removeCat
        System.out.println(catList.removeCat("Muffin")); // false
        System.out.println(catList.removeCat("Mittens")); // true
        
        // test getAllCats
        System.out.println(catList.getAllCats());
        
        // test getCatCount
        System.out.println();
	}
}
