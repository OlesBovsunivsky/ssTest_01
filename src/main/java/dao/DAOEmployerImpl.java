package dao;

import DB.DBMapSingelton;
import dao.DAOInterface.DAOEmployer;
import entity.Designer;
import entity.Developer;
import entity.Employer;
import entity.Manager;

public class DAOEmployerImpl implements DAOEmployer {

    private DBMapSingelton db;

    public DAOEmployerImpl() {
        db = DBMapSingelton.getInstance();
    }

    @Override
    public Employer getEmployer(int id) {
        return  (Employer) db.getInstance().getDbMap().get(id);
    }

    @Override
    public void setEmployer(Manager manager) {
        db.putInDbMap(manager.getId(), manager);
    }

    @Override
    public void setEmployer(Designer designer) {
        db.putInDbMap(designer.getId(), designer);
    }

    @Override
    public void setEmployer(Developer developer) {
        db.putInDbMap(developer.getId(), developer);
    }


}
