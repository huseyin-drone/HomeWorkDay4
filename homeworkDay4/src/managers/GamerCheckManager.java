package managers;

import Abstracts.GamerCheckService;
import objects.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean IfRealPerson(Gamer gamer) {
		
		if(gamer.getLastName()=="DURAN"&& gamer.getNationalityId()=="12345678912" && gamer.getYearOfBirth()==1997) {
			
			System.out.println("Kullan�c� onayland�.");
			return true;
			
		}else {
			System.out.println("Eksik veya hatal� giri� yapt�n�z.");
			return false;
		}
	
		
	}
	
		
	}
	
	 



