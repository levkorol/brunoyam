package home_work.lesson5.normal;

public class Driver {

    private String fio;
    private int drivingExperience;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "ФИО = " + fio + '\'' +
                ", стаж вождения = " + drivingExperience;

    }
}
