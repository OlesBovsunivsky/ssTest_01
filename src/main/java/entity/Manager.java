package entity;

import java.util.Map;

public class Manager extends Employer {

    private Map<Integer, Employer> managerTeam;


    public Manager(Employer employer, Map<Integer, Employer> managerTeam) {
        super(employer.getId(), employer.getFirstName(), employer.getSecondName(),
                employer.getSalaryValue(), employer.getExperiance(), employer.getIdHigherManagers(),EnumRole.MANAGER);
        this.managerTeam = managerTeam;
    }

    public Map<Integer, Employer> getManagerTeam() {
        return managerTeam;
    }

    public void setManagerTeam(Map<Integer, Employer> managerTeam) {
        this.managerTeam = managerTeam;
    }

    @Override
    public String toString() {
        return "Manager: " + super.getFirstName() +
                " " + super.getSecondName();
    }
}
