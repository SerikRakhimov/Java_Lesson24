package music;

/**
 * Музыкальный плэер для проигрывания поданного жанра музыки
 * Dependency Injection
 */
public class MusicPlayer {
    //объявления поля
    private Music music;

    private String volume;

    private Integer power;

    private Boolean isWorking;

    public MusicPlayer(Music music){
        this.music = music;
    }

    /**
     * дефолтный конструктор
     */
    public MusicPlayer(){}

    /**
     * метод проигрывающий любой жанр музыки
     */
    public void play(){
        System.out.println("MusicPlayer play: " + music.song());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * правильный метод для видимости Springa
     * @param isWorking - рабочий ли музыкальный плэеер
     */
    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }

    /**
     * нехороший метод, Spring его никогда не увидит
     * @param working - рабочий ли музыкальный плэеер
     */
    public void setWorking(Boolean working) {
        isWorking = working;
    }

    public Music getMusic() {
        return music;
    }

    public String getVolume() {
        return volume;
    }

    public Integer getPower() {
        return power;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }
}
