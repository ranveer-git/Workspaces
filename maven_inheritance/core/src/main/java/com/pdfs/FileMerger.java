package com.pdfs;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.common.PDDestinationOrAction;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ranvirsinh on 11/5/2016.
 */
public class FileMerger {
    public void mergePdfs(File file) {
        Map<String, String> pageLimitConfig = new HashMap<>();
        pageLimitConfig.put("Chase","*");
        pageLimitConfig.put("Central Bank","*");
        pageLimitConfig.put("Amex","1");
        pageLimitConfig.put("Discover","1");
        pageLimitConfig.put("Payslips","1");
        File[] pdfFiles = file.listFiles();
        System.out.println("Get Only Pages for Folder:"+file+" Pages:"+pageLimitConfig.get(file.getName()));
        PDPage page;
        String pageLimit = pageLimitConfig.get(file.getName());
        PDDocument newDocument = new PDDocument();
        PDPageTree originalDocumentPages;
        for(File pdfFile : pdfFiles){
            if(pdfFile.isFile() && pdfFile.getName().contains(".pdf")){
                System.out.println(pdfFile);
                try {
                    originalDocumentPages = PDDocument.load(pdfFile).getPages();
//                    newDocument.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
