package dao;

import DB.DBMapSingelton;
import dao.DAOInterface.DAODepartment;
import entity.Department;
import entity.EnumRole;
import entity.Manager;

import java.util.List;
import java.util.stream.Collectors;

public class DAODepartmentImpl implements DAODepartment {

    @Override
    public Department getDepartment() {

        return new Department(
                ((List<Manager>) DBMapSingelton.getInstance().getDbMap()
                .values().stream().collect(Collectors.toList()))
                        .stream().filter(m->m.getRole()
                .equals(EnumRole.MANAGER)).collect(Collectors.toList()));

    }
}
