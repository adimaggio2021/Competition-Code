/* Objects Practice - Advent of Code Day 4 Adaptation
 * AP CS 2018
 */

import java.util.*;
import java.io.*;

public class AoCDay4{
    public static ArrayList<Guard> guards = new ArrayList<Guard>();

    public static Guard getGuard(int num){
    	for(Guard curguard : guards) {
    		if(curguard.getNumber() == num) {
    			return curguard;
    		}
    	}
    	return null;
    }

    public static void addGuard(int num, int start, int end){
	Shift s = new Shift(start, end);
	guards.add(new Guard(num,s));
	// creates a Guard object with given numb and shift object
	// adds the new Guard to the guards ArrayList
    }
    
    public static void main(String[] args){
	try{
		
	    Scanner in = new Scanner(new File("Input.txt"));
	    int [] ary = new int[3];
	    Guard one = null;
	    while(in.hasNext()) {
	    	//3 lines at a time
	    	//create array with guard number at index 0, start at 1, end at 2
	    	ary[0] = Integer.parseInt(in.nextLine().substring(1, 3));
	    	ary[1] = Integer.parseInt(in.nextLine().substring(0, 2));
	    	ary[2] = Integer.parseInt(in.nextLine().substring(0, 2));
	    	if(getGuard(ary[0]) == null) {
	    		//adds new guard if there isnt one with current number
	    		addGuard(ary[0],ary[1],ary[2]);
	    	}else {
	    		//if there is one, add just the new shift to the instance data
	    		getGuard(ary[0]).addShift(new Shift(ary[1],ary[2]));
	    		one = getGuard(ary[0]);
	    	}
	    	
	    }
	    Guard two = one;
	    two.addShift(new Shift(10,20));
	    System.out.println(two.totalHoursAsleep());
	    System.out.println(one.totalHoursAsleep());
	    
	    int max = 0;
	    int guardnum = 0;
	    for(Guard g : guards) {
	    	if(g.totalHoursAsleep() > max) {
	    		//records current max number of minutes and the guard who slept those minutes
	    		max = g.totalHoursAsleep();
	    		guardnum = g.getNumber();
	    	}
	    }
	    //output
	    System.out.println("Guard #" + guardnum + " slept the most with " + max + " minutes.");

	}
	catch(Exception e){
	    System.out.println(e);
	}
    }
}
