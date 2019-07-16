package entity;

public class Developer extends Employer {

    public Developer(Employer employer) {
        super(employer.getId(),employer.getFirstName(),employer.getSecondName(),
                employer.getSalaryValue(), employer.getExperiance(), employer.getIdHigherManagers(), EnumRole.DEVELOPER);
    }

}
