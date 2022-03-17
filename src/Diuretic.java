public class Diuretic extends Medication {
    public String functional_change = "death, usually";

    @Override
    public String getFunctional_change() {
        return functional_change;
    }

    @Override
    public void setFunctional_change(String functional_change) {
        this.functional_change = functional_change;
    }

    @Override
    public String toString() {
        return "Diuretic{" +
                "side_effects='" + side_effects + '\'' +
                ", functional_change='" + functional_change + '\'' +
                '}';
    }
}
