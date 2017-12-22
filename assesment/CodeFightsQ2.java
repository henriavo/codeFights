import java.util.ArrayList;

class CodeFightsQ2 {

    public static void main(String[] args){
        System.out.println("Hello World!!!");
        
    }

    String decodeString(String s) {
    	char[] charArray = s.toCharArray();

    	for(int i =0;i<charArray.length;i++){
    		if(Character.isLetter(charArray[i])){
    			//LETTER
    		}	
    		else if (Character.isDigit(charArray[i])) {
    			//DIGIT
    			//CAPTURE EVERYTHING IN BETWEEN BRACKETS
    			int repeat = Character.isDigit(charArray[i]); 

    		}


    	}
    	
	}