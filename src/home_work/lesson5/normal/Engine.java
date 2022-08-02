package home_work.lesson5.normal;

public class Engine {

    private int power;
    private int productivity;

    public void setPower(int power) {
        this.power = power;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    @Override
    public String toString() {
        return "Мощность = " + power + '\'' +
                ", производительность = " + productivity;

    }

}
