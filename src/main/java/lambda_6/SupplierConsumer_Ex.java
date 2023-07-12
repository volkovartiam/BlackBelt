package lambda_6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumer_Ex {

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(
                () -> new Car("Nissan", "Black", 1.6) );
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> car.color = "W hite");
        System.out.println(ourCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> supplier){
        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }

}
