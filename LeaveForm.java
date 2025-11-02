package application;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LeaveForm extends Application {

    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Employee Name:");
        TextField nameField = new TextField();

        Label idLabel = new Label("Employee ID:");
        TextField idField = new TextField();

        Label daysLabel = new Label("Leave Days:");
        TextField daysField = new TextField();

        Label reasonLabel = new Label("Reason:");
        TextField reasonField = new TextField();

        Button submitBtn = new Button("Apply Leave");
        Label resultLabel = new Label();

        submitBtn.setOnAction(e -> {
            String name = nameField.getText();
            String id = idField.getText();
            int days = Integer.parseInt(daysField.getText());
            String reason = reasonField.getText();

            String response = Client.applyLeave(name, id, days, reason);
            resultLabel.setText(response);
        });

        VBox vbox = new VBox(10, nameLabel, nameField, idLabel, idField, 
                             daysLabel, daysField, reasonLabel, reasonField, 
                             submitBtn, resultLabel);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 400);
        stage.setTitle("Employee Leave Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
