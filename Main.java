package VehicleCatalogue;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);


            if ("car".equals(type)) {
                Vehicle vehicle = new Vehicle("Car", model, color, horsepower);
                vehicles.add(vehicle);
            } else {
                Vehicle vehicle = new Vehicle("Truck", model, color, horsepower);
                vehicles.add(vehicle);
            }
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                    break;
                }
            }
            model = scanner.nextLine();
        }

        double carHP = printHorsePower(vehicles, "Car");
        System.out.println(String.format("Cars have average horsepower of: %.2f.", carHP));
        double truckHP = printHorsePower(vehicles, "Truck");
        System.out.println(String.format("Trucks have average horsepower of: %.2f.", truckHP));
    }

        public static double printHorsePower(ArrayList<Vehicle> vehicles, String type) {
            double sum = 0.0;
            int counter = 0;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getType().equals(type)) {
                    sum += vehicle.getHorsePower();
                    counter++;
                }
            }
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }
}