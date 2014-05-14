package rahul.java.example;

import java.io.File;

//List directories and files recursively

/*Note that this is sensitive to StackOverflowError when the
 *  tree is deeper than the JVM's stack can hold. You may want to 
 *  use an iterative approach or tail-recursion instead
 */

public class WalkFileTree {
	public static void main(String... args) {
		File[] files = new File("C:/TortoiseSVN").listFiles();
		showFiles(files);
	}

	/**
	 * FindTextFilesVisitor.
	 */
	public static void showFiles(File[] files) {
		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("Directory: " + file.getName());
				showFiles(file.listFiles()); // Calls same method again.
			} else {
				System.out.println("File: " + file.getName());
			}
		}
	}
}
