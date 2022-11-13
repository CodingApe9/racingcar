import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private String name;
    private int numberOfAttempts, Location;

    public Car(String name, int numberOfAttempts) {
        this.name = name;
        this.numberOfAttempts = numberOfAttempts;
        Location = 0;
    }

    public void forwarding(int n){
        Location+=(n>=4)? 1: 0;
    }

    public void printLocation(){
        System.out.println(name+": "+Location);
    }

    public int getLocation(){
        return Location;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", numberOfAttempts=" + numberOfAttempts +
                '}';
    }
}
