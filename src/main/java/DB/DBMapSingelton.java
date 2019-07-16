package DB;

import entity.Employer;

import java.util.HashMap;
import java.util.Map;

public class DBMapSingelton {

    private Map<Integer, Employer> dbMap = new HashMap<>();
    private static volatile DBMapSingelton instance;

    private DBMapSingelton(){}

    public static DBMapSingelton getInstance(){
        if (instance==null)
            synchronized (DBMapSingelton.class){
            if (instance==null)
                instance = new DBMapSingelton();

        }
        return instance;
    }

    public Map getDbMap() {
        return dbMap;
    }

    public void setDbMap(Map dbMap) {
        this.dbMap = dbMap;
    }

    public void putInDbMap(int id, Employer employer){
        dbMap.put(id, employer);
    }

    public Employer getFromDbMap(int id){
        return dbMap.get(id);
    }

}
