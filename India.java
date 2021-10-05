class India{
	public static String states(String[] states)
	{
		System.out.println("invoked states");
		int size= states.length;
		if(size>1)
		{
			return "KARNATAKA";
		}
		if(size>2)
		{
			return "TAMILNADU";
		}
		if(size>3)
		{
			return "MP";
		}
		if(size>4)
		{
			return "UP";
		}
		else if(size<2)
		{
			return "KERALA";
		}	
	return "NA";	
	}
}