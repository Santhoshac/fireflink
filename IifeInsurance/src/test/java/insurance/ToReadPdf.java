package insurance;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ToReadPdf {
	public static void main(String[] args) throws IOException, SAXException, TikaException {
//		step1:create an object for bodycontent handler
		BodyContentHandler contenthandle = new BodyContentHandler();
		
//		step2: create an object for file input stream
		FileInputStream fis = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\sac\\resume.pdf");
		
//		step3:create an object for empty meta data
		Metadata metadata = new Metadata();
//		step4:create an object for parse context
		ParseContext parsecontext = new ParseContext();
		
		PDFParser parser = new PDFParser();
		parser.parse(fis, contenthandle, metadata, parsecontext);
		System.out.println(contenthandle.toString());
	}
}
