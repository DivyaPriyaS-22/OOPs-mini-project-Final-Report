package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewLeaves {

    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM leaves");

            System.out.println("-----------------------------------------------------");
            System.out.println(" ID | Employee Name | Emp ID | Leave Days | Reason ");
            System.out.println("-----------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("emp_name");
                String empId = rs.getString("emp_id");
                int days = rs.getInt("leave_days");
                String reason = rs.getString("reason");

                System.out.printf(" %2d | %-14s | %-6s | %-11d | %-20s\n",
                        id, name, empId, days, reason);
            }

            System.out.println("-----------------------------------------------------");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
