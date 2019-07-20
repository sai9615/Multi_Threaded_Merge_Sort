package multiThreadedHS.threads;

import  multiThreadedHS.util.Results;
import  multiThreadedHS.util.FileProcessor;
import java.util.ArrayList;

public class ThreadWorker extends Thread{

    public String filename;
    public Results res;
    public  ThreadWorker(String fname, Results results){
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
        synchronized (res) {
            for (int i = 0; i < store.size(); i++) {
                res.storeResult(store.get(i));
            }
        }
    }