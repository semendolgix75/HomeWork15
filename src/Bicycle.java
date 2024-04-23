public class Bicycle {

    public String modelName;       //Заменил public не соответствует принципу инкапсуляции
    public int wheelsCount;        //Заменил public не соответствует принципу инкапсуляции

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}