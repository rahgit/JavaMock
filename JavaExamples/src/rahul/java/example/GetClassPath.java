package rahul.java.example;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class GetClassPath {

	public static void main(String[] args) {
		/*
		 * Way1 RuntimeMXBean.getClassPath() returns the Java class path that is
		 * used by the system class loader to search for class files
		 */
		RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
		String classpath = bean.getClassPath();

		System.out.println("Classpath : " + classpath);
		System.out.println("Library Path : " + bean.getLibraryPath());
		
		/*
		 * Way2
		 */
		System.out.println("Classpath : "
				+ System.getProperty("java.class.path"));
		System.out.println("Classpath : "
				+ System.getProperty("java.library.path"));
	}

}
