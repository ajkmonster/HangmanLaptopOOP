import java.util.*;

public class HangmanLaptop {
    private static String[] list2 = new String[]{"","","","","","","","","","",""};
    private static int wrongNum=0;
    private static String results;
    private static String userGuess;
    public static void main(String[] args) {
        InitializeWords initialize  = new InitializeWords();
initialize.setWords();
        WelcomeMessage welcome = new WelcomeMessage();
        System.out.println(welcome.getWelcomeMessage());
        RandomGenerator index = new RandomGenerator();
        index.setIndex();
        index.getIndex();
        LettersofWord letters = new LettersofWord();
        letters.setSplitStr();
        letters.getSplitStr();
        IntCharNumber list = new IntCharNumber();
        list.setList();
        list.getList();
        System.out.print("The word I'm thinking of: ");
        for (String s: list.getList()) {
            System.out.print(s);
        }
        System.out.println("\n");
        game(initialize.getWords(),letters.getSplitStr(),list.getList(),index.getIndex());
        wonGame(initialize.getWords(),index.getIndex());
    }


    private static void game(ArrayList<String> words,String[] splitStr, String[] list,int index) {

           do {
               System.out.println("Please enter your guess: ");
               Scanner key = new Scanner(System.in);
               userGuess = key.nextLine().toLowerCase();
               if (wrongNum>=6) {
                   break;
               }
               if (!userGuess.equalsIgnoreCase(words.get(index))) {
                   for (int i = 0; i < splitStr.length; i++) {
                       if (splitStr[i].equalsIgnoreCase(userGuess)) {
                           list[i] = userGuess;
                           stringJoiner(list);
                       }
                   }
                   wrongChecker(list);
                   yourGuess(list);
               } else if (userGuess.equalsIgnoreCase(words.get(index))){
                   break;
               }
           }while(!words.get(index).equalsIgnoreCase(results));
    }

    private static void yourGuess(String[] list) {
        System.out.print("Your guess so far: ");
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println("\n");
    }
    private static void stringJoiner(String[] list) {
        list2 = list;
        results = String.join("", list2);
    }
    private static void wonGame(ArrayList<String> words,int index) {
        if (wrongNum < 6) {
            System.out.println("You've won the game congrats!");
        } else {
            System.out.println("Sorry, you have no more guesses left. The word was "+words.get(index));
        }
    }
    private  static void wrongChecker (String[] list){
        boolean contains = false;
        for (String c:list){
            if (c.equalsIgnoreCase(userGuess)) {
                contains = true;
            }
        }
        if (!contains) {
            wrongNum+=1;
        }
        System.out.println("You've guessed wrong "+wrongNum+"/6 times.");
    }
}
