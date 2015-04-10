
public class VideoAdapter implements VideoPlayer{

	AdvancedVideoPlayer advancedVideoPlayer;
	
	public VideoAdapter(String videoType){
		if(videoType.equalsIgnoreCase("mkv")){
			advancedVideoPlayer = new MkvPlayer();
		}else if(videoType.equalsIgnoreCase("avi")){
			advancedVideoPlayer = new AviPlayer();
		}
	}

	@Override
	public void play(String videoType, String fileName) {

		if(videoType.equalsIgnoreCase("mkv")){
			advancedVideoPlayer.playMkv(fileName);
		}else if(videoType.equalsIgnoreCase("avi")){
			advancedVideoPlayer.playAvi(fileName);
		}
		
	}
	
	
}
