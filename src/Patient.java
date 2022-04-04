import java.util.*;

public class Patient extends Human{
    // list of effects of med
    public List<Medication> treatment = new ArrayList<>();

    public List<Medication> getTreatment() {
        return treatment;
    }
    public String seeTreatment(){
        String treatment_string = "";

        for (int i = 0; i < treatment.size() ; i++) {
            treatment_string += treatment.get(i).getSide_effects();
            treatment_string += treatment.get(i).getFunctional_change();

        }

        return treatment_string;
    }
    public void addTreatment(Medication med) {
        treatment.add(med);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + super.getName() + '\'' + // medical secret
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
