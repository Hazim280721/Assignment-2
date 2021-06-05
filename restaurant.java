import java.util.Scanner;

abstract class restaurant { //user define class //abstraction
	private String info;
	String mission;
	String vision;
	
Scanner sc = new Scanner(System.in);//predefine class

 restaurant(){// constructor no argument
	setInfo("\t\tCrowne Restaurant"+"\n\t\tClassic & Retro"+"\n\t\tCompany No: 34238-A "
	            +"\n\t\tHiG Hotel, 34563 Langkawi"+"\n\t\tTel: 019-324232678\n"
			      +"\t\twww.CrowneRestaurantHotel.com\n");
	    this.mission="1.To serve high quality food\n2.To maintain a clean and comfortable\n";
		this.vision="To be the best restaurant service in the country\n";
		 
}


public void aboutUs(){

	System.out.println("==Our Vision==\n" + this.vision);
	System.out.println("==Our Mission==\n" + this.mission);
}


public void printInfo() {//polymorphism
	 System.out.println("Welcome to our restaurant");
}
 abstract String print();//abstraction method


public String getInfo() {//encapsulation
	return info;
}

public void setInfo(String info) {//encapsulation
	this.info = info;
}



}
