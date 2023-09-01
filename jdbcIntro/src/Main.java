import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;

        try {


            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"), resultSet.getString("Continent"), resultSet.getString("region")));

            }

        } catch (SQLException exception) {

            helper.showMessage(exception);

        } finally {
            connection.close();
        }


    }
}
