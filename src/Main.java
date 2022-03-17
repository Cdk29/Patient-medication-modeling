public class Main {
    public static void main(String[] args) {
        Medication med = new Medication();
        System.out.println(med.toString());
        Diuretic coffee = new Diuretic();
        System.out.println(coffee.toString());
        coffee.functional_change = "staying awake late";
        coffee.side_effects = "peeing more";
        System.out.println(coffee.toString());

    }
}

