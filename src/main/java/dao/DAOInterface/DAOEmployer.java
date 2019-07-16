package dao.DAOInterface;

import entity.Designer;
import entity.Developer;
import entity.Employer;
import entity.Manager;

public interface DAOEmployer {

    public Employer getEmployer(int id);

    public void setEmployer(Manager manager);
    public void setEmployer(Designer designer);
    public void setEmployer(Developer developer);

}
