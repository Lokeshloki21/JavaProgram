class Speaker
{
	public static void volume(int level)
	{
		if(level<=0)
		{
			System.out.println("on it first");
		}
		if(level<=3)
		{
			System.out.println("okie");
		}
		if(level>3)
		{
			System.out.println("loud");
		}
		if(level>5)
		{
			System.out.println("too loud");
		}
		if(level>9)
		{
			System.out.println("call the police");
		}
		else
		{
			System.out.println("change the speaker");
		}
	}
}
			
