package managers;

import Abstracts.GamerService;
import objects.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getUserName()+" kullanıcı adı ile sisteme başarıyla eklenmiştir.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" sistemden başarıyla silinmiştir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" kullanıcısının bilgileri başarıyla güncellenmiştir.");
		
	}



}
