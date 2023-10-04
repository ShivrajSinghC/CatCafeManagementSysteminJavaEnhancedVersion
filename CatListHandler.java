import java.util.ArrayList;

public class CatListHandler {
	 private ArrayList<Cat> catList;

	    public CatListHandler() {
	        this.catList = new ArrayList<Cat>();
	    }

	    public CatListHandler(Cat[] cats) {
	        this.catList = new ArrayList<Cat>();

	        for (Cat cat : cats) {
	            this.catList.add(cat);
	        }
	    }

	    public boolean addCat(String name, String breed, int age) {
	        for (Cat cat : this.catList) {
	            if (cat.getName().equals(name)) {
	                return false;
	            }
	        }

	        Cat newCat = new Cat(name, breed, age);
	        this.catList.add(newCat);
	        return true;
	    }

	    public boolean removeCat(String name) {
	        for (Cat cat : this.catList) {
	            if (cat.getName().equals(name)) {
	                this.catList.remove(cat);
	                return true;
	            }
	        }

	        return false;
	    }

	    public String getAllCats() {
	        StringBuilder catListString = new StringBuilder();

	        for (Cat cat : this.catList) {
	            catListString.append(String.format("%s %s %d\n", cat.getName(), cat.getBreed(), cat.getAge()));
	        }

	        return catListString.toString();
	    }

	    public String getCatCount() {
	        return String.format("Number of cats in the cafe: %d", this.catList.size());
	    }
}
