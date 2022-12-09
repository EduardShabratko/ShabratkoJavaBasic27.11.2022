
public class Main2 {
    public static void main(String[] args) {
        int a = 9; // length
        int b = 6; // width
        int c = 3;
        int n = 10;
        int s = 22;// height
        System.out.println("teamNavi=" + (a + b + c + n + s) / 5);

        int q = 5;
        int w = 3;
        int e = 7;
        int r = 8;
        int t = 4;
        double score = (double) (q + w + e + r + t) / 5;

        System.out.println("teamSpirit=" + (score));

        int teamNavi = 10;
        double teamSpirit = 5.4;
        if (teamNavi > teamSpirit){
            System.out.println("teamNavi won with a score 10 frags on average");
        }
    }
}