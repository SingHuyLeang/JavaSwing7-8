package Themes;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Theme {
    public Theme(){
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
        }
    }
}
