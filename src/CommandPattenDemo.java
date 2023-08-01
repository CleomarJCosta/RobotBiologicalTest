public class CommandPattenDemo {
    public static void main(String[] args) {
        Experiment abcExperiment = new Experiment();

        ApplyChemicalExperiment applyChemicalExperiment = new ApplyChemicalExperiment(abcExperiment);
        RaiseTemperatureExperiment raiseTemperatureExperiment = new RaiseTemperatureExperiment(abcExperiment);

        Broker broker = new Broker();

        broker.takeExperiment(applyChemicalExperiment);
        broker.takeExperiment(raiseTemperatureExperiment);

        broker.placeExperiments();

    }
}

