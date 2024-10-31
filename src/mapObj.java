import java.util.Objects;

public class mapObj {
    public int x;
    public int y;
    public int value;
    public int speed;
    public int range;
    public int damage;
    public boolean dead;
    public String type,color;
    public String icon;
    public mapObj(int _x, int _y,String _type){
        x = _y;//because the coordinate system on 2d arrays are flipped
        y = _x;
        type = _type;
        setIcon();

    }
    public void render(){
        Main.map[x][y] = icon;
    }


    public void setIcon(){
        if (Objects.equals(type, "player1")){
            icon = Main.toColor("\uD83D\uDC51","red");
            value = 35;
            speed = 1;
            color = "red";
            range = 1;
            damage = 7;
        }
        if (Objects.equals(type, "player2")){
            icon = Main.toColor("\uD83D\uDC51","blue");
            value = 35;
            speed = 1;
            color = "blue";
            range = 1;
            damage = 7;
        }
        if (Objects.equals(type, "redCastle")){
            icon = Main.toColor("\uD83C\uDFF0","red");
            value = 40;
            speed = 0;
            color = "red";
            range = 3;
            damage = 2;
        }
        if (Objects.equals(type, "blueCastle")){
            icon = Main.toColor("\uD83C\uDFF0","blue");
            value = 40;
            speed = 0;
            color = "blue";
            range = 3;
            damage = 2;
        }
        if (Objects.equals(type, "redFort")){
            icon = Main.toColor("♜","red");
            value = 30;
            speed = 0;
            color = "red";
            range = 3;
            damage = 2;
        }
        if (Objects.equals(type, "blueFort")){
            icon =  Main.toColor("♜","blue");
            value = 30;
            speed = 0;
            color = "blue";
            range = 3;
            damage = 2;
        }
        if (Objects.equals(type, "redCamp")){
            icon = Main.toColor("⛺","red");
            value = 15;
            speed = 0;
            color = "red";
            range = 1;
            damage = 1;
        }
        if (Objects.equals(type, "blueCamp")){
            icon = Main.toColor("⛺","blue");
            value = 15;
            speed = 0;
            color = "blue";
            range = 1;
            damage = 1;
        }
        if (Objects.equals(type, "blueCity")) {
            icon = Main.toColor("\uD83C\uDFE0", "blue");
            value = 1;
            speed = 1;
            color = "blue";
            range = 1;
            damage = 1;
        }

        if (Objects.equals(type, "redCity")) {
            icon = Main.toColor("\uD83C\uDFE0", "red");
            value = 1;
            speed = 1;
            color = "red";
            range = 1;
            damage = 1;
        }

        if (Objects.equals(type, "blueCavalier")) {
            icon = Main.toColor("\uD83D\uDC0E", "blue");
            value = 4;
            speed = 3;
            color = "blue";
            range = 2;
            damage = 4;
        }

        if (Objects.equals(type, "redCavalier")) {
            icon = Main.toColor("\uD83D\uDC0E", "red");
            value = 4;
            speed = 3;
            color = "red";
            range = 2;
            damage = 4;
        }

        if (Objects.equals(type, "blueDragon")) {
            icon = Main.toColor("🐉", "blue");
            value = 16;
            speed = 4;
            color = "blue";
            range = 4;
            damage = 8;
        }

        if (Objects.equals(type, "redDragon")) {
            icon = Main.toColor("🐉", "red");
            value = 16;
            speed = 4;
            color = "red";
            range = 4;
            damage = 8;
        }

        if (Objects.equals(type, "blueSoldier")) {
            icon = Main.toColor("⚔️", "blue");
            value = 3;
            speed = 1;
            color = "blue";
            range = 1;
            damage = 1;
        }

        if (Objects.equals(type, "redSoldier")) {
            icon = Main.toColor("⚔️", "red");
            value = 3;
            speed = 1;
            color = "red";
            range = 1;
            damage = 1;
        }

        if (Objects.equals(type, "blueWizard")) {
            icon = Main.toColor("\uD83E\uDDD9\u200D♀️", "blue");
            value = 8;
            speed = 2;
            color = "blue";
            range = 6;
            damage = 6;
        }

        if (Objects.equals(type, "redWizard")) {
            icon = Main.toColor("\uD83E\uDDD9\u200D♀️", "red");
            value = 8;
            speed = 2;
            color = "red";
            range = 6;
            damage = 8;
        }

        if (Objects.equals(type, "blueKnight")) {
            icon = Main.toColor("⛨", "blue");
            value =10;
            speed = 2;
            color = "blue";
            range = 1;
            damage = 5;
        }

        if (Objects.equals(type, "redKnight")) {
            icon = Main.toColor("⛨", "red");
            value = 10;
            speed = 2;
            color = "red";
            range = 1;
            damage = 7;
        }
        if (Objects.equals(type, "redArcher")) {
            icon = Main.toColor("\uD83C\uDFF9", "red");
            value = 4;
            speed = 1;
            color = "red";
            range = 5;
            damage = 2;
        }
        if (Objects.equals(type, "blueArcher")) {
            icon = Main.toColor("\uD83C\uDFF9", "blue");
            value = 4;
            speed = 1;
            color = "blue";
            range = 5;
            damage = 2;
        }


    }


}
