package com.daxiafreeman.demoforoffer.demoforoffer;
/**
 * Divisible games
 * @author zhujj
 */
public class ExactdivisionUntil {

	public ExactdivisionUntil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <p>
	 * 1-100
	 * Condition 1 multiples of three print "Fizz".
	 * Condition 2 multiples of five print "Buzz".
	 * Condition 3 multiples both of five and three print "FizzBuzz".
	 * </P>
	 */
    public static int doExactdivision() {
    	int i = 0;
    	do {
    		i++;
    		if(i%3==0&&i%5==0) {
    			System.out.println("FizzBuzz");
    		}else if(i%3==0&&!(i%5==0)){
    			System.out.println("Fizz");
    		}else if(!(i%3==0)&&i%5==0){
    			System.out.println("Buzz");
    		}else {
    			System.out.println(i);
    		}
    	}while(i<100);
    	return i;
    }
    /**
	 * <p>
	 * Condition 1 A number is Fizz if it is divisble by 3 or it has a 3 int it.
	 * Condition 2 A number is Buzz if it is divisble by 5 or it has a 5 int it.
	 * Condition 3 A number is FizzBuzz if it satisfy above 2 criterias together.
	 * </P>
	 * @return i
	 */
    public static int doExactdivisionAddRequirements() {
    	int i = 0;
    	String a = null;
    	//Condition 1
    	boolean blOne =false;
    	//Condition 3
    	boolean blTwo =false;
    	//Condition 4
    	boolean blThree =false;
    	do {
    		i++;
    		a = String.valueOf(i);
    		blOne = (i%3==0||a.indexOf("3")>0)&&!(i%5==0||a.indexOf("5")>0);
    		blTwo = !(i%3==0||a.indexOf("3")>0)&&(i%5==0||a.indexOf("5")>0);
    		blThree= (i%3==0||a.indexOf("3")>0)&&(i%5==0||a.indexOf("5")>0);
    		if(blOne) {
    			System.out.println("Fizz");
    		}else if(blTwo){
    			System.out.println("Buzz");
    		}else if(blThree){
    			System.out.println("FizzBuzz");
    		}else {
    			System.out.println(i);
    		}
    	}while(i<100);
    	return i;
    } 
}
