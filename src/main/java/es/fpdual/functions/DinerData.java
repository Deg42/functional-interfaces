package es.fpdual.functions;

import java.util.function.Function;

import es.fpdual.model.Diner;

public class DinerData {

    public static void main(String[] args) {
        Diner diner1 = new Diner("Juan", 257.3, 9);
        String dinerName = (String) getDinerData(diner1, x -> x.getName());
        int dinerTable = (int) getDinerData(diner1, x -> x.getTable());

        System.out.println("Diner name is: " + dinerName);
        System.out.println("Diner table is: " + dinerTable);
    }

    public static Object getDinerData(
            Diner diner, Function<Diner, Object> func) {
        return func.apply(diner);
    }
}
