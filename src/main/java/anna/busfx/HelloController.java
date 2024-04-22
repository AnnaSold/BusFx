package anna.busfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    Button but1;
    @FXML
    Label lab1;
    @FXML
    Label lab2;
    @FXML
    TextField brIdgA;
    @FXML
    TextField bridgeH;
    @FXML
    Label labCRUSH;
    @FXML
    Label labNOCRUSH;

    public List<Briudge> getHeight(){
        List<Briudge> heightBridges = new ArrayList<>();
        int num = Integer.parseInt(brIdgA.getText());
        for (int i = 0; i < num; i++) {
            int height = Integer.parseInt(bridgeH.getText());
            Briudge b = new Briudge(height);
            heightBridges.add(b);
        }
        return heightBridges;
    }

    public  void calculate(){
        List<Briudge> heightBridges = getHeight();
        boolean safe = Briudge.calculate(heightBridges);
        System.out.println(heightBridges);


        labNOCRUSH.setVisible(safe);
        boolean s = false;
        if (safe == false)
             s = true;
        labCRUSH.setVisible(s);

    }
    }


