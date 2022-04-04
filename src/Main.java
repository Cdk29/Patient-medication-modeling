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

        Patient Primo = new Patient();
        Primo.setAge(26);
        Primo.setSex("Homme"); //se questo è um uomo
        Primo.setName("Primo Levi");
        System.out.println(Primo.toString());

        //List<Medication> treatment = new ArrayList<>();
        //treatment.add(coffee);
        //Primo.treatment = treatment;
        //Primo.addTreatment(coffee);
        //Primo.addTreatment(coffee);
        //Primo.addTreatment(coffee);
        //treatment.forEach(System.out::println);
        //Primo.getTreatment().forEach(System.out::println);
        // System.out.println(Primo.seeTreatment());
        //System.out.println(Primo.getTreatment());
        // for loop
        //for (int i = 0; i < Primo.getTreatment().size() ; i++) {
        //    System.out.println(Primo.treatment.get(i).getSide_effects());
        //    System.out.println(Primo.treatment.get(i).getFunctional_change());

        //}

        //System.out.println(Primo.treatment.get(0).getSide_effects());

        Nurse Lucia = new Nurse();
        Lucia.setName("Lucia Morpurgo");
        Lucia.setAge(24);
        Lucia.gavePrescription(Primo, coffee);
        System.out.println(Primo.getTreatment());
    }
}

