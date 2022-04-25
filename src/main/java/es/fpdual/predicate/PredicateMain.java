package es.fpdual.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import es.fpdual.model.Player;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (value) -> value > 0;
        PlayerEvaluator evaluator = new PlayerEvaluator();

        System.out.println(predicate.test(123));

        List<Player> playerList = Arrays.asList(
                new Player("Cristiano", 37, 26.52, "Man Red"),
                new Player("Messi", 34, 41, "PSG"),
                new Player("Neymar", 30, 40.8, "PSG"),
                new Player("Casemiro", 30, 10.5, "Real Madrid"));

        System.out.println("Players in PSG: ");
        List<Player> PSGPlayers = evaluator.evaluate(playerList, player -> player.getTeam().equals("PSG"));

        for (Player player : PSGPlayers) {
            System.out.println(player.getName());
        }

        System.out.println("Players that with C: ");
        List<Player> playersStartsC = evaluator.evaluate(playerList, player -> player.getName().startsWith("C"));

        for (Player player : playersStartsC) {
            System.out.println(player.getName());
        }

        System.out.println("Players that earns less than 40M: ");
        List<Player> playersLess40Salary = evaluator.evaluate(playerList, player -> player.getSalary() < 40);

        for (Player player : playersLess40Salary) {
            System.out.println(player.getName());
        }
    }
}
