/**
 * This class will be used to write to a text file when the save button is clicked in the GUI program.
 */

import java.io.*;
import java.util.Scanner;

public class Writer {

    Scanner in = new Scanner(System.in);

    /**
     * This method will take a save name input from the user and save the input text inside that file.
     * @throws IOException
     */
    public void writing() throws IOException{

        System.out.println("Please input a save name");
        String sName;
        sName = in.nextLine();

        System.out.println("Please input Team Leader Name");
        String tlName;
        tlName = in.nextLine();

        System.out.println("Please input Team Member Name");
        String tmName1;
        tmName1 = in.nextLine();

        System.out.println("Please input Team Member Name");
        String tmName2;
        tmName2 = in.nextLine();

        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sName)))){
            writer.write("Input the text to write...");
            writer.write("\nThe save name is: " + sName);
            writer.write("\nThe Team Leader is: " + tlName);
            writer.write("\nThe Team Member is: " + tmName1);
            writer.write("\nThe Team Member is: " + tmName2);
        } catch (IOException e){
            System.out.println("The file could not be written to... Closing.");
        }


    }
}
