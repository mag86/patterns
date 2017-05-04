package Facade;

/**
 * Created by admin on 04.05.2017.
 */
public class WorkerMaker {
    private Worker detective;
    private Worker inspector;

    public WorkerMaker(){
        detective = new Detective();
        inspector = new Inspector();
    }

    public void doDetectiveJob(){
        detective.doJob();
    }
    public void doInspectorJob(){
        inspector.doJob();
    }

}
