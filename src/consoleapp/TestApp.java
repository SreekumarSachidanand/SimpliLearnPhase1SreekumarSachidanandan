package consoleapp;

import businessoperations.displayFile;
import businessoperations.searchFile;
import businessoperations.deleteFile;
import businessoperations.addFile;

import java.io.IOException;
import java.util.Scanner;


public class TestApp {
    public static void main(String args[]) throws IOException {
    try {

        System.out.println("******Welcome To LockedMe File Operations ******");
        System.out.println("");
        boolean exit = false;
        Scanner readChoice = new Scanner(System.in);
        int optionChoosen = 0;

        do {
            System.out.println("");
            System.out.println("Please choose any of the following options... Enter from 1 to 5 and press Enter");
            System.out.println("");
            System.out.println("1-Display Files in the Directory");
            System.out.println("2-Search For a File from the Directory");
            System.out.println("3-Delete File From the Directory");
            System.out.println("4-Add a New File to the Directory");
            System.out.println("5-Exit");

            optionChoosen = readChoice.nextInt();
            switch (optionChoosen) {
                case 1:
                    displayFile obj = new displayFile();
                    obj.displayFiles("root");
                    break;
                case 2:
                    System.out.println("Enter the File Name to be searched...");
                    Scanner readFileName = new Scanner(System.in);
                    String FileName = readFileName.nextLine();
                    searchFile obj2 = new searchFile();
                    obj2.searchFile("root", FileName.trim());
                    break;
                case 3:
                    System.out.println("Enter the File Name to be Deleted...");
                    Scanner readFileNameToDelete = new Scanner(System.in);
                    String FileNameToDelete = readFileNameToDelete.nextLine();
                    deleteFile obj3 = new deleteFile();
                    obj3.deleteFileIfExists("root", FileNameToDelete.trim());
                    break;
                case 4:
                    System.out.println("Enter the File Name to be Added...");
                    Scanner readFileNameToAdded = new Scanner(System.in);
                    String FileNameToAdd = readFileNameToAdded.nextLine();
                    addFile obj4=new addFile();
                    obj4.AddFileToDirectory("root",FileNameToAdd.trim());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose correct options from 1..5 and press Enter");
                    exit = true;
                    break;
            }
        }
        while (!exit);

    }
    catch (Exception e){
        System.out.println("Exception Occured"+" "+"Please check the options entered...");
    }

    }
}
