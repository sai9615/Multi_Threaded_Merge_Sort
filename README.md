## Name: MULTI THREADED MERGE SORT

-----------------------------------------------------------------------
-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT.
#### Note: build.xml is present in multiThreadedMS/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: 
ant -buildfile multiThreadedMS/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile multiThreadedMS/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: 
ant -buildfile multiThreadedMS/src/build.xml run -Dargs='3 input1.txt input2.txt input3.txt output.txt 3'

Example:

The last argument is the Logger value. 
ant -buildfile multiThreadedMS/src/build.xml run -Dargs='3 input1.txt input2.txt input3.txt output.txt 3'

set the debugger value to 3 in order to check whether all threads ran.
The output for which should be something like this, Thread 12 is alive: false
The output basically contains the thread id and shows whether the thread is alive or not.
If the thread is not alive means the program has completed successfully and the thread has done it job, but 
if the thread is still alive after join method means the thread was still running and there might be some error
due to which the thread was still alive and couldn't complete it's task. 


-----------------------------------------------------------------------
## Description:
The code perfroms the following tasks:

*Reads the command line arguments.
*Creates an instance of Results.
*Creates N threaded Objects (instances of ThreadWorker class) where in we pass the reference to Results in the constructor of each ThreadedWorker.
*Starts the N threaded Objects.
*Calls an instance of the class in util/ package that does merge sort, and pass it an instance of Results so it can access the data that was written by all the threads.
*After the Merge sort is completed, we call a method in Results, via the method in FileDisplayInterface, to write the data stored in Results to output.txt,which would be in non-descreasing order if merge sort succeeded.

I have used array list as my data structure to store the values that will be read by each thread from the 
input text file and also to store the sorted values of each thread in result.java I had used arraylist.
 
The reason I had used arraylist instead of vectors is that because vectors is already synchronized so only one thread
can access the code at a given time whereas arraylist is not synchronized so multiple threads can access the code at 
a given time and this also makes the arraylist operations faster as compared to vectors.  

In order to synchronize the threads I had called synchronize method on result object which will be passed to the threadworker 
constructor by every thread that will be created. I have passed the same instance of result across all the threads and 
had also made use of join method to ensure that a thread waits for the other thread until that thread completes it's 
execution.    

-----------------------------------------------------------------------


