import java.sql.*;
public class Test {
    public void getUser(String userInput) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test");
        Statement stmt = conn.createStatement();

        String query = "SELECT * FROM users WHERE id = " + userInput;

        stmt.executeQuery(query);
    }
}
