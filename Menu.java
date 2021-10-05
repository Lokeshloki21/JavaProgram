class Menu{
	public static void setAndDisplayItems(String hotelNAme,String[] items)
	{
		System.out.println("invoked setAndDisplayItems");
		System.out.println("hotel Name :+hotel items");
		for(int itemIndex=0;itemIndex<items.length;)
		{
			String item=items[itemIndex];
			System.out.println(item);
			itemIndex++;
		}
	}
}
			