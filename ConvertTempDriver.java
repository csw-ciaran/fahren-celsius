import javax.swing.JFrame;

public class ConvertTempDriver {

	public static void main(String[] args) {
		
		ConvertTemp  convertTemp = new ConvertTemp("Temperature Conversion");
		convertTemp.setSize(180, 100);
		convertTemp.setLocation(500,500);
		convertTemp.setVisible(true);
        	convertTemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end main

}//end class
