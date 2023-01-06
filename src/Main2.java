
public class Main2 {

    public MusicStyles musicStyles;
    public String GroupName;

    public Main2(String GroupName , MusicStyles musicStyles) {
        this.musicStyles= musicStyles;
        this.GroupName = GroupName;
    }
    public static void main (String[] args) {
       ClassicMusic MusicClass = new ClassicMusic();
       PopMusic popMusic = new PopMusic();
       RockMusic rockMusic = new RockMusic();

       Main2[] mains = { new Main2("ClassicGroup",MusicClass),
               new Main2("RockGroup",rockMusic),
       new Main2("PopGroup",popMusic)};


        for (Main2 u: mains) {
            System.out.print(u.GroupName + " ");
            u.musicStyles.playMusic();
        }
       }


    }

