import java.util.*;

public class HangmanLaptop {
    private static String[] list2 = new String[]{"","","","","","","","","","",""};
    private static int wrongNum=0;
    private static String results;
    private static String userGuess;
    private static ArrayList<String> words = new ArrayList<>();
    public static void main(String[] args) {
        InitializeWords initialize  = new InitializeWords();
        initialize.setWords(words);
        initialize.getWords();
        WelcomeMessage welcome = new WelcomeMessage();
        System.out.println(welcome.getWelcomeMessage());
        RandomGenerator index = new RandomGenerator();
        index.setIndex(initialize.getWords());
        LettersofWord letters = new LettersofWord();
        letters.setSplitStr(initialize.getWords(),index.getIndex());
        IntCharNumber list = new IntCharNumber();
        list.setList(letters.getSplitStr());
        System.out.print("The word I'm thinking of: ");
        for (String s: list.getList()) {
            System.out.print(s);
        }
        System.out.println("\n");
        do {
            System.out.println("Please enter your guess: ");
            Scanner key = new Scanner(System.in);
            userGuess = key.nextLine().toLowerCase();
            if (wrongNum>=6) {
                break;
            }
            if (!userGuess.equalsIgnoreCase(initialize.getWords().get(index.getIndex()))) {
                for (int i = 0; i < letters.getSplitStr().length; i++) {
                    if (letters.getSplitStr()[i].equalsIgnoreCase(userGuess)) {
                        list.getList()[i] = userGuess;
                        stringJoiner(list.getList());
                    }
                }
                wrongChecker(list.getList());
                yourGuess(list.getList());
            } else if (userGuess.equalsIgnoreCase(initialize.getWords().get(index.getIndex()))){
                break;
            }
        }while(!initialize.getWords().get(index.getIndex()).equalsIgnoreCase(results));
        wonGame(initialize.getWords(),index.getIndex());
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
