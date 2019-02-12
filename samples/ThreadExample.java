
public class ThreadExample implements Runnable {

	// sample privates 
	// - replace with actual params, e.g., connection object
	private int threadID;
	private String line;
	public ThreadExample(int arg1, String arg2) {
		threadID = arg1;
		line = arg2;
	}

	// run() has the thread code
	@Override
	public void run() {
		try {
			// this is just sample code
			// - replace with web server code that retrieves file and sends it back
			// - close connection after done sending back file
			for (int i=0; i<5; i++) {
				System.out.println(line);
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}


