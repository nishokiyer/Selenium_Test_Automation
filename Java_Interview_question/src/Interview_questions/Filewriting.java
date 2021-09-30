package Interview_questions;


import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        try{
		String Location ="Filewritter.txt";
        String content = "This is my firt file writting code";
        
        FileWriter FW = new FileWriter(Location);
        FW.write(content);
        FW.close();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println("File created successfully");
        }
        }
	}


