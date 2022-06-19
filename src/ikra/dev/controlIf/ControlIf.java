package ikra.dev.controlIf;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;



public class ControlIf {

	public void testIf() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		int nbr1 = Integer.parseInt(br.readLine());
		System.out.println("The number is : " + nbr1);

	}

	public void tryIf() {
		Toolkit.getDefaultToolkit().beep();
		String strInput = JOptionPane.showInputDialog(null, "Enter a number","Title");
		int nbr1 = Integer.parseInt(strInput);
		Toolkit.getDefaultToolkit().beep();
		JOptionPane.showMessageDialog(null,nbr1, "Title", 1);

	}

	public static void main(String[] args) throws IOException {
		ControlIf cif = new ControlIf();
//		cif.testIf();
		cif.tryIf();

	}

}
