package VehicleCatalogue;

import java.util.Arrays;

public class Vehicle {

// класа отдолу
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {           // конструктор
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }


    @Override
    public String toString() {
        String result = String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                this.type, this.model, this.color, this.horsePower);
        return result;
    }

    public String getType() {
        return this.type;
    }
}
