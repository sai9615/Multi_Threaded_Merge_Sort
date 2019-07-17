
package studentCoursesBackup.driver;

import  studentCoursesBackup.util.Results;
import  studentCoursesBackup.util.MyLogger;
import  studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Heapsort;

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
		int n = Integer.parseInt(args[0]);
		if(n > 3 || n < 1){
			System.out.println("The value of N can only be between 1 and 3");
			System.exit(0);
		}

	    if ( (args.length != n+3) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")|| args[3].equals("${arg3}")|| args[4].equals("${arg4}")|| args[5].equals("${arg5}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts"+ (n+3) +" argumnets.");
		    System.exit(0);
	    } // end of if

		String inputf = args[0];
	    String deletef = args[1];
		String outputf1 = args[2];
		String outputf2 = args[3];
		String outputf3 = args[4];
		String Debug = args[5];

		MyLogger obj = new MyLogger();

		int dbglvl = Integer.parseInt(Debug);
		if(dbglvl <0 || dbglvl > 4){
			System.out.println("Enter proper dbg option from 1 to 4 \n");
			System.out.println("0:RELEASE, 1:SHOW ERROR IF ENCOUNTERED, 2:SHOW RESULT TO STDOUT 3:PRINT WHEN CHANGE IN STATE 4:PRINT WHENEVER CONSTRUCTOR IS CALLED \n");
			System.exit(0);
		}
		else {

			obj.setDebugValue(dbglvl);
			System.out.println("debug level set to "+dbglvl);
		}

		String input;
		ArrayList<String> store = new ArrayList<>();
		FileProcessor fp = new FileProcessor(inputf);
		while ((input = fp.readLine()) != null) {
			{
				store.add(input);
			}
		}



		Results res1 = new Results(outputf1);
		res1.writeResults();
		res1.closeMyFile();

	}  // end public static void main
    }  // end public class Driver
