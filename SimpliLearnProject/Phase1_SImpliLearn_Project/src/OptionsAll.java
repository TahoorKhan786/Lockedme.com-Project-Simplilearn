

import java.util.List;
import java.util.Scanner;

public class OptionsAll {
	public static void welcomeinput() throws Exception{
		boolean r = true;
		Scanner sc = new Scanner(System.in);
		do {
				Menu.projectMenu();
				int ch1 = sc.nextInt();

				switch (ch1) {
				case 1:
					FilesManipulation.displayAllFiles("main");
					break;
				case 2:
					OptionsAll.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					r = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
		} while (r == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
				Menu.projectMenuOptions();
				FilesManipulation.createMainFolderIfNotPresent("main");
				
				int ch2 = sc.nextInt();
				switch (ch2) {
				case 1:
					// File Adding
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = sc.next();
					
					FilesManipulation.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// File or Folder deleting
					
					System.out.println("Enter the name of the file the you want to delete\"main\" folder");
					String filedelet = sc.next();
					
					FilesManipulation.createMainFolderIfNotPresent("main");
					List<String> deleteingFiles = FilesManipulation.displayFileLocations(filedelet, "main");
					
					String deletingMsg = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletingMsg);
				
					int indexOfFile = sc.nextInt();
					
					if (indexOfFile != 0) {
						FilesManipulation.deleteFile(deleteingFiles.get(indexOfFile - 1));
					} else {
						
						// delete all files
						for (String path : deleteingFiles) {
							FilesManipulation.deleteFile(path);
						}
					}
					

					break;
				case 3:
					// to search file and folder
					System.out.println("Enter the name of the file to be searched from \"main\" folder");
					String fileName = sc.next();
					
					FilesManipulation.createMainFolderIfNotPresent("main");
					FilesManipulation.displayFileLocations(fileName, "main");

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				
			}
		} while (running == true);
	}
}
