
package facturador;

import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Ramiro Collados
 */
public class Facturador {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, ParseException{
        
//        BaseTest.getPersonObject(1234);
        PoolProcess pp = new PoolProcess();
        
        pp.getPeopleData();
        
    }
    
    

}
