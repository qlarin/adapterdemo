
public class AdapterTest {

	public static void main(String[] args){
		ConcreteVideoPlayer videoPlayer = new ConcreteVideoPlayer();
		
		videoPlayer.play("avi", "starwars");
		videoPlayer.play("mkv", "gladiator");
		videoPlayer.play("mp4", "fastandfurious");
		videoPlayer.play("wmv", "dealwithit");
		
	}
}
