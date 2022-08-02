package home_work.lesson5.normal;

/**
 * Создать класс Car, Engine и Driver.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 * Класс Engine содержит поля - мощность, производитель.
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 * "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 * А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver();

        Engine engine = new Engine();

        setTestFields(car, driver, engine);

        System.out.println(car);

    }

    static void setTestFields(Car car, Driver driver, Engine engine) {
        driver.setFio("Иванов Иван Иванович");
        driver.setDrivingExperience(10);

        engine.setPower(45);
        engine.setProductivity(55);

        car.setMark("УА");
        car.setCarClass("S");
        car.setWeight(234.0);
        car.setDriver(driver);
        car.setEngine(engine);
    }
}
