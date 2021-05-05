package managers;

import Abstracts.GamerCheckService;
import objects.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean IfRealPerson(Gamer gamer) {
		
		if(gamer.getLastName()=="DURAN"&& gamer.getNationalityId()=="12345678912" && gamer.getYearOfBirth()==1997) {
			
			System.out.println("Kullanýcý onaylandý.");
			return true;
			
		}else {
			System.out.println("Eksik veya hatalý giriþ yaptýnýz.");
			return false;
		}
	
		
	}
	
		
	}
	
	 



