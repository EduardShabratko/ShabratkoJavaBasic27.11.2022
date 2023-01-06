public class RockMusic extends MusicStyles{


    public RockMusic(String GroupName, MusicStyles musicStyles) {
        super(GroupName, musicStyles);
    }

    public RockMusic() {

    }

    @Override
    public void playMusic() {
        System.out.println("We are playing RockMusic ");
    }
}
