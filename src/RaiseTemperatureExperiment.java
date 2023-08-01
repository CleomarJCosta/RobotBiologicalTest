public class RaiseTemperatureExperiment implements RobotAction{
    private Experiment abcExperiment;

    public RaiseTemperatureExperiment(Experiment abcExperiment) {
        this.abcExperiment = abcExperiment;
    }

    @Override
    public void execute() {
        abcExperiment.raiseTemperature();
    }
}
