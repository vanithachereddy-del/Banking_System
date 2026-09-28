
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.Font;

import GUI.GUIForm;

public class Application {
	public static void main(String[] args) 
		{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						// Set Nimbus Look & Feel and some sensible defaults
						try {
							UIManager.setLookAndFeel(new NimbusLookAndFeel());
							UIManager.put("Button.focus", Boolean.FALSE);
							UIManager.put("ToolTip.font", new Font("Segoe UI", Font.PLAIN, 12));
							UIManager.put("Label.font", new Font("Segoe UI", Font.PLAIN, 13));
							UIManager.put("Button.font", new Font("Segoe UI", Font.PLAIN, 13));
							UIManager.put("TextField.font", new Font("Segoe UI", Font.PLAIN, 13));
						} catch (Exception ignore) {}
						
						GUIForm.login.frame.setVisible(true);
					} catch (Exception e) {
						
					}
				}
			});
		}
}
