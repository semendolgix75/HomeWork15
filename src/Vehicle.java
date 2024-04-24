public abstract class Vehicle {
    private String modelName;       //Заменил public не соответствует принципу инкапсуляции
    private int wheelsCount;        //Заменил public не соответствует принципу инкапсуляции

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


}
