import Enums.Therapeutic_class;

import static Enums.Therapeutic_class.*;

public class Main {
    public static void main(String[] args) {
        Medication med = new Medication();
        System.out.println(med.toString());
        Diuretic coffee = new Diuretic();
        System.out.println(coffee.toString());
        coffee.functional_change = "staying awake late";
        coffee.side_effects = "peeing more";
        System.out.println(coffee.toString());

        coffee.therapeuticClass = Antidepressant;

        Patient Primo = new Patient();
        Primo.setAge(26);
        Primo.setSex("Homme"); //se questo è um uomo
        Primo.setName("Primo Levi");
        System.out.println(Primo.toString());

        // more serious med
        // https://fr.wikipedia.org/wiki/Primo_Levi#D%C3%A9c%C3%A8s
        // name of the antidepressant from Primo Levi: A Life
        Antidepressants Trittico = new Antidepressants();
        Trittico.functional_change = "relieve symptoms of depressions";
        Trittico.side_effects = "Can induce Dizziness";


        Nurse Lucia = new Nurse();
        Lucia.setName("Lucia Morpurgo");
        Lucia.setAge(24);
        Lucia.gavePrescription(Primo, coffee);
        Lucia.gavePrescription(Primo, Trittico);

        System.out.println(Primo.getTreatment());


    }
}

