package lv.sda;

public class Main {

    public static void main(String[] args) {
        
        String str = "Spaghetti";
        int vowelsCounter = 0;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
            || str.charAt(i) == 'i' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o' || str.charAt(i) == 'u'){

                vowelsCounter++;
            }
        }
        System.out.println("There are: " + vowelsCounter + " vowels in the String - " + str);

    }
}
