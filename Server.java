package application;
import java.sql.*;

public class Server {

    public static boolean saveLeave(Leave leave) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO leaves (emp_name, emp_id, leave_days, reason) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, leave.getEmpName());
            pst.setString(2, leave.getEmpId());
            pst.setInt(3, leave.getLeaveDays());
            pst.setString(4, leave.getReason());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
