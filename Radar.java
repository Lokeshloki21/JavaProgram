class Radar
{
	public static void detection(int speed)
	{
		if(speed>120)
		{
			System.out.println("Danger-Msg to control room");
		}
		if(speed>100)
		{
			System.out.println("Give him a chance");
		}
		if(speed>80)
		{
			System.out.println("check one more time");
		}
		if(speed>60)
		{
			System.out.println("leave him");
		}
		if(speed<50)
		{
			System.out.println("hastag safe rider");
			return;
		}
		else
			if(speed>120)
		{
			System.out.println("Attack him");
			return;
		}
	}
}
			
		