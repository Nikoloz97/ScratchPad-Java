// Scanner class = C# stream reader
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Main {

    // This is my sandbox...
    public static void main(String[] args) {

//        ArrayList<String> cars = new ArrayList<String>();
//
//        cars.add("Volvo");
//
//        cars.add("BMW");
//
//        cars.add("Mazda");
//
//
//        System.out.println(cars);
//
//        System.out.println(cars.get(1));
//
//        cars.set(0, "Opel");
//
//        System.out.println(cars.get(0));
//
//        cars.remove(0);
//
//        System.out.println(cars.get(0));
//
//        System.out.println(cars.size());
//
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(String.format("%s is the best car", cars.get(i)));


            IntStream stream = IntStream.range(1,5);

            stream.forEach(System.out::println);



        }



    }