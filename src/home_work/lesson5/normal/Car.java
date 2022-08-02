package home_work.lesson5.normal;

public class Car {

    private String mark;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Марка = " + mark + '\n' +
                "Класс = " + carClass + '\n' +
                "Вес = " + weight + '\n' +
                "Водитель : " + driver + '\n' +
                "Двигатель : " + engine;

    }


}
