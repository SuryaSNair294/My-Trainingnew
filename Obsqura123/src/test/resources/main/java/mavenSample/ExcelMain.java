package mavenSample;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String k=ExcelCode.readStringData(1, 1);
		System.out.println(k);
		String l=ExcelCode.readIntegerData(0, 1);
		System.out.println(l);
		

	}

}
