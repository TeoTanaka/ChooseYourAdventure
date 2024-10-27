import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String name;
    public static int mapWidth = 100;
    public static int mapHeight = 100;
    public static String player1,redCastle,redFort,redCamp,redKnight,redWizard,redSoldier,redDragon,redCavalier,redPeasant;
    public static String player2,blueCastle,blueFort,blueCamp,blueKnight,blueWizard,blueSoldier,blueDragon,blueCavalier,bluePeasant;
    public static String[][] map = new String[mapHeight][mapWidth];
    public static mapObj[] objects = {new mapObj(10,10,redCastle)};

    public static void main(String[] args) {
        print(toColor("Hello, enter your name","blue"));
        name = scanner.nextLine();
        print("Hello "+name+", ");
        //setIcons();
        fillMap();
        displayMap();
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
    public static void displayMap(){
        fillMap();
        for(mapObj m : objects){
            m.render();
        }
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
        for (int row = 0; row < mapHeight; row++) {
            for (int col = 0; col < mapWidth; col++) {
                map[row][col] = toColor(" ","green");
            }
        }
    }
    public static void printMap(){
        int row = 0;
        for (int x = 0; x <mapWidth && row <mapHeight;x++){
            System.out.print(map[row][x]);
            if(x == mapWidth-1){
                System.out.print(map[row][mapWidth-1]+"\n");
                x = 0;
                row+=1;
            }
        }

    }
    public static void move(){
        for (mapObj m : objects){

        }
    }
//    public static void setIcons(){
//        player1 = toColor("\uD83D\uDC51","red");
//        player2 = toColor("\uD83D\uDC51","blue");
//        redCastle = toColor("\uD83C\uDFF0","red");
//        blueCastle = toColor("\uD83C\uDFF0","blue");
//        redFort = toColor("♜","red");
//        blueFort = toColor("♜","blue");
//        redCamp = toColor("⛺","red");
//        blueCamp = toColor("⛺","blue");
//        redKnight = toColor("⛨","red");
//        blueKnight = toColor("⛨","blue");
//        redWizard = toColor("\uD83E\uDDD9\u200D♀️","red");
//        blueWizard = toColor("\uD83E\uDDD9\u200D♀️","blue");
//        redSoldier = toColor("⚔️","red");
//        blueSoldier = toColor("⚔️","blue");
//        redDragon = toColor("\uD83D\uDC09","red");
//        blueDragon = toColor("\uD83D\uDC09","blue");
//        redCavalier = toColor("\uD83D\uDC0E","red");
//        blueCavalier = toColor("\uD83D\uDC0E","blue");
//        redPeasant = toColor("\uD83E\uDDCD","red");
//        bluePeasant = toColor("\uD83E\uDDCD","blue");
//    }
}



