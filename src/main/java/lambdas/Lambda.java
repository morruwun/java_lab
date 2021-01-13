package lambdas;
import human.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.ofNullable;

public class Lambda {
    public static int FindAllSoldiersByType(Collection<Soldier> soldier, String soldierType){
        return soldier
                .stream()
                .filter(c -> c.getSoldierType().equals(soldierType))
                .mapToInt(Soldier::getAmount)
                .sum();
    }
    public static Soldier FindSoldiersWithTheBiggestAmount(Collection<Soldier> soldier) {
        return soldier
                .stream()
                .max(Comparator.comparing(Soldier::getAmount))
                .orElseThrow(NoSuchElementException::new);
    }
    public static Stream<Double> GetAverageAmountOfSoldiers(Collection<Soldier> soldier) {
        return ofNullable(soldier)
                .map(s->soldier.stream()
                        .mapToInt(Soldier::getAmount)
                        .average().orElse(0.0)
                );
    }
    public static Map<Boolean, List<Government>> partitionByCondition(ArrayList<Government> government, String name, String surname) {
        return government
                .stream()
                .collect(Collectors.partitioningBy(m -> m.getName().equals(name) && m.getSurname().equals(surname)));
    }
}
