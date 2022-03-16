public class Medication {
    public String side_effects = "death, usually";

    public String getSide_effects() {
        return side_effects;
    }

    public void setSide_effects(String side_effects) {
        this.side_effects = side_effects;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "side_effects='" + side_effects + '\'' +
                '}';
    }
}
