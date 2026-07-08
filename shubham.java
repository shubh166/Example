import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;

public class VulnerableTest {

    public void test(HttpServletRequest request) throws Exception {

        // User-controlled input
        String userInput = request.getParameter("id");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/test", "username", "password");

        Statement stmt = conn.createStatement();

        // Vulnerable: SQL query is built using string concatenation
        String query = "SELECT * FROM users WHERE id = " + userInput;

        stmt.executeQuery(query);

        stmt.close();
        conn.close();
    }
}
