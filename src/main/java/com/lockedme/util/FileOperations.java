package com.lockedme.util;

import java.io.File;
import java.util.Arrays;

public class FileOperations {

    public void listFiles(File directory) {
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Directory is empty!!!");
        } else {
            Arrays.sort(files);
            System.out.println("********Files in the directory (in ascending order):********");
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    public void addFile(String fileName, String directoryPath) {
        File newFile = new File(directoryPath + File.separator + fileName);

        try {
            if (newFile.createNewFile()) {
                System.out.println("File added successfully: !!" + newFile.getName());
            } else {
                System.out.println("File already exists: !!" + newFile.getName());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while adding the file: !!" + e.getMessage());
        }
    }

    public void deleteFile(String fileName, String directoryPath) {
        File fileToDelete = new File(directoryPath + File.separator + fileName);

        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully: !!" + fileToDelete.getName());
            } else {
                System.out.println("Failed to delete the file: !!" + fileToDelete.getName());
            }
        } else {
            System.out.println("File not found: !!" + fileToDelete.getName());
        }
    }
}
