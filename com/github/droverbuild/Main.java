package com.github.droverbuild;

public class Main {

    public static void main(String[] args) {
	    long startTime = System.currentTimeMillis();

	    long index = 0;

	    while (true) {
//		    double sqrt = Math.sqrt(index);
//
//		    if (sqrt % 1 == 0){
//			    System.out.println("sqrt(" + index + ") = " + sqrt);
//		    }

		    factors(index);

		    index++;

		    if (System.currentTimeMillis() - startTime >= 1000L){
			    break;
		    }
	    }

	    System.out.println("Number of loops: " + index);
    }

    public static void factors(long number){
	    System.out.println("Factors of " + number);

	    long half = number / 2;

	    for(long i = 1; i <= half; i++){
		    if(number % i == 0){
			    System.out.println(" - " + i);
		    }
	    }

	    System.out.println(" - " + number);
    }
}
