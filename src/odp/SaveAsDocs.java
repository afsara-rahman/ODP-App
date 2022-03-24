/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odp;

import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Personal
 */
public class SaveAsDocs {
     private String fileName = "";
    private String contents = "";
 
    SaveAsDocs(String fName, String cont){
        this.fileName = fName;
        this.contents = cont;
    }
 
     public boolean save(){
        try{
            String fName = this.fileName + ".docx";
            FileOutputStream outputStream = new FileOutputStream(fName);
            XWPFDocument doc = new XWPFDocument();
 
            String[] lines = this.contents.split("\\r?\\n");
            for (String line : lines) {
                XWPFParagraph para = doc.createParagraph();
                 XWPFRun paraRun = para.createRun();
                 paraRun.setText(line);
            }
 
            doc.write(outputStream);
            outputStream.close();
            return true;
 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
 
        return false;
    }
    
}
