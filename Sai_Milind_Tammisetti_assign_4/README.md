# CSX42: Assignment 4
## Name: Sai Milind Tammisetti

-----------------------------------------------------------------------
-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in multiThreadedHS/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: 
ant -buildfile multiThreadedHS/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile multiThreadedHS/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: 
ant -buildfile multiThreadedHS/src/build.xml run -Dargs='3 input1.txt input2.txt input3.txt output.txt 3'

Example:

The last argument is the Logger value. 
ant -buildfile multiThreadedHS/src/build.xml run -Dargs='3 input1.txt input2.txt input3.txt output.txt 3'

set the debugger value to 3 in order to ensure that all threads ran.
The output for which should be something like this, Thread 12 is alive: false
The output basically contains the thread id and shows whether the thread is alive or not.
If the thread is not alive means the program has completed successfully and the thread has done it job, but 
if the thread is still alive after join method means the thread was still running and there might be some error
due to which the thread was still alive and couldn't complete it's task. 


-----------------------------------------------------------------------
## Description:
I have used array list as my data structure to store the values that will be read by each thread from the 
input text file and also to store the sorted values of each thread in result.java I had used arraylist. In order 
to synchronize the threads I had called synchronize method on result object which will be passed to the threadworker 
constructor by every thread that will be created. I have passed the same instance of result across all the threads and 
had also made use of join method to ensure that a thread waits for the other thread until that thread completes it's 
execution.    

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense."

Date: 07/22/2019 


