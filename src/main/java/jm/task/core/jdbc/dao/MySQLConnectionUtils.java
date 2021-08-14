package jm.task.core.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionUtils {

public static Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException {
        String hostName = "localhost";

        String dbName = "preprjdb";
        String userName = "web";
        String password = "12345678";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException{

       // Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName
              //  + "?verifyServerCertificate=false&useSSL=true&requireSSL=true";
             //   +  "?enabledTLSProtocols=TLSv1.2"
             //+ "?useSSL=NO"
            ;
        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);

        return conn;
    }

}
