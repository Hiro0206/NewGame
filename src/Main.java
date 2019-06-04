public class Main {

    public static void main(String[] args) {
        String name =  "勇者キヨヒコ";
        int lv = 70;
        System.out.println("魔王が世界を滅ぼそうとしています。");
        System.out.println(name + "はレベル" + lv + "のツワモノです。");
        System.out.println(name + "は魔王を倒しました！");
        if (lv > 80) {
            System.out.println("レベル" + lv + "なので余裕でしたwww");
        } else if (lv > 50) {
            System.out.println("レベル" + lv + "なので倒せました");
        } else  {
            System.out.println("レベル" + lv + "なので苦戦しました");
        }
    }
}
