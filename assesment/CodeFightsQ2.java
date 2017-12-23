import java.util.ArrayList;
import java.util.Iterator;

class CodeFightsQ2 {
	final static String OPEN_BRACE = "[";
	final static String CLOSE_BRACE = "]";

    public static void main(String[] args){
        // System.out.println("Hello World!!!");
        // String input = "ab3[cde]fgh";
        // String output = decodeString(input);
        // System.out.println(" **** " + output);

        ArrayList aList = new ArrayList();
   
	    //populate ArrayList object
	    aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");
	   
	   
	    System.out.println("ArrayList before removal : ");
	    for(int i=0; i< aList.size(); i++)
	      System.out.println(aList.get(i));
	     
	    //get an Iterator
	    Iterator itr = aList.iterator();
	   
	    //remove 2 from ArrayList using Iterator's remove method.
	    String strElement = "";
	    while(itr.hasNext()){
	     
	      /*
	        Iterator's next method returns an Object so we need to cast it into
	        appropriate class before using it.
	      */
	      strElement = (String)itr.next();
	      if(strElement.equals("2"))
	      {
	        /*
	          Remove an element using remove() method of Iterator
	          Remove method removes an element from underlying collection and
	          it may throw a UnsupportedOperationException if the remove
	          operation is not supported.
	        */
	        itr.remove();
	        System.out.println("current element after removal! " + itr.next());
	        break;
	      }
	     
     
     
    }
   
    System.out.println("ArrayList after removal : ");
    for(int i=0; i< aList.size(); i++)
      System.out.println(aList.get(i));
        
    }

    public static String decodeString(String s) {
    	char[] charArray = s.toCharArray();

    	StringBuilder sb = new StringBuilder();

    	for(int i =0;i<charArray.length;i++){
    		if(Character.isLetter(charArray[i])){
    			sb.append(charArray[i]);
    		}	
    		else if (Character.isDigit(charArray[i])) {
    			//DIGIT
    			//CAPTURE EVERYTHING IN BETWEEN BRACKETS
    			int repeat = charArray[i];
    			StringBuilder sb2 = new StringBuilder(); 
    			i++;
    			i++;
    			while(Character.toString(charArray[i]) != CLOSE_BRACE){
    				//A CHARECTER TO REPEAT
    				sb2.append(charArray[i]);
    				i++;
    			}
    			while(repeat != 0){
    				sb.append(sb2.toString());
    				repeat--;
    			}
    			//i++; //NEXT ALPHABETIC CHARECTER. ADVANCED BY OUTTER LOOP

    		}
    		else 
    			System.out.println("ERROR. UNRECOGNIZED CHARECTER");
    	} // FOR LOOP
 		return sb.toString();   	
	}

	//RECURSIVE METHOD
	public StringBuilder process(){
		return null;
	}

}