package ikra.dev.controlIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlIf {

	public void testIf() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		int nbr1 = Integer.parseInt(br.readLine());
		System.out.println("The number is : " + nbr1);

	}

	public static void main(String[] args) throws IOException {
		ControlIf cif = new ControlIf();
		cif.testIf();

	}

}
