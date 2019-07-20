package multiThreadedHS.driver;

import  multiThreadedHS.util.Results;
import  multiThreadedHS.util.MyLogger;
import  multiThreadedHS.util.FileProcessor;
import  multiThreadedHS.util.MergeSort;
import  multiThreadedHS.threads.ThreadWorker;


import java.util.ArrayList;

/**
 * @author AuthorName
 *
 */
    
    public class Driver {
	
	public static void main(String[] args) {
	    
	    /*
	     * As the build.xml specifies the arguments as argX, in case the
	     * argument value is not given java takes the default value specified in
	     * build.xml. To avoid that, below condition is used
	     */

	    // FIXME: update this if statement for this assignment

	   	String inputf1;
		String inputf2;
		String inputf3;
		String output;
		String Debug;

		int n = Integer.parseInt(args[0]);
		if(n > 3 || n < 1){
			System.out.println("The value of N can only be between 1 and 3");
			System.exit(0);
		}

	    if ( (args.length != n+3) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")|| args[3].equals("${arg3}")|| args[4].equals("${arg4}")|| args[5].equals("${arg5}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts"+ (n+3) +" argumnets.");
		    System.exit(0);
	    } // end of if
		
	}  // end public static void main
    }  // end public class Driver
