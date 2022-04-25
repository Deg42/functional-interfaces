package es.fpdual.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diner {
    String name;
    double amount;
    int table;
}
