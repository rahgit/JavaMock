package rahul.java.example;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	/* FileInputStream & FileOutputStream generally we use for low level IO i.e. for read byte data
	 * */
	public static void main(String[] args) {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("xanadu.txt");
			out = new FileWriter("outputCharacter.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
