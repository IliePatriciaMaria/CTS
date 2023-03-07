package ro.ase.acs.cts.main;

        import ro.ase.acs.cts.classes.*;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.util.List;


        import static ro.ase.acs.cts.classes.Create.createTable;
        import static ro.ase.acs.cts.classes.Insert.insertData;
        import static ro.ase.acs.cts.classes.Read.readData;


public class Main {

        public static void main(String[] args) {
            try {
                Class.forName("org.sqlite.JDBC");
                Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
                connection.setAutoCommit(false);

                createTable(connection);
                insertData(connection);
                readData(connection);

                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}