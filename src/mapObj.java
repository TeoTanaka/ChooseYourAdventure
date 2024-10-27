import java.util.Objects;

public class mapObj {
    public int x,y,value,speed;
    public String type,color;
    public String icon;
    public mapObj(int _x, int _y,String _type){
        x = _x;
        y = _y;
        type = _type;
        setIcon();
    }
    public void render(){
        setIcon();
        Main.map[x][y] = icon;
    }


    public void setIcon(){
        if (Objects.equals(type, "player1")){
            icon = Main.toColor("\uD83D\uDC51","red");
            value = 50;
            speed = 1;
            color = "red";
        }
        if (Objects.equals(type, "player2")){
            icon = Main.toColor("\uD83D\uDC51","blue");
            value = 50;
            speed = 1;
            color = "blue";
        }
        if (Objects.equals(type, "redCastle")){
            icon = Main.toColor("\uD83C\uDFF0","red");
            value = 40;
            speed = 0;
            color = "red";
        }
        if (Objects.equals(type, "blueCastle")){
            icon = Main.toColor("\uD83C\uDFF0","blue");
            value = 40;
            speed = 0;
            color = "blue";
        }
        if (Objects.equals(type, "redFort")){
            icon = Main.toColor("♜","red");
            value = 30;
            speed = 0;
            color = "red";
        }
        if (Objects.equals(type, "blueFort")){
            icon =  Main.toColor("♜","blue");
            value = 30;
            speed = 0;
            color = "blue";
        }
        if (Objects.equals(type, "redCamp")){
            icon = Main.toColor("⛺","red");
            value = 15;
            speed = 0;
            color = "red";
        }
        if (Objects.equals(type, "blueCamp")){
            icon = Main.toColor("⛺","blue");
            value = 15;
            speed = 0;
            color = "blue";
        }
        if (Objects.equals(type, "bluePeasant")) {
            icon = Main.toColor("\uD83E\uDDCD", "blue");
            value = 1;
            speed = 1;
            color = "red";
        }

        if (Objects.equals(type, "redPeasant")) {
            icon = Main.toColor("\uD83E\uDDCD", "red");
            value = 1;
            speed = 1;
            color = "blue";
        }

        if (Objects.equals(type, "blueCavalier")) {
            icon = Main.toColor("\uD83D\uDC0E", "blue");
            value = 4;
            speed = 3;
            color = "red";
        }

        if (Objects.equals(type, "redCavalier")) {
            icon = Main.toColor("\uD83D\uDC0E", "red");
            value = 4;
            speed = 3;
            color = "blue";
        }

        if (Objects.equals(type, "blueDragon")) {
            icon = Main.toColor("\uD83D\uDC09", "blue");
            value = 16;
            speed = 4;
            color = "red";
        }

        if (Objects.equals(type, "redDragon")) {
            icon = Main.toColor("\uD83D\uDC09", "red");
            value = 16;
            speed = 4;
            color = "blue";
        }

        if (Objects.equals(type, "blueSoldier")) {
            icon = Main.toColor("⚔️", "blue");
            value = 3;
            speed = 1;
            color = "red";
        }

        if (Objects.equals(type, "redSoldier")) {
            icon = Main.toColor("⚔️", "red");
            value = 3;
            speed = 1;
            color = "blue";
        }

        if (Objects.equals(type, "blueWizard")) {
            icon = Main.toColor("\uD83E\uDDD9\u200D♀️", "blue");
            value = 10;
            speed = 2;
            color = "red";
        }

        if (Objects.equals(type, "redWizard")) {
            icon = Main.toColor("\uD83E\uDDD9\u200D♀️", "red");
            value = 10;
            speed = 2;
            color = "blue";
        }

        if (Objects.equals(type, "blueKnight")) {
            icon = Main.toColor("⛨", "blue");
            value =7;
            speed = 2;
            color = "red";
        }

        if (Objects.equals(type, "redKnight")) {
            icon = Main.toColor("⛨", "red");
            value = 7;
            speed = 2;
            color = "blue";
        }


    }


}
