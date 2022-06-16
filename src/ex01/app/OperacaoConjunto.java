package ex01.app;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class OperacaoConjunto {

	public static void main(String[] args) {

		// It would be linked set or hash set too!
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("The union between \"a\" and \"c\" is: " + c);

		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Retaing valeus between \"a\" and \"d\": " + d);

		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Removing all value of \"b\" from \"a\": " + e);

	}

}
