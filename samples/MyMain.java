import java.util.*;

public class MyMain {
	static int threadcnt = 0;

	public static void main(String[] args) {

		//
		// write TCP server set up code here
		//


		// sample code just reads a line and echoes 5 times in thread
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			threadcnt++;

			// this is how a thread is created and started
			ThreadExample threadObj = new ThreadExample(threadcnt, line);
			Thread t = new Thread(threadObj);
			t.start();
		}
	}
}


