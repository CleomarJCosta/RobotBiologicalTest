import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<RobotAction> robotActionList = new ArrayList<>();

    public void takeExperiment(RobotAction robotAction){
        robotActionList.add(robotAction);
    }
    public void placeExperiments(){
        for(RobotAction robotAction : robotActionList ){
            robotAction.execute();
        }
        robotActionList.clear();
    }
}
