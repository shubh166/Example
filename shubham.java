//This is for testing
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class VulnerableTest {
    public void test(HttpServletRequest request) throws Exception {
        String userInput = request.getParameter("id");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test");
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
        stmt.setString(1, userInput);
        stmt.executeQuery();
    }
}
