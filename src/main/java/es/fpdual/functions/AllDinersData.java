package es.fpdual.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import es.fpdual.model.Diner;

public class AllDinersData {

    public static void main(String[] args) {
        List<Diner> dinerList = Arrays.asList(
                new Diner("Pepe", 27.2, 5),
                new Diner("Laura", 74.8, 2),
                new Diner("Francisco", 8, 14),
                new Diner("Pablo", 14.1, 4),
                new Diner("Antonio", 36, 6));

        List<Object> dinersName = getAllDinersData(dinerList, x -> x.getName());

        System.out.println("Diners name: ");
        for (Object name : dinersName) {
            System.out.println("Name: " + name);
        }

        List<Object> dinersAmount = getAllDinersData(dinerList, x -> x.getAmount());

        System.out.println("Diners amount: ");
        for (Object amount : dinersAmount) {
            System.out.println("Amount: " + amount);
        }
    }

    public static List<Object> getAllDinersData(List<Diner> dinerList, Function<Diner, Object> func) {
        // This list contains customized diner data
        List<Object> dataList = new ArrayList<>();

        // Iterates over diner list param
        for (Diner diner : dinerList) {
            dataList.add(func.apply(diner));
        }

        return dataList;
    }
}
