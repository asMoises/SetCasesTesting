package ex02.app;

import java.util.HashSet;
import java.util.Set;

import ex02.entities.Product;

public class HashSetComparing {

	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();

		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.00));

		Product prod = new Product("Notebook", 1200.0);

		System.out.println(set.contains(prod));

		// When the class product does not implement hash code and equals methods, the
		// comparation will be made by reference at memory. In this case, these methods
		// are implemented, so, the comparation was made by methods.
		
		for (Product p : set) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
	}
}
