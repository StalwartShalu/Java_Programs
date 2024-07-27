package SamplePackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir") + "\\src\\";
		String path2 = System.getProperty("user.dir") + "\\src\\NewFile.txt";
		//Create a File 
		File file = new File(path + "NewFile.txt");
		boolean FileCreation = false;
		try {
			FileCreation = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(FileCreation) {
			System.out.println("File Created: " + file.getCanonicalPath());
		}
		else {
			System.out.println("File Already Exists: " + file.getCanonicalPath());
		}
		
		//Append content to a File 
		String textData="Hello";
		try {
			Files.write(Paths.get(path2), textData.getBytes(), StandardOpenOption.APPEND);
			System.out.println("Write Function Completd for file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read Lines in a file
				try {
					List<String> Lines = Files.readAllLines(Paths.get(path2));
					for (String lines : Lines) {
						System.out.print("Reading File: ");
						System.out.println(lines);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		//Delete a word in a File 
				try {
					Files.delete(Paths.get(path2));
					System.out.println("File Deleted: " + file.getName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		//Moving file to a folder
				String MovePathSrc= System.getProperty("user.dir") + "\\src\\SampleDoc.txt";
				String MovePathDesc = System.getProperty("user.dir")+"\\src\\SampleFolder\\SampleDoc.txt";
				
				Files.move(Paths.get(MovePathSrc), Paths.get(MovePathDesc), StandardCopyOption.REPLACE_EXISTING);
				System.out.println("File Moved to new Folder");
	}

}
