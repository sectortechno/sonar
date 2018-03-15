package st.sonar.java.bugs;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadAFile {
	
	public static void main(String... args) {
		String fileName = "";
		
		try {
			Stream<String> stream = Files.lines(Paths.get(fileName));
			for(;;) {
				stream.forEach(System.out::println);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
