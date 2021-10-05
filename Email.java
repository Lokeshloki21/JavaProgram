class Email{
	public static void sendMessage(boolean pointarg)
	{
		System.out.println("invoked sendMessage");
		boolean point=pointarg;
		if(point)
		{
			System.out.println("inside point");
		}
		System.out.println("after if.....");
	}
	
	public static boolean receiveMessage(String msg)
	{
		if(msg==null)
		{
			System.out.println("msg is not pointing");
			return false;
		}
		System.out.println("msg is pointing to some memory....");
		return true;
	}
	}