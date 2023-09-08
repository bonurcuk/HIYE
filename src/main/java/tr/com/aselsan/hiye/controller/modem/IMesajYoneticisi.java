package tr.com.aselsan.hiye.controller.modem;

import tr.com.aselsan.hiye.model.common.mesaj.IMesaj;

public interface IMesajYoneticisi <T extends IMesaj>{

	void iletisimKanalinaBaglan(String port, int id);
	
	void iletisimKanalinaMesajGonder(T aMesaj);
}
