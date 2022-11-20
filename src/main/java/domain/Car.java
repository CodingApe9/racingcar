package domain;

import infrastructure.Rand;

import java.util.function.Predicate;

public class Car {
    private String carName;
    private int nowLocation;

    public Car(String carName) {
        this.carName = carName;
        nowLocation = 0;
    }
    
    public void go(int num) {
        this.nowLocation+=num;
    }

    public String getCarName() {
        return carName;
    }

    public int getNowLocation() {
        return nowLocation;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", nowLocation=" + nowLocation +
                '}';
    }
}
