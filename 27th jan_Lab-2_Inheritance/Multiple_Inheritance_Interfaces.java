interface AudioPlayer
{
	void playAudio();
	void stopAudio();
}
interface VideoPlayer
{
	void playVideo();
	void stopVideo();
}

class SmartDevice implements AudioPlayer,VideoPlayer
{
	public void playAudio()
	{
		System.out.println("Playing audio");
	}
	public void stopAudio()
	{
		System.out.println("Stopping audio");
	}
	public void playVideo()
	{
		System.out.println("Playing video");
	}
	public void stopVideo()
	{
		System.out.println("Stopping video");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice sd = new SmartDevice();
		sd.playAudio();
		sd.stopAudio();
		sd.playVideo();
		sd.stopVideo();
	}

}
