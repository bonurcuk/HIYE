package tr.com.aselsan.hiye.controller.modem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import tr.com.aselsan.hiye.controller.haberlesme.IIletisimKanali;
import tr.com.aselsan.hiye.model.common.mesaj.UDPMesaj;

@Qualifier("udpMesajYoneticisi")
@Component
public class UDPMesajYoneticisi implements IMesajYoneticisi<UDPMesaj> {

	@Autowired(required=true)
	@Qualifier("udpIletisimKanali")
	private IIletisimKanali<UDPMesaj> iletisimKanali;

	@Override
	public void iletisimKanalinaBaglan(String port, int ip) {
		iletisimKanali.baglan();
		iletisimKanali.mesajDinlemeyeBasla();
	}

	@Override
	public void iletisimKanalinaMesajGonder(UDPMesaj mesaj) {
		iletisimKanali.mesajGonder(mesaj);
	}

}
