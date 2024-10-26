package aston.home.work;

import java.util.ArrayList;
import java.util.List;

public class Arhiv {
    private static List<Evuluation> evaluations = new ArrayList<>();

    private Arhiv() {
    }

    public static List<Evuluation> getEvaluations() {
        return evaluations;
    }

    public static void addEvaluationToArchive (Evuluation evaluation){
        evaluations.add(evaluation);
    }
}
