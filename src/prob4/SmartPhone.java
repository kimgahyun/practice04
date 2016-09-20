package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}
		else if( function.equals("앱") )
		{
			playApp();
			return;
		}
		else if( function.equals("통화") )
		{
			super.execute(function);
			return;
		}
	}
	
	public void playMusic()
	{
		System.out.println( "다운로드해서 음악재생" );
	}
	
	public void playApp()
	{
		System.out.println( "앱실행 " );
	}
	
}
