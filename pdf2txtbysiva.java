//download snowtide package and add it to repositary and then code will works

import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files; 
import java.nio.file.Paths;
import java.util.*;

 
public class ExtractTextAllPages {
  public static void main (String[] args) throws java.io.IOException {
    String pdfFilePath = args[0];
public static void download(String url, String fileName) throws Exception {
    try (InputStream in = URI.create(url).toURL().openStream()) {
        Files.copy(in, Paths.get(fileName));
    }
}											//defining function download
Scanner sc=new Scanner(System.in);
System.out.println("Enter the pdf name which is in the same directory:");
 String pdfFilePath= sc.nextLine();							//get pdf path from user
    Document pdf = PDF.open(pdfFilePath);
    StringBuilder text = new StringBuilder(1024);					//get content of pdf as a string
    pdf.pipe(new OutputTarget(text));
    pdf.close();
    FileWriter myWriter = new FileWriter("txtconverted.txt");
      myWriter.write(text);					//Save the string into the file & save that file temporarily
      myWriter.close();
      download("txtconverted.txt","pdf2txtconverted.txt");
File file = new File("txtconverted.txt");			//Download txt file by calling function download
file.delete();							//Delete the file after user downloads it

  }
}