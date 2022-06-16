package ex01.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CompareHashTreeLinkedSET {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// using hash set mode
		Set<String> hashSet = new HashSet<>(); // using hash set it is faster, but it do not guarantee the order of
												// items. Compare the order at code and at printing terminal mode.
		System.out.println("List of product (Hash):");

		hashSet.add("TV");
		hashSet.add("Tablet");
		hashSet.add("Notebook");

		for (String p : hashSet) {
			System.out.println(p);
		}

		System.out.print("\nEnter the name of product to search: ");
		String p = sc.next();
		System.out.println("\nDo this list contain " + p + "? " + hashSet.contains(p));

		// Now, using tree set mode
		Set<String> tree = new TreeSet<>(); // using tree set it is not so faster, but it guarantee the order of items
											// by letters. Compare the order at code and at printing terminal mode.
		System.out.println("\nList of product (Tree):");

		tree.add("TV");
		tree.add("Tablet");
		tree.add("Notebook");

		for (String t : tree) {
			System.out.println(t);
		}

		System.out.print("\nEnter the name of product to search: ");
		String t = sc.next();
		System.out.println("\nDo this list contain " + t + "? " + tree.contains(t));

		// Pay attention: the upper case V (of TV), has priority than low case a (of
		// Tablet). So, TV is first than Tablet

		// Now, using linked set mode
		Set<String> link = new LinkedHashSet<>(); // using linked hash set it a middle case between hash and tree. It
													// guarantee the order of items. Compare the order at code and at
													// printing terminal mode.
		System.out.println("\nList of product (linked):");

		link.add("TV");
		link.add("Tablet");
		link.add("Notebook");

		for (String l : link) {
			System.out.println(l);
		}

		System.out.print("\nEnter the name of product to search: ");
		String l = sc.next();
		System.out.println("\nDo this list contain " + l + "? " + link.contains(l));

		System.out.println("\nRemoving item " + l);
		link.remove(l);

		for (String r : link) {
			System.out.println(r);
		}

		System.out.println("\nRemoving item when the second char is letter \"o\"");
		link.removeIf(x -> x.charAt(1) == 'o');
		
		for (String r : link) {
			System.out.println(r);
		}
		
		sc.close();
	}
}