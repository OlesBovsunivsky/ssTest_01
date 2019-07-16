package entity;

import java.util.Map;

public class EmploterFactory {


    public static Employer getEmployer(Employer employer, double effectivnessCoefficient){

        return new Designer(employer, effectivnessCoefficient);
    }


    public static Employer getEmployer(Employer employer, Map<Integer , Employer> managerTeam){
        return new Manager(employer, managerTeam);
    }


    public static Employer getEmployer() {
        return new Employer();
    }


    public static Employer getEmployer(Employer employer) {
        return new Developer(employer);
    }


}
