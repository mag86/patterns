package Facade;

/**
 * Created by admin on 04.05.2017.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        WorkerMaker workerMaker = new WorkerMaker();
        workerMaker.doDetectiveJob();
        workerMaker.doInspectorJob();
    }


}
