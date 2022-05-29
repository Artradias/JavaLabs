package logger;

import javax.swing.*;
import java.awt.*;

public class GUILogger implements Logger {
    @Override
    public void log(String str) {
        JOptionPane.showMessageDialog(new Frame(), str);
    }
}
