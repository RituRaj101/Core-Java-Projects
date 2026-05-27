package music.player;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1521:orcl";

    private static final String USERNAME =
            "MYDB9AM";

    private static final String PASSWORD =
            "MYDB9AM";

    public static Connection getConnection() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            return DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );

        } catch (Exception e) {

            System.out.println("Database Connection Failed");
            e.printStackTrace();

            return null;
        }
    }
}
