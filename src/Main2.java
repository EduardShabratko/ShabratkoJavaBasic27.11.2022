
public class Main2 {
    public static void main (String[] args) {
        int p = 5; // Number of players teamNavi
        int a = 9;
        int b = 6;
        int c = 3;
        int n = 10;
        int s = 22;
        double teamNavi = (double) (a + b + c + n + s) / p;
        System.out.println("teamNavi = " + (teamNavi));
        int i = 5; // Number of players teamSpirit
        int q = 5;
        int w = 3;
        int e = 7;
        int r = 8;
        int t = 4;
        double teamSpirit = (double) (q + w + e + r + t) / i;

        System.out.println("teamSpirit = " + (teamSpirit));


        if (teamNavi > teamSpirit){
            System.out.println("teamNavi won with a score 10 frags on average");
        }else {
            System.out.println("teamSpirit won with a lot of frags on average");
        }
    }

}