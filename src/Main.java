import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String name;
    public static boolean running = true;
    public static int mapWidth = 50;
    public static int mapHeight = 50;

    public static int redMoney = 20, blueMoney = 20;

    public static int cursorX = mapWidth/2;
    public static int cursorY = mapHeight/2;
    public static String[][] map = new String[mapHeight][mapWidth];
    public static String[][] storeMap = Geography.genTerrain(new String[mapWidth][mapHeight]);



    public static ArrayList<mapObj> objects = new ArrayList<>(List.of(new mapObj[]{
            new mapObj(25, 45, "redCastle"),
            new mapObj(25, 5, "blueCastle"),
            new mapObj(25, 44, "player1"),
            new mapObj(25, 6, "player2"),
    }));


    public static void main(String[] args) {
        print(toColor("Hello, enter your name","blue"));
        name = scanner.nextLine();
        print("Hello "+name+", ");
        fillMap();
        displayObj();
        map[cursorY][cursorX] = toColor("  ","magenta");
        printMap(1);
        while (running){
            turn(1
            );
            displayObj();
            printMap(2);
            turn(2);
            displayObj();
            printMap(2);
            redMoney +=5;
            blueMoney +=5;

        }

    }

    public static String move(String question, String answer1, String answer2, String answer3, String answer4){
        String answer = null;
        while(answer == null){
            //System.out.println("which direction wou");
            answer = scanner.nextLine();
            if (!Objects.equals(answer, answer1) && !Objects.equals(answer, answer2) &&! Objects.equals(answer, answer3)){
                answer = null;
                System.out.println("choose from "+answer1+","+answer2+","+answer3);
            }
        }
        return answer;

    }
    public static void displayObj(){
        fillMap();
        ArrayList<mapObj> filterList = new ArrayList<>(List.of(new mapObj[]{}));
        for(mapObj m : objects){
            if (m.value >= 0){
                filterList.add(m);
            }
            objects = filterList;
            if (m.value >0) {
                //System.out.println(m.icon);
                m.render();
            }
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

        for (int row = 0; row < Main.mapHeight; row++) {
            for (int col = 0; col < Main.mapWidth; col++) {
                map[row][col] = storeMap[row][col];
            }
        }
    }
    public static void printMap(int player){
        int row = 0;

        if (player ==1) {
            for (int x = 0; x < mapWidth && row < mapHeight; x++) {
                System.out.print(map[row][x]);
                if (x == mapWidth - 1) {
                    System.out.print(map[row][mapWidth - 1] + "\n");
                    x = 0;
                    row += 1;
                }
            }
        }else{
            row = mapHeight-1;
            for (int x = mapWidth-1; x >= 0 && row >=0; x--) {
                System.out.print(map[row][x]);
                if (x == 0) {
                    System.out.print(map[row][mapWidth - 1] + "\n");
                    x = mapWidth-1;
                    row -= 1;
                }
            }
        }


    }
    public static void turn(int player){
        int actionPoints;
        boolean buying =true;
        printMap(player);
        print("Its your turn player"+player);
        if (player == 1) {
            print("you have " + redMoney + " money to spend");
        }else{
            print("you have " + blueMoney + " money to spend");
        }
        while (buying) {
            String purchase = "";
            print("what would you like to buy [enter a number or nothing]");
            print("#1- 1 soldier for 3 coins");
            print("#2- 1 archer for 4 coins");
            print("#3- 1 knight for 10 coins");
            print("#4- 1 cavalier for 12 coins");
            print("#5- 1 wizard for 16 coins");
            print("#6- 1 dragon for 30 coins");

            purchase = scanner.nextLine();
            if(Objects.equals(purchase, "1")){
                if (player == 1 && redMoney >= 3){
                    objects.add(new mapObj(26,45,"redSoldier"));
                    redMoney -=3;
                }else if(player ==2 && blueMoney >= 3){
                    objects.add(new mapObj(26,5,"blueSoldier"));
                    blueMoney -=3;
                }else{
                    print("You don't have enough money to buy this");
                }
            }
            if(Objects.equals(purchase, "2")){
                if (player == 1 && redMoney >= 4){
                    objects.add(new mapObj(26,45,"redArcher"));
                    redMoney -=4;
                }else if(player ==2 && blueMoney >= 3){
                    objects.add(new mapObj(26,5,"blueArcher"));
                    blueMoney -=4;
                }else{
                    print("You don't have enough money to buy this");
                }
            }
            if(Objects.equals(purchase, "3")){
                if (player == 1 && redMoney >= 10) {
                    objects.add(new mapObj(26, 45, "redKnight"));
                    redMoney -=10;
                }else if(player ==2 && blueMoney >= 10){
                    objects.add(new mapObj(26,5,"blueKnight"));
                    blueMoney -=10;
                }else{
                    print("You don't have enough money to buy this");
                }
            }
            if(Objects.equals(purchase, "4")){
                if (player == 1 && redMoney >= 12){
                    objects.add(new mapObj(26,45,"redCavalier"));
                    redMoney -=12;
                }else if(player ==2 && blueMoney >= 12){
                    objects.add(new mapObj(26,5,"blueCavalier"));
                    blueMoney -=12;
                }else{
                    print("You don't have enough money to buy this");
                }

            }
            if(Objects.equals(purchase, "5")){
                if (player == 1 && redMoney >= 16){
                    objects.add(new mapObj(26,45,"redWizard"));
                    redMoney -=16;
                }else if(player ==2 && blueMoney >= 16){
                    objects.add(new mapObj(26,5,"blueWizard"));
                    blueMoney -=16;
                }else{
                    print("You don't have enough money to buy this");
                }

            }
            if(Objects.equals(purchase, "6")){
                if (player == 1 && redMoney >= 30){
                    objects.add(new mapObj(26,45,"redDragon"));
                    redMoney -=30;
                }else if(player ==2 && blueMoney >= 30){
                    objects.add(new mapObj(26,5,"blueDragon"));
                    blueMoney -=30;
                }else{
                    print("You don't have enough money to buy this");
                }


            }
            if(Objects.equals(purchase, "teoiscool")){
                objects.add(new mapObj(26,5,"redDragon"));
                objects.add(new mapObj(20,5,"redDragon"));
                objects.add(new mapObj(20,10,"redDragon"));
            }
            buying = false;
        }
        for (mapObj m : objects) {
            if (player == 1) {

                displayObj();
                printMap(1);
                if (Objects.equals(m.color, "red")) {
                    if (!Objects.equals(m.type, "redCastle") && !Objects.equals(m.type, "redCity")) {
                        print("enter w,a,s,d move " + m.type);
                        String direction = scanner.nextLine();
                        if (Objects.equals(direction, "w") && Objects.equals(map[m.y][m.x - m.speed], toColor("  ", "green"))) {
                            m.x -= m.speed;

                        }
                        if (Objects.equals(direction, "a") && Objects.equals(map[m.y-m.speed][m.x], toColor("  ", "green"))) {
                            m.y -= m.speed;
                        }
                        if (Objects.equals(direction, "s")&& Objects.equals(map[m.y][m.x - m.speed], toColor("  ", "green"))) {
                            m.x += m.speed;
                        }
                        if (Objects.equals(direction, "d")&& Objects.equals(map[m.y+m.speed][m.x], toColor("  ", "green"))) {
                            m.y += m.speed;
                        }
                        m.render();
                        encounter(m);
                    }
                }
                fillMap();
                displayObj();
                printMap(2);
            }
            if (player == 2) {
                displayObj();
                printMap(2);
                if (Objects.equals(m.color, "blue")) {
                    if (!Objects.equals(m.type, "blueCastle") && !Objects.equals(m.type, "blueCity")) {
                        print("enter w,a,s,d move " + m.type);
                        String direction = scanner.nextLine();
                        if (Objects.equals(direction, "w") && Objects.equals(map[m.y][m.x + m.speed], toColor("  ", "green"))) {
                            m.x += m.speed;
                        }
                        if (Objects.equals(direction, "a") && Objects.equals(map[m.y+m.speed][m.x], toColor("  ", "green"))) {
                            m.y += m.speed;
                        }
                        if (Objects.equals(direction, "s")&& Objects.equals(map[m.y][m.x - m.speed], toColor("  ", "green"))) {
                            m.x -= m.speed;
                        }
                        if (Objects.equals(direction, "d")&& Objects.equals(map[m.y-m.speed][m.x], toColor("  ", "green"))) {
                            m.y -= m.speed;
                        }
                        m.render();
                        encounter(m);
                    }
                }
            }
        }
        fillMap();
        displayObj();
        printMap(2);
        }
        public static void encounter(mapObj self){
            for (mapObj m : objects){
             if (Math.sqrt(Math.pow(Math.abs(m.x-self.x),2)+Math.pow(Math.abs(m.y-self.y),2)) <= self.range){
                 if (!(Objects.equals(m.color, self.color)) && m.value >=0) {
                     print("Your "+self.type+" encountered a "+m.type);
                     if (Objects.equals(self.type, "redSoldier") || Objects.equals(self.type, "blue Soldier") ||Objects.equals(self.type, "player1") || Objects.equals(self.type, "player2") || Objects.equals(self.type, "redKnight") || Objects.equals(self.type, "blueKnight") ){
                         print("Your "+self.type+" struck a "+m.type+" with its sword");
                         m.value -= self.damage;
                         if (m.value <=0){
                             print(m.type+" was killed");
                             //m.dead = true;
                         }
                     }
                     if (Objects.equals(self.type, "redCavalier") || Objects.equals(self.type, "blueCavalier")){
                         print("Your "+self.type+" charged "+m.type+" with its lance");
                         m.value -= self.damage;
                         if (m.value <=0){
                             print(m.type+" was killed");
                         }
                     }
                     if (Objects.equals(self.type, "redWizard") || Objects.equals(self.type, "blueWizard")){
                         print("Your "+self.type+" blasted "+m.type+" with a fireball");
                         m.value -= self.damage;
                         if (m.value <=0){
                             print(m.type+" was killed");
                         }
                     }
                     if (Objects.equals(self.type, "redArcher") || Objects.equals(self.type, "blueArcher")){
                         print("Your "+self.type+" shot "+m.type+" with its bow");
                         m.value -= self.damage;
                         if (m.value <=0){
                             print(m.type+" was killed");
                         }
                     }
                     if (Objects.equals(self.type, "redDragon") || Objects.equals(self.type, "blueDragon")){
                         print("Your "+self.type+" roasted "+m.type+" with its fire breath");
                         m.value -= self.damage;
                         if (m.value <=0){
                             print(m.type+" was killed");
                         }
                     }
                     print("press enter to continue");
                     scanner.nextLine();
                 }
             }
             displayObj();
            }

        }


    }






