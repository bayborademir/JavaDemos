import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "12345";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }
    public void showMessage(SQLException expection){
        System.out.println("error: "+ expection.getMessage());
        System.out.println("error code: "+ expection.getErrorCode());
    }
}
