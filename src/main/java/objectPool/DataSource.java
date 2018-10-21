package objectPool;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class DataSource {

    static DataSource instance = new DataSource();
    List<Connection> pool = new ArrayList<Connection>();

    private DataSource(){
        init();
    }

    private void init(){
        for(int i=0; i<3;i++){
            pool.add(new Connection());
        }

    }

    static Connection getConnection(){
        if(instance.pool.size()==0){
            throw new EmptyStackException();
        }
        Connection con = instance.pool.get(0);
        instance.pool.remove(0);
        System.out.println(con);
        return con;
    }

    static void release(Connection con){
        if(con!=null){
            instance.pool.add(con);
        }
    }

}
