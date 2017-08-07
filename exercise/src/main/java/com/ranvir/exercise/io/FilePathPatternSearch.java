package com.ranvir.exercise.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FilePathPatternSearch {

    private String patternToSearch;

    public String getPatternToSearch() {
        return patternToSearch;
    }

    public void setPatternToSearch(String patternToSearch) {
        this.patternToSearch = patternToSearch;
    }

    public List<String> fileScanner(File file) throws IOException {

        try (Stream<Path> paths = Files.walk(Paths.get(file.toURI()))) {
//            paths.allMatch(path -> path.getFileName().toFile().getName().contains(patternToSearch));
            paths.filter(path -> printInfo(path.toFile())).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tl.get();
        /*Files.walk(Paths.get(file.getAbsolutePath()))
                .filter(path -> printInfo(path.toFile()))
                .forEach(System.out::println);*/
    }
    private ThreadLocal<List<String>> tl = new ThreadLocal<>();

    public List<String> fileScannerOld(File file) throws IOException {
        if(!file.isDirectory()){
            throw new IOException("Path provided is not directory");
        }
        for(File currentFile : file.listFiles()){
            if(currentFile.isDirectory()){
                printInfo(currentFile);
                fileScannerOld(currentFile);
            }else{
                printInfo(currentFile);
            }
        }
        return tl.get();
    }

    private boolean printInfo(File currentFile) {
        if(Pattern.matches(patternToSearch, currentFile.getName())){
            if(Objects.isNull(tl.get())){
                tl.set(new ArrayList<>());
            }
            tl.get().add(currentFile.getPath());
            return true;
        }
        return false;
    }

    private List<String> walkFiles(File file) throws Exception {
        if(!file.isDirectory()){
            throw new Exception();
        }
        for(File f: file.listFiles()){
            if(f.isDirectory()){
                printInfo(f);
                walkFiles(f);
            }else{
                printInfo(f);
            }
        }
        return tl.get();
    }

}
