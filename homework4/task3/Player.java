package homework4.task3;

public class Player implements Playable, Recodable{
  public   void play(){
        System.out.println("Play");
    }
    public void pause(){
        System.out.println("Pause");
    }
   public void stop(){
        System.out.println("Stop");
    }
   public void record(){
        System.out.println("Record");
    }

    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.record();
        player.stop();

    }
}
