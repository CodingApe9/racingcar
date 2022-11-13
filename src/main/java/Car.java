import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private String name;
    private int Location;

    public Car(String name) {
        this.name = name;
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
                ", Location=" + Location +
                '}';
    }
}
