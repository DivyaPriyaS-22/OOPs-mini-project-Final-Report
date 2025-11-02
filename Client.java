package application;

public class Client {

    public static String applyLeave(String name, String id, int days, String reason) {
        Leave leave = new Leave(name, id, days, reason);
        boolean status = Server.saveLeave(leave);

        if (status)
            return "Leave applied successfully!";
        else
            return "Error: Could not apply leave.";
    }
}
