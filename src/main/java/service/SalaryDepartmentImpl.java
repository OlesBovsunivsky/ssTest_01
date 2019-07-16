package service;


import dao.DAODepartmentImpl;
import entity.Designer;
import entity.Employer;
import entity.EnumRole;
import entity.Manager;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SalaryDepartmentImpl implements Salary {

    private String salaryMassag;

    public SalaryDepartmentImpl(String salaryMassage) {
        this.salaryMassag = salaryMassage;
    }

    private double calculateSalary() {
        ArrayList<Employer> list = getEmployer();
        System.out.println(list.size());

        double salary = 0;
        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i).getRole()) {
                case DESIGNER: {

                    salary = setDesignerSalary((Designer) list.get(i)) + setEmployerSalary(list.get(i));
                }
                case MANAGER: {

                    salary = setManagerSalary((Manager) list.get(i)) + setEmployerSalary(list.get(i));
                }
                default:
                    salary = setEmployerSalary(list.get(i));
            }
        }
        return salary;
    }

    private ArrayList getEmployer() {

        ArrayList arrayLis = new ArrayList();

        new DAODepartmentImpl().getDepartment().listManager.forEach(list -> {
            if (list.getManagerTeam().containsKey(salaryMassag)) {
                arrayLis.add(list.getManagerTeam().get(salaryMassag));
            }
        });
        return arrayLis;

    }

    private double setEmployerSalary(Employer employer) {
        return (employer.getExperiance() > 5
                ? (employer.getSalaryValue() * 1.2 + 700) : employer.getExperiance() > 2
                ? (employer.getSalaryValue() + 200) : employer.getSalaryValue());
    }

    private double setManagerSalary(Manager manager) {

        ArrayList<Employer> list = (ArrayList) manager.getManagerTeam().values().stream().collect(Collectors.toList());

        double salary = list.stream().filter(m -> m.getRole().
                equals(EnumRole.DEVELOPER)&& m.getIdHigherManagers()==manager.getId()).collect(Collectors.toList())
                .size() > list.size() * 0.5 ? manager.getSalaryValue() * 1.1 : manager.getSalaryValue();

        return (list.size() > 10 ? salary + 300 : (list.size() > 2)? salary + 200 : salary);
    }

    private double setDesignerSalary(Designer designer) {
        return designer.getEffectivnessCoefficient() * designer.getSalaryValue();
    }

    @Override
    public double calculation() {
        return calculateSalary();
    }

}
