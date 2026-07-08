import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class VulnerableTest {
    public void test(HttpServletRequest request) throws Exception {
        String userInput = request.getParameter("id");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test");
        Statement stmt = conn.createStatement();

        String query = "SELECT * FROM users WHERE id = " + userInput;
        stmt.executeQuery(query);
    }
}
