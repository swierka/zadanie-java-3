public class Televisor {
    String brand;
    String model;
    boolean power;

    Televisor(String brand, String model, boolean power){
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    void turnOn(){
        power = true;
    }

    void turnOff (){
        power = false;
    }

    void showStatus(){
        System.out.println(power);
    }
}
