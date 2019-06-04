public class Main {

    static String name =  "勇者キヨヒコ";
    static int lv = 70;

    public static void main(String[] args) {

        putJyosyou();

        if (lv > 80) {
            System.out.println("レベル" + lv + "なので余裕でしたwww");
        } else if (lv > 50) {
            System.out.println("レベル" + lv + "なので倒せました");
        } else  {
            System.out.println("レベル" + lv + "なので苦戦しました");
        }
    }

    static void putJyosyou() {
        System.out.println("魔王が世界を滅ぼそうとしています。");
        System.out.println(name + "はレベル" + lv + "のツワモノです。");
    }

    static void putGameOver () {
        System.out.println(name + "は魔王に敗れましたorz");
        System.out.println("GAME OVER");
    }
}
