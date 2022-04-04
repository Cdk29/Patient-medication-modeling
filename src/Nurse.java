public class Nurse extends Human {
    // Nurse have public name if not patient
    public String name = super.getName();

    // method that take as input a patient and a medication (all med will be accepted by inheritance
    // add something to the patient, in a list
    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
