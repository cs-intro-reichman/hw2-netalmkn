public class Cheers {
    public static void main(String[] args) {
        String cheer = args[0];
        String anLetters = "AEFHILMNORSX";
        int numCheers = Integer.parseInt(args[1]);

        for (int i = 0; i < cheer.length(); i++) {
            char c = cheer.charAt(i);
            char upper = Character.toUpperCase(c);
            if (anLetters.indexOf(upper) != -1) {
                System.out.println("Give me an " + upper + ": " + upper + "!");
            } 
            else {

                System.out.println("Give me a  " + upper + ": " + upper + "!");
            }
        }

        System.out.println("What does that spell?");

        for (int i = 0; i < numCheers; i++) {
            System.out.println(cheer.toUpperCase() + "!!!");
        }
    }
}
