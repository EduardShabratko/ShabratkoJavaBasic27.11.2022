public class PopMusic extends MusicStyles {

    public PopMusic(String GroupName, MusicStyles musicStyles) {
        super(GroupName, musicStyles);
    }

    public PopMusic() {

    }

    @Override
    public void playMusic() {
        System.out.println("We are playing PopMusic ");
    }
}