package es.fpdual.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import es.fpdual.model.Player;

public class PlayerEvaluator {
    public List<Player> evaluate(List<Player> playerList, Predicate<Player> eval) {
        List<Player> newList = new ArrayList<>();

        for (Player player : playerList) {
            if (eval.test(player))
                newList.add(player);
        }

        return newList;
    }
}
