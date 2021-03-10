package ua.alevel.git;

public class countWords {
    public static void main(String[] args) {
        String str = "hello from the another side";
        int counter = 0;
        boolean lookForGap = false;
        for (int i = 0; i < str.length(); i++) {
            if (lookForGap) { //look for gap
                if (str.charAt(i) == ' ') { //gap found
                    lookForGap = false;
                }
            } else if (!lookForGap) { //look for word
                //System.out.println(str.charAt(i));
                if (str.charAt(i) != ' ') { //word found
                    lookForGap = true;
                    counter++;
                }
            }

        }
        System.out.println("words found " + counter);
    }
}
