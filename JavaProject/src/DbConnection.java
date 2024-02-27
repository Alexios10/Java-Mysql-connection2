
import java.sql.*;

public class DbConnection {

    private static final String baseUrl = "jdbc:mysql://localhost:3306/world";
    private static final String userName = "root";
    private static final String password = "sattar";

    public static void main(String[] args) {

        Connection connection;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(baseUrl, userName, password);

            Statement statement;
            statement = connection.createStatement();

//            String insertQuery = "INSERT INTO city (name, countrycode, population) VALUES ('New City', 'ABC', 100000)";
//            int rowsAffected = statement.executeUpdate(insertQuery);
//            System.out.println(rowsAffected + " row(s) inserted successfully.");

            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from city");

            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("Population");
                title = resultSet.getString("Name").trim();

                System.out.println("Population : " + code + " Name : " + title);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Noe gikk galt " + e);
        }
    }
}
