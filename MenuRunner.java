class MenuRunner{
	public static void main(String[] args)
	{
		String hotel="RajaDaksha";
		String[] items={"Masala Dosa","Chapathi","idli","Tea"};
		Menu.setAndDisplayItems(hotel,items);
		String hotel2="Vidya";
		String[] vidyaHotelItem={"Bonda Soup","Curd","Rice","Seed"};
		Menu.setAndDisplayItems(hotel2,vidyaHotelItem);
	}
}