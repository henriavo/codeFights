import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Character;

class CodeFightsQ2 {
	final static String OPEN_BRACE = "[";
	final static String CLOSE_BRACE = "]";

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        String input = "abc3[def]ghi";
        String output = decodeString(input);
        System.out.println(" **** " + output);

        
    }

    public static String decodeString(String s) {
		ArrayList<Character> chars = new ArrayList<>();

		for (char ch: s.toCharArray()) {
			chars.add(ch);
		}

    	Iterator<Character> itr = chars.iterator();

		String result = recursive(itr);

 		return result;  	
	}

	public static String recursive(Iterator itr) {
		StringBuilder sb = new StringBuilder();

		while(itr.hasNext()) {
			Character char1 = (Character)itr.next();
			if(Character.isLetter(char1)) {
				sb.append(char1);
			}
			else if(Character.isDigit(char1)) {
				System.out.println(" char1: " + char1);
				Integer repeat = Integer.valueOf(char1.toString());
				String toRepeat = recursive(itr);
				System.out.println(" toRepeat: " + toRepeat);
				System.out.println(" repeat: " + repeat);
				while(repeat != 0) {
					sb.append(toRepeat);
					repeat--;
				}
			}
			else if(char1.equals('['))
				itr.remove();
			else if(char1.equals(']')) {
				itr.remove();
				return sb.toString();
			}	
		} //while loop
		return sb.toString();
	}

}