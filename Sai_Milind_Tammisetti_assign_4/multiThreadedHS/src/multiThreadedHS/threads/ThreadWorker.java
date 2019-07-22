package multiThreadedHS.threads;

import  multiThreadedHS.util.Results;
import  multiThreadedHS.util.FileProcessor;
import java.util.ArrayList;
import  multiThreadedHS.util.MyLogger;

public class ThreadWorker extends Thread{

    public String filename;
    public Results res;
    public  ThreadWorker(String fname, Results results){
    MyLogger.writeMessage("In constructor "+ getClass().getName(), MyLogger.DebugLevel.CONSTRUCTOR);
    filename = fname;
    res = results;
    }

    public void run() {
        String input;
        ArrayList<String> store = new ArrayList<>();
        FileProcessor fp = new FileProcessor(filename);
        while ((input = fp.readLine()) != null) {
            {
                store.add(input);
            }
        }
        this.bubbleSort(store);
        synchronized (res) {
            for (int i = 0; i < store.size(); i++) {
                res.storeResult(store.get(i));
            }
        }
    }

    public void bubbleSort(ArrayList<String> arr){
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
                temp.add(Integer.parseInt(arr.get(i)));
            }
        for (int i = 0; i < temp.size() -1; i++) {
            for (int j = 0; j < temp.size() - i - 1; j++) {
                int elem1 = temp.get(j);
                int elem2 = temp.get(j+1);
                if ( elem1 > elem2) {
                        int tmp = temp.get(j);
                        temp.set(j, elem2);
                        temp.set(j + 1, tmp);
                    }
                }
            }
        for (int i = 0; i < temp.size(); i++) {
                //   System.out.println(temp.get(i));
                arr.set(i, Integer.toString(temp.get(i)));
            }
    }
}