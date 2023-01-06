public class MusicStyles {
    public MusicStyles musicStyles;
    public String GroupName;

    public MusicStyles(String GroupName, MusicStyles musicStyles) {
        this.musicStyles = musicStyles;
        this.GroupName = GroupName;
    }

    public MusicStyles() {

    }

    public void playMusic() {
    }


    public static void main(String[] args) {
        ClassicMusic MusicClass = new ClassicMusic();
        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();

        MusicStyles[] mains = {new MusicStyles("ClassicGroup", MusicClass),
                new MusicStyles("RockGroup", rockMusic),
                new MusicStyles("PopGroup", popMusic)};


        for (MusicStyles u : mains) {
            System.out.print(u.GroupName + " ");
            u.musicStyles.playMusic();
        }
    }
}
