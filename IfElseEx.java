import javax.swing.JOptionPane; //importing dialog box class.
/**
 * Name: Jack Brashier
 * Date: 3/13/17
 * Purpose: To show the structure of embedded if-else statements.
 */
public class IfElseEx {
    public static void main(String [] args) {
	//Instantiating variables for username and password. Variables are set to the string input into the dialog box.
        String uname = JOptionPane.showInputDialog(null, "Enter Username:");
        String passw = JOptionPane.showInputDialog(null, "Enter Password:");
	/*Beginning if-else statements - parent "if" is the correct uname + passw scenario, daughter "if"s are incorrect scenarios.*/
        if (uname.equals("jbrashier")) {
            if (passw.equals("compsci")) {
                JOptionPane.showMessageDialog(null, "Welcome, " + uname + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Password");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Username not recognized.");
        }
        }
    }
