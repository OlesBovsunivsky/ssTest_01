package entity;

public class Designer extends Employer {

    private double effectivnessCoefficient;

    public Designer(Employer employer, double effectivnessCoefficient) {
        super(employer.getId(),employer.getFirstName(), employer.getSecondName(),
                employer.getSalaryValue(), employer.getExperiance(), employer.getIdHigherManagers(),EnumRole.DESIGNER);
        this.effectivnessCoefficient = effectivnessCoefficient;
    }

    public double getEffectivnessCoefficient() {
        return effectivnessCoefficient;
    }

    public void setEffectivnessCoefficient(long effectivnessCoefficient) {
        this.effectivnessCoefficient = effectivnessCoefficient;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "effectivnessCoefficient=" + effectivnessCoefficient +
                '}';
    }
}
