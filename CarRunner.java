class CarRunner{
	
	public static void main(String[] args)
	{
		int rajashekaraKmDriven=200000;
		int dakshayiniKmDriven=100000;
		int vidyaKmDriven=75000;
		int lokeshKmDriven=60000;
		
		int[] KmDrivenGroup={rajashekaraKmDriven,dakshayiniKmDriven,vidyaKmDriven,lokeshKmDriven};
		int tempRef=KmDrivenGroup[2];
		System.out.println(tempRef);
		int tempRef2=KmDrivenGroup[3];
		System.out.println("=========");
		for(int index=0;index<KmDrivenGroup.length;)
		{
			int temp=KmDrivenGroup[index];
			System.out.println(temp);
			index++;
		}
	}
}