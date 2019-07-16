package entity;

import java.util.List;
import java.util.Objects;

public class Department {

    public List<Manager> listManager;

    public Department() {
    }

    public Department(List<Manager> listManager) {
        this.listManager = listManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(listManager, that.listManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listManager);
    }
}
