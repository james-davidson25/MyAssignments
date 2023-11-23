package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser brow = new Browser ();
		String browname = brow.launchBrowser("Edge");
		System.out.println(browname + " " + "Browser launched successfully");
		brow.loadURL();
	}

}
