package music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {
    public static void main(String[] args) {

        /**
         * new music.ClassicMusic()
         *
         */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationsContext.xml");



        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(" musicPlayer1 : " + musicPlayer1);

        System.out.println(" musicPlayer2 : " + musicPlayer2);


//
//        musicPlayer.play();
//
//
//
//        System.out.println(musicPlayer.getIsWorking());
//        System.out.println(musicPlayer.getPower());
//        System.out.println(musicPlayer.getVolume());

        context.close();


    }
}
