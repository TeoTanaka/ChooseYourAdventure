public class Geography {
    public static String[][] map = new String[Main.mapHeight][Main.mapWidth];

    public Geography(){

    }

    public static String[][] genTerrain(String[][] map){
        for (int row = 0; row < Main.mapHeight; row++) {
            for (int col = 0; col < Main.mapWidth; col++) {
                map[row][col] = Main.toColor("  ","green");
            }
        }
        for (int i = 0; i <=7; i++) {
            int x = rand();
            int y = rand();
            map[y][x] = Main.toColor("\uD83D\uDDFB", "green");
            if (Math.random() < .4 && y + 1 < Main.mapWidth) {
                map[y + 1][x] = Main.toColor("\uD83D\uDDFB", "green");
            }
            if (Math.random() < .9 && x + 1 < Main.mapWidth) {
                map[y][x + 1] = Main.toColor("\uD83D\uDDFB", "green");
            }
            if (Math.random() < .9 && y - 1 < Main.mapWidth && y - 1 >=0) {
                map[y - 1][x] = Main.toColor("\uD83D\uDDFB", "green");
            }
            if (Math.random() < .4 && x - 1 < Main.mapWidth && x - 1 >=0) {
                map[y][x - 1] = Main.toColor("\uD83D\uDDFB", "green");
            }
        }
        for (int i = 0; i <=7; i++) {
            int x = rand();
            int y = rand();
            map[y][x] = Main.toColor("〰️", "blue");
            if (Math.random() <= .9 && y + 1 < Main.mapWidth) {
                map[y + 1][x] = Main.toColor("〰️", "blue");
            }
            if (Math.random() <= .9 && x + 1 < Main.mapWidth) {
                map[y][x + 1] = Main.toColor("〰️", "blue");
            }
            if (Math.random() <= .9 && y - 1 < Main.mapWidth && y - 1 >=0) {
                map[y - 1][x] = Main.toColor("〰️", "blue");
            }
            if (Math.random() <= .9 && x - 1 < Main.mapWidth && x - 1 >=0) {
                map[y][x - 1] = Main.toColor("〰️", "blue");
            }
        }
        for (int i = 0; i <=10; i++) {
            int x = rand();
            int y = rand();
            map[y][x] = Main.toColor("\uD83C\uDF32", "green");
            if (Math.random() < .9 && y + 1 < Main.mapWidth) {
                map[y + 1][x] = Main.toColor("\uD83C\uDF32", "green");
            }
            if (Math.random() < .9 && x + 1 < Main.mapWidth) {
                map[y][x + 1] = Main.toColor("\uD83C\uDF32", "green");
            }
            if (Math.random() < .9 && y - 1 < Main.mapWidth && y - 1 >=0) {
                map[y - 1][x] = Main.toColor("\uD83C\uDF32", "green");
            }
            if (Math.random() < .9 && x - 1 < Main.mapWidth && x - 1 >=0) {
                map[y][x - 1] = Main.toColor("\uD83C\uDF32", "green");
            }
        }
        return map;
    }
    public static int rand(){
        return (int) (Math.random()* Main.mapWidth);
    }
}
