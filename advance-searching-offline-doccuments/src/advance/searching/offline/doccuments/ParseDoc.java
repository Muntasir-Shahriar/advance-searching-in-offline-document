/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advance.searching.offline.doccuments;

/**
 *
 * @author MUNTASIR SHAHRIAR
 */

import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;
import java.io.*;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
class ParseDoc {
    public void Parse(String fileName)
    {
        System.out.println(fileName);
        

        // print the value of the Author attribute to System.out
        try {
            Document pdf = PDF.open(fileName);
            StringWriter buffer = new StringWriter();
            pdf.pipe(new OutputTarget(buffer));
            pdf.close();
            String line = buffer.toString();
            String[] Words = line.split("[, .:?)(&@\\n]");
            for(int i=0;i<Words.length;i++)
            {
                String singleWord = Words[i].trim();
                if(singleWord.length()>0)
                    System.out.println(singleWord);
            }
                    

        } catch (IOException ex) {
            Logger.getLogger(ParseDoc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void parseDoc(String fileName)
    {
        File file= null;
        WordExtractor extractor =null;
        try{
            file = new File("C:\\Users\\MUNTASIR SHAHRIAR\\Documents/test2.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for(int i=0;i<fileData.length;i++)
            {
                if(fileData[i]!=null)
                {
                    System.out.println(fileData[i]);
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void parseDocx(String fileName)
    {
        File file= null;
        WordExtractor extractor =null;
        System.out.println("parseDocx called");
        try{
            file = new File("C:\\Users\\MUNTASIR SHAHRIAR\\Documents/test2.docx");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);
           
            List<XWPFParagraph> fileData = document.getParagraphs();
            for(XWPFParagraph para: fileData)
            {
                System.out.println(para.getText());
            }
            fis.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void parseText(String fileName)
    {
        System.out.println("parseTextCalled");
        File file = new File("C:\\Users\\MUNTASIR SHAHRIAR\\Documents/fileTest.txt");
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }
            
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }
}
//C:\Users\MUNTASIR SHAHRIAR\Documents/MY_CV.docx