public class Experiment {
    private String name = "ABC";
    private int temperature = 10;

    private int qtdChemical = 2;

    public void raiseTemperature() {
        System.out.println("Experiment [ Name: "+name+
                ", Temperature: " + temperature +" ] Temperature");
    }
    public void applyChemical() {
        System.out.println("Experiment [ Name: "+name+
                ", Quantity Chemical: " + qtdChemical +" ] Chemical");
    }

}
