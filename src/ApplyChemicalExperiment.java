public class ApplyChemicalExperiment implements RobotAction{
    private Experiment abcExperiment;

    public ApplyChemicalExperiment(Experiment abcExperiment) {
        this.abcExperiment = abcExperiment;
    }

    @Override
    public void execute() {
        abcExperiment.applyChemical();
    }
}
