package com.ranvir.exercise.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePatternSearchRunner {
    public static void main(String[] args) throws IOException {
        List<String> matchingPaths;
        FilePathPatternSearch fil = new FilePathPatternSearch();
        fil.setPatternToSearch("^.*com.*$");
        System.out.println("Please select example.\\n 1.Java8 \n 2. Java6");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        if(!new File(path).isDirectory()){
            System.err.println("No Such Directory exist. Please check the path.");
//            throw new NotDirectoryException(path);
        }
        if("1".equals(path)){
            matchingPaths = fil.fileScanner(new File("F:\\Workspaces\\exercise\\src\\"));
        }else if("2".equals(path)){
            matchingPaths = fil.fileScannerOld(new File("F:\\Workspaces\\exercise\\src\\"));
        }else {
            matchingPaths = new ArrayList<>();
            System.out.println("InvalidOption");
        }
        System.out.println(matchingPaths.stream());
    }
}
