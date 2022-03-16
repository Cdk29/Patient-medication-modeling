public class Medication {
    public String side_effects = "death, usually";
    public String functional_change = "death, usually";

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    public String getFunctional_change() {
        return functional_change;
    }

    public void setFunctional_change(String functional_change) {
        this.functional_change = functional_change;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "side_effects='" + side_effects + '\'' +
                ", functional_change='" + functional_change + '\'' +
                '}';
    }

}
