
public class ConcreteVideoPlayer implements VideoPlayer {

	VideoAdapter videoAdapter;

	@Override
	public void play(String videoType, String fileName) {
		if(videoType.equalsIgnoreCase("mp4")){
			System.out.println("Playing " + fileName + ".mp4 file");
		}else if(videoType.equalsIgnoreCase("mkv") || videoType.equalsIgnoreCase("avi")){
			videoAdapter = new VideoAdapter(videoType);
			videoAdapter.play(videoType, fileName);
		}else{
			System.out.println("Invalid file type! " + videoType + " is not supported!");
		}
	}
	
	
}
