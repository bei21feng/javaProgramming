package indi.bill.javaprogramming.learnbasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{
    @Override
    public void start (Stage primartyStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 250, 200);
        primartyStage.setTitle("indi.bill.javaprogramming.learnbasic.MyJavaFX");
        primartyStage.setScene(scene);
        primartyStage.show();
    }
}
