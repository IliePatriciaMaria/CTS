package ro.ase.acs.cts.classes;



import javax.xml.catalog.CatalogResolver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void createTable(Connection connection) throws SQLException {
        String sqlDrop = "DROP TABLE IF EXISTS employees";
        String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY,"
                + "name TEXT, address TEXT, salary REAL)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
        connection.commit();
    }

}
