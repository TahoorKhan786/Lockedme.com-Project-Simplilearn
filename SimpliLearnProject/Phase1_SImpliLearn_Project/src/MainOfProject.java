
public class MainOfProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create "main" folder if not present in current folder structure
		FilesManipulation.createMainFolderIfNotPresent("main");
		
		Menu.printWelcomeScreen("Lockedme.com", "Tahoor Khan");
		
		try {
			OptionsAll.welcomeinput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


