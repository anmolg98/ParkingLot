package Data;

import org.springframework.beans.factory.annotation.Autowired;

public class DatabseFactory {



    private Database db;

    public Database getDatabase(){
        if(db==null){
            db = new Database();
        }
        return db;
    }
}
