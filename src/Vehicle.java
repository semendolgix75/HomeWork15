public abstract class Vehicle implements Serviceable {
    private final String modelName;       //Заменил public не соответствует принципу инкапсуляции
    private final int  wheelsCount;        //Заменил public не соответствует принципу инкапсуляции

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    public void check() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Обслуживаем колеса");
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
        public void updateTyre() {
            System.out.println("Меняем покрышку");

        }
    }