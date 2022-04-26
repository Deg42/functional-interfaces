package es.fpdual.biconsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiconsumerMain {
    public static void main(String[] args) {
        BiConsumer<Double, Double> bicons = (num1, num2) -> System.out.println(num1 * num2);
        bicons.accept(10.1, 7.2);

        Map<String, String> map = new HashMap<>();
        String[][] persons = { { "Pepillo", "Moroco" }, { "Chris", "USA" }, { "Raju", "India" }, { "Lynda", "Canada" },
                { "Juan", "Spain" } };

        for (int i = 0; i < persons.length; i++) {
            map.put(persons[i][0], persons[i][1]);
        }

        System.out.println("Traditional method to print map: ");

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if (iter != null) {
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                System.out.println("Key: " + entry.getKey() + "\t" + "Value: " + entry.getValue());
            }
        }

        System.out.println("Using BiConsumer and lambda: ");

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + "\t" + "Value: " + value);
        });

    }
}
