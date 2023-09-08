package tr.com.aselsan.hiye.controller.modem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import tr.com.aselsan.hiye.controller.haberlesme.IIletisimKanali;
import tr.com.aselsan.hiye.model.common.mesaj.SNMPMesaj;

@Qualifier("snmpMesajYoneticisi")
@Component
public class SNMPMesajYoneticisi implements IMesajYoneticisi<SNMPMesaj> {

	@Autowired(required=true)
	@Qualifier("snmpIletisimKanali")
	private IIletisimKanali<SNMPMesaj> iletisimKanali;

	@Override
	public void iletisimKanalinaBaglan(String port, int ip) {
		iletisimKanali.baglan();
		iletisimKanali.mesajDinlemeyeBasla();
	}

	@Override
	public void iletisimKanalinaMesajGonder(SNMPMesaj mesaj) {
		iletisimKanali.mesajGonder(mesaj);
	}

}
