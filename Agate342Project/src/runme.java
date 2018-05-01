import helper.ScanHelper;
public class runme {

	public static void main(String[] args) {
	int secimYap;
	{		
			System.out.println("|                                               |");
			System.out.println("|                   AGATE LTD                   |");
			System.out.println("|                                               |");
		    System.out.println("   			/\\_/\\  	 ");
		    System.out.println("  			/ o o \\  	 ");
			System.out.println("			(   \"   ) 	 ");
			System.out.println("  			\\~(*)~/  	 ");
			System.out.println("  			 // \\\\  	 ");
			    
		
			//ConsoleBasedGui
			
			
			System.out.println("|     1- Add a new client                       |");
			System.out.println("|     2- Add a new campaign                     |");
			System.out.println("|     5- Assign staff to work on a campaign     |");
			System.out.println("|     8- Create concept note                    |");
			System.out.println("|     12- Add a new member of staff             |");
			System.out.println("|     0- Exit                                   |");
			
			
			System.out.println("Enter a number=> ");
			secimYap = ScanHelper.scanInt();
			switch(secimYap) {
				
				/* case 1:
					AddNewClient.getInstance();
					break;
				case 2:
					AddNewCampaignUI.getInstance();
					break;
				case 5:
					System.out.println("assign staff to work on a campaign");
					break;
				case 8:
					System.out.println("Create concept note ");
					break;
				case 12:
					System.out.println("add a new member of staff");
					break;
					*/ 
			
				case 0:
					System.out.println("exit");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong! Try Again!");

					break;
}
}
}
}
