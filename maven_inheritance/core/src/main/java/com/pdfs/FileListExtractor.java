package com.pdfs;


import java.io.File;

/**
 * Created by Ranvirsinh on 11/5/2016.
 */
public class FileListExtractor {
    public static void main(String[] args) {
        File[] files = new File("C:\\Users\\Ranvirsinh\\Google Drive\\Parents Visa\\Ranvir's Supporting docs").listFiles();
        iterateFiles(files);
    }
    public static void iterateFiles(File[] files){
        FileMerger fileMerger = new FileMerger();
        for(File file : files){
            if(file.isDirectory()){
                if(!isAllFiles(file)){
                    iterateFiles(file.listFiles());
                }else{
                    fileMerger.mergePdfs(file);
                }
            }
        }
    }
    public static Boolean isAllFiles(File file){
        for(File file1 : file.listFiles()){
            if(file1.isDirectory()){
                return false;
            }
        }
        return true;
    }
}
