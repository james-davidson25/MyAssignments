package week1.day2;

public class Browser {
	
	public String launchBrowser (String browserName) {
		return browserName;
	}
	
	public void loadURL() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser browName = new Browser();
		String brow = browName.launchBrowser("Chrome");
		System.out.println(brow + " " + "Browser launched successfully");
		browName.loadURL();
		
	}

}
