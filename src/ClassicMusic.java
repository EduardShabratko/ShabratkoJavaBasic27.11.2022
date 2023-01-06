public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String GroupName, MusicStyles musicStyles) {
        super(GroupName, musicStyles);
    }

    public ClassicMusic() {
        super();
    }

    @Override
    public void playMusic() {
        System.out.println("We are playing ClassicMusic ");
    }
}