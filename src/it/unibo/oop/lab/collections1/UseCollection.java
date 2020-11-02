package it.unibo.oop.lab.collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Iterator;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
	private final static int FIRST_POS = 0;
	private final static int STARTING_INT = 1000;
	private final static int FINISHING_INT = 2000;
	private final static int INTS_TO_ADD_FOR_PERFORMANCE_TEST = 100000;
	private static final int TO_MS = 1_000_000;
    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
    	
    	
    	//1
    	ArrayList<Integer> arr1 = new ArrayList<>();
    	
    	for(int i = STARTING_INT; i <= FINISHING_INT; i++) {
    		arr1.add(i);
    	}
    	
    	//2
    	LinkedList<Integer> LList = new LinkedList<>();
    	LList.addAll(arr1);
    	
    	//3
    	System.out.println("PRIMO = " + arr1.get(FIRST_POS));
    	System.out.println("SECONDO = " + arr1.get(arr1.size() - 1));
    	
    	final int firstElem = arr1.get(FIRST_POS);
    	arr1.set(FIRST_POS, arr1.get(arr1.size() - 1));
    	arr1.set(arr1.size() - 1, firstElem);
    	
    	System.out.println("DOPO  = " + arr1.get(FIRST_POS));
    	
    	System.out.println("PRIMO = " + arr1.get(FIRST_POS));
    	System.out.println("SECONDO = " + arr1.get(arr1.size() - 1));
    	
    	//4
    	for(int n : arr1) {
    		System.out.println(n);
    	}
    	
    	//5
    	long time1 = System.nanoTime();
    	for(int i = 0; i < INTS_TO_ADD_FOR_PERFORMANCE_TEST; i++) {
    		arr1.add(0, i);
    	} 	
    	time1 = System.nanoTime() - time1;
    	System.out.println("Time required to add " + INTS_TO_ADD_FOR_PERFORMANCE_TEST + " to an array list" + " Time: --->" + time1 + "ns (" + time1 / TO_MS + "ms)");
    	
    	long time2 = System.nanoTime();
    	for(int i = 0; i < INTS_TO_ADD_FOR_PERFORMANCE_TEST; i++) {
    		LList.add(0, i);
    	}
    	time2 = System.nanoTime() - time2;
    	System.out.println("Time required to add " + INTS_TO_ADD_FOR_PERFORMANCE_TEST + " to a linked list" + " Time: --->" + time2 + "ns (" + time2 / TO_MS + "ms)");
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
    	long time3 = System.nanoTime();
    	for(int i = 0; i < STARTING_INT; i++) {
    		arr1.get(arr1.size()/2);
    	} 	
    	time3 = System.nanoTime() - time3;
    	System.out.println("Time required to read " + STARTING_INT + " ints from middle of ARRAYLIST" + " Time: --->" + time3 + "ns (" + time3 / TO_MS + "ms)");
    	
    	long time4 = System.nanoTime();
    	for(int i = 0; i < STARTING_INT; i++) {
    		LList.get(arr1.size()/2);
    	}
    	time4 = System.nanoTime() - time4;
    	System.out.println("Time required to read " + STARTING_INT + " ints from middle of LINKEDLIST" + " Time: --->" + time4 + "ns (" + time4 / TO_MS + "ms)");
        /*
         * 
         
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
    	Map<String, Long> continents = new HashMap<>();
    	continents.put("Africa", 1_110_635_000L);
    	continents.put("Americas", 972_005_000L);
    	continents.put("Antarctica", 1_110_635_000L);
    	continents.put("Asia", 4_298_635_000L);
    	continents.put("Africa", 1_110_635_000L);
    	continents.put("Africa", 1_110_635_000L);
    	
    	long totalPopulation = 0;
    	for(long n : continents.values()) {
    		totalPopulation += n;
    	}
    	System.out.print(totalPopulation);
    	
    	
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
