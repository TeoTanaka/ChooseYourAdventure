import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String name;
    public static String[][] map = new String[50][50];
    public static void main(String[] args) {
        print(toColor("Hello, enter your name","blue"));
        name = scanner.nextLine();
        print("Hello "+name+", ");
        fillMap();
        printMap();
    }

    public static String getInput(String question, String answer1, String answer2, String answer3){
        String answer = null;
        while(answer == null){
            System.out.println(question+" ("+answer1+","+answer2+","+answer3+")");
            answer = scanner.nextLine();
            if (!Objects.equals(answer, answer1) && !Objects.equals(answer, answer2) &&! Objects.equals(answer, answer3)){
                answer = null;
                System.out.println("choose from "+answer1+","+answer2+","+answer3);
            }
        }
        return answer;

    }
    public static void print(String input){
        System.out.println(input);
    }
    public static String toColor(String input, String color){
        if (Objects.equals(color, "blue")){
            input ="\u001B[44m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "cyan")){
            input ="\u001B[46m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "black")){
            input ="\u001B[40m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "red")){
            input ="\u001B[41m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "white")){
            input ="\u001B[47m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "green")){
            input ="\u001B[42m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "yellow")){
            input ="\u001B[43m"+input+"\u001B[0m";
            return input;
        }
        if (Objects.equals(color, "magenta")){
            input ="\u001B[45m"+input+"\u001B[0m";
        }
        return input;
    }
    public static void fillMap(){
        for (int row = 0; row < 50; row++) {
            for (int col = 0; col < 50; col++) {
                map[row][col] = toColor(" ","green");
            }
        }
    }
    public static void printMap(){
        int row = 0;
        for (int x = 0; x <=49 && row <=49;x++){
            System.out.print(map[row][x]);
            if(x == 48){
                System.out.print(map[row][49]+"\n");
                x = 0;
                row+=1;
            }
        }

    }
}


