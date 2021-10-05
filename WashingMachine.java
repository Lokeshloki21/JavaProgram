class WashingMachine{
	public static String washCloths(String[] cloths)
	{
		System.out.println("invoked washCloths");
		int size= cloths.length;
		if(size>0 && size<3)
		{
			return "START";
		}
		else if(size>5)
		{
			return "OVERLOAD";
		}
		return "NA";
	}
}