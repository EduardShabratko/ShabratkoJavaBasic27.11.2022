public class MainMusicStyles {
    public MusicStyles musicStyles;
    public String GroupName;

    public MainMusicStyles(String GroupName, MusicStyles musicStyles) {
        this.musicStyles = musicStyles;
        this.GroupName = GroupName;
    }

    public static void main(String[] args) {
        ClassicMusic MusicClass = new ClassicMusic();
        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();

        MainMusicStyles[] mains = {new MainMusicStyles("ClassicGroup", MusicClass),
                new MainMusicStyles("RockGroup", rockMusic),
                new MainMusicStyles("PopGroup", popMusic)};


        for (MainMusicStyles u : mains) {
            System.out.print(u.GroupName + " ");
            u.musicStyles.playMusic();
        }
    }
}



