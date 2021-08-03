package org.example;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        String engine = "2.0 triple turbo 15949 hp";
        List<String> wheels = Arrays.asList("front left", "front right", "rear left", "rear right");
        // тут создается массив ламп. Я добавил поле, отображающее позицию - передняя левая / правая.
        List<Lamp> lamps = Arrays.asList(new Lamp(Lamp.CLEAN, Lamp.FRONT_LEFT), new Lamp(Lamp.DIRTY, Lamp.FRONT_RIGHT));
        //todo: сделать дилера машин. В зависимости от цены, года и пробега дилер выдает машину.
        // Чем выше цена, тем круче двигатель и чище фары, лол
        // (создать новый класс CarDealer с функцией getCar();)
        // После приобретения автомобиля необходимо
        // Car car = carDealer.getCar(price, year, mileage);
        Car car = new Car(engine, wheels, lamps);
        System.out.println(car.getDescription());
        System.out.println(car.getDescription());
        System.out.println(car.getDescription());
        System.out.println(car.getDescription());
        Car car2 = new Car(engine, wheels, lamps);
        List<Lamp> snatchedLamps = car.snatchLamps();
        for (Lamp lamp: snatchedLamps) {
            if (lamp.isDirty()) {
                System.out.println("Prepare to clean " + lamp.getPosition());
                lamp.cleanLamp();
                System.out.println("Cleaned " + lamp.getPosition());
            }
        }

    }
}