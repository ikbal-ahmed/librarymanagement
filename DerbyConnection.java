package coulibrary.project;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DerbyConnection {

    Connection connection;
    Statement statement;
    String driverName, sourceURL, user, password, host, database;
    FileReader fr;

    public DerbyConnection() {

        driverName = "org.apache.derby.jdbc.EmbeddedDriver";
        sourceURL = "jdbc:derby://localhost:1527/library";
        user = "nbuser";
        password = "nbuser";

        try {
            // statement = connection.createStatement();
            Class.forName(driverName);
            connection = DriverManager.getConnection(sourceURL, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
