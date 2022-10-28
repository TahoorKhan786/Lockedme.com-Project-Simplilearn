

public class Menu {

	public static void printWelcomeScreen(String appName, String developerName) {
		String projectDetails = String.format("--------------------------------------------------\n"
				+ "$$$ Welcome to %s. $$$\n " + "$$$This application was developed by %s $$$.\n"
				+ "• Search, add, or delete files in \"main\" folder.\n"
				+ "--------------------------------------------------\n", appName, developerName);
		String uses = "You can use this application to :-\n"
				+ "• Retrieve all file names in the \"main\" folder\n"
				
				+ "\n $$$ NOTE:- Select the file names carefully before perforing any functions. $$$ \n";
		
		System.out.println(projectDetails);
		System.out.println(uses);
	}

	public static void projectMenu() {
		String menu = "\n\n----------Select any option number from below and press Enter----------\n\n"
				+ "1) Retrieve all files inside \"main\" folder\n"
				+ "2) Display menu for File operations\n"
				+ "3) Exit the program\n";
		System.out.println(menu);

	}

	public static void projectMenuOptions() {
		String fileMenu = "\n\n---------- Select any options below and press Enter ----------\n\n"
				+ "1) Add a file to \"main\" folder\n" + "2) Delete a file from \"main\" folder\n"
				+ "3) Search for a file from \"main\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}


}
