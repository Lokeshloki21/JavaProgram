class IronBoxRunner{
	public static void main(String[] values)
	{
		String clothType="Cotton";		
		IronBox.heating(clothType);
		int temp=47;
		IronBox.heating(temp);
		IronBox.heating(78);
	}
}