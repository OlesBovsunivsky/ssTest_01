package entity;

import dao.DAOEmployerImpl;

import java.util.Objects;

public class Employer {

    private int id;
    private String firstName;
    private String secondName;
    private long salaryValue;
    private long experiance;
    private int idHigherManagers;
    private EnumRole role;

    public Employer() {
    }

    public Employer(int id, String firstName, String secondName,
                    long salaryValue, long experiance, int idHigherManagers, EnumRole role) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salaryValue = salaryValue;
        this.experiance = experiance;
        this.idHigherManagers = idHigherManagers;
        this.role = role;
    }

    public Employer(int id, String firstName, String secondName, long salaryValue, long experiance, int idHigherManagers) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salaryValue = salaryValue;
        this.experiance = experiance;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExperiance(long experiance) {
        this.experiance = experiance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(long salaryValue) {
        this.salaryValue = salaryValue;
    }

    public long getExperiance() {
        return experiance;
    }

    public int getIdHigherManagers() {
        return idHigherManagers;
    }

    public void setIdHigherManagers(int idHigherManagers) {
        this.idHigherManagers = idHigherManagers;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return id == employer.id &&
                salaryValue == employer.salaryValue &&
                experiance == employer.experiance &&
                idHigherManagers == employer.idHigherManagers &&
                firstName.equals(employer.firstName) &&
                secondName.equals(employer.secondName) &&
                role == employer.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, salaryValue, experiance, idHigherManagers, role);
    }

    @Override
    public String toString() {
        Manager manager = (Manager) new DAOEmployerImpl().getEmployer(id);

                return "FirstName= " + firstName + '\'' +
                " SecondName=" + secondName + "\'," +
                " Manager: " +  manager.toString() + "\'," +
                " Experiance=" + experiance +
                '}';
    }
}


