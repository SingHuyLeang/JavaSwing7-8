package Component;

import javax.swing.JOptionPane;

public class MSG {
    static public void success(String message){
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.INFORMATION_MESSAGE);
    }
    static public void error(String message){
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.ERROR_MESSAGE);
    }
    static public void warning(String message){
        JOptionPane.showMessageDialog(null, message, "", JOptionPane.WARNING_MESSAGE);
    }
}
