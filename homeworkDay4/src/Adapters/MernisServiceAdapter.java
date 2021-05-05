package Adapters;


import java.rmi.RemoteException;

import Abstracts.GamerCheckService;
import objects.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean IfRealPerson(Gamer gamer) {
		
    boolean result = false;
		
		KPSPublicSoapProxy customer = new KPSPublicSoapProxy();
		
		try {
			return customer.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getYearOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
			
		
		
	
	}

}
