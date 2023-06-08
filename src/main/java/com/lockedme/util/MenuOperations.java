package com.lockedme.util;
import java.io.File;
import java.util.Scanner;

public class MenuOperations extends FileOperations {

    final String directoryPath;
    final File directory;

    public MenuOperations(String path){
        this.directoryPath = path;
        this.directory = new File(this.directoryPath);
    }

    public void showMenu(){
        System.out.println("Welcome to LockedMe.com - File Management System");
        System.out.println("Developer: Godson Joseph");
        System.out.println("Directory: " + directory.getAbsolutePath());
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("******Menu:******");
            System.out.println("1. List all files");
            System.out.println("2. Add a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    listFiles(this.directory);
                    break;
                case 2:
                    System.out.print("Enter the file name to add: ");
                    String fileNameToAdd = scanner.nextLine();
                    addFile(fileNameToAdd, this.directoryPath);
                    break;
                case 3:
                    System.out.print("Enter the file name to delete: ");
                    String fileNameToDelete = scanner.nextLine();
                    deleteFile(fileNameToDelete, this.directoryPath);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the application. Thank You for using Lockedme.com!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid menu option.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
