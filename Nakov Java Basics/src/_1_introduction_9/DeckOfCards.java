package _1_introduction_9;
import java.io.File;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.encoding.PdfDocEncoding;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDSimpleFont;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class DeckOfCards {
	
	public static final String SPADE = "\u2664";
	public static final String HEART = "\u2661";
	public static final String DIAMOND = "\u2662";
	public static final String CLUB = "\u2667";
	
	
	public static void main(String[] args){

		String[][] deck = new String[4][14];
		
		generateDeck(deck);
		writePDF(deck);
			
	}
	
	public static void generateDeck(String[][] deck){
		String suit = null;
		
		for(int i = 0; i < 4; i++){
			switch (i) {
				case 0: suit = SPADE; break;
				case 1: suit = HEART; break;
				case 2: suit = DIAMOND; break;
				case 3: suit = CLUB; break;
			}
			
			for(int j = 0; j < 14; j++){
				switch (j) {
					case 0: deck[i][j] = suit + "2"; break;
					case 1: deck[i][j] = suit + "3"; break;
					case 2: deck[i][j] = suit + "4"; break;
					case 3: deck[i][j] = suit + "5"; break;
					case 4: deck[i][j] = suit + "6"; break;
					case 5: deck[i][j] = suit + "7"; break;
					case 6: deck[i][j] = suit + "8"; break;
					case 7: deck[i][j] = suit + "9"; break;
					case 8: deck[i][j] = suit + "10"; break;
					case 9: deck[i][j] = suit + "J"; break;
					case 10: deck[i][j] = suit + "Q"; break;
					case 11: deck[i][j] = suit + "K"; break;
					case 12: deck[i][j] = suit + "A"; break;
					case 13: deck[i][j] = suit + "C"; break;
				}
			}
		}
	}
	
	public static void writePDF(String[][] deck) {
		
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage( page );
		
//		PDFont font = PDType1Font.TIMES_BOLD;
		

		
		try {
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			
			float[] rectX = new float[4];
			rectX[0] = 100.0f;
			rectX[1] = 100.0f;
			rectX[2] = 500.0f;
			rectX[3] = 500.0f;
			float[] rectY = new float[4];
			rectY[0] = 100.0f;
			rectY[1] = 700.0f;
			rectY[2] = 700.0f;
			rectY[3] = 100.0f;
			contentStream.drawPolygon(rectX, rectY);
			
	        PDFont font = PDTrueTypeFont.loadTTF( document, "unifont-7.0.03.ttf");   

			
			contentStream.beginText();
			contentStream.setFont( font, 160 );
			contentStream.moveTextPositionByAmount( 100, 400 );
			contentStream.drawString( SPADE );
			//System.out.println( SPADE );
			contentStream.endText();
			
			contentStream.close();
			document.save( "Hello World.pdf");
			document.close();
			
		} catch (Exception io) {
            System.out.println(io);
        }

		
		
	}
}
