import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medication med = new Medication();
        System.out.println(med.toString());
        Diuretic coffee = new Diuretic();
        System.out.println(coffee.toString());
        coffee.functional_change = "staying awake late";
        coffee.side_effects = "peeing more";
        System.out.println(coffee.toString());

        Patient Primo_levi = new Patient();
        Primo_levi.setAge(28);
        Primo_levi.setSex("Homme"); //se questo è um uomo
        Primo_levi.setName("Primo Levi");
        System.out.println(Primo_levi.toString());

        //List<Medication> treatment = new ArrayList<>();
        //treatment.add(coffee);
        //Primo_levi.treatment = treatment;
        Primo_levi.addTreatment(coffee);
        Primo_levi.addTreatment(coffee);
        Primo_levi.addTreatment(coffee);
        //treatment.forEach(System.out::println);
        //Primo_levi.getTreatment().forEach(System.out::println);
        // System.out.println(Primo_levi.seeTreatment());
        System.out.println(Primo_levi.getTreatment());
        // for loop
        for (int i = 0; i < Primo_levi.getTreatment().size() ; i++) {
            System.out.println(Primo_levi.treatment.get(i).getSide_effects());
            System.out.println(Primo_levi.treatment.get(i).getFunctional_change());

        }

        //System.out.println(Primo_levi.treatment.get(0).getSide_effects());
    }
}

