package installer_j;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String PROGRAM_NAME = "My Program Name";
		String GET_FOLDER = "/path/to/your/install/folder";
		String OS_NAME = System.getProperty("os.name"); // Get OS name.
		
		Helper help = new Helper();
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	     
		System.out.println(PROGRAM_NAME);
		System.out.println("It Appears you are running " + OS_NAME);
		
		if(OS_NAME.contains("Windows"))
		{
			String GET_DIRECTORY = "/Path/to/windows/file";
			help.setDir_name(GET_DIRECTORY);
		} else 
		{
			String GET_DIRECTORY = "/Path/to/linux/file";
			help.setDir_name(GET_DIRECTORY);
		}

		System.out.println("Press 1 to install ");
		System.out.println("Press 2 to Cancel ");
		
	    int OPTION = sc.nextInt();
		
		switch(OPTION)
		{
		case 1: 
			System.out.println("Installing");
			File f = new File(GET_FOLDER);
			if(f.exists() && !f.isDirectory())
			{
				File src = new File(GET_FOLDER);
				File dst = new File(help.getDir_name());
				src.renameTo(dst);	
			} else
			{
				System.out.println("File Exits");
				System.exit(0);
			}
		break;
		case 2:
			System.out.println("Goodbye.");
			System.exit(0);
		break;
		default:
			System.out.println("Invalid Operation");
		break;
			
		}
	}

}
