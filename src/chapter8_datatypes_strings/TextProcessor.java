package chapter8_datatypes_strings;

public class TextProcessor {

    public static void main(String[] args) {
       // countWords("I love Test Automation University and Programming");
       // reverseString("Hello TUA");
        addSpaces("HeyWorld!It'sMeMas");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them.
     * @param text Full string to be slit
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numOfWords = words.length;

        String message = String.format("Your text contains %d words:", numOfWords);
        System.out.println(message);

        for (int i=0; i < numOfWords; i++){
            System.out.println(words[i]);
        }

    }

    /**
     * Prints a String in reverse order.
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }

    }

    /**
     * Adds spaces before each uppercase letter.
     * @param text jumbled text
     *
     */
    public static void addSpaces(String text){

        var modifiedText = new StringBuffer(text);

        for(int i =0; i < modifiedText.length(); i++){
                if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                    modifiedText.insert(i, " ");
                    i++;
                }
        }
        System.out.println(modifiedText);
    }

}

