package tr.com.aselsan.hiye.controller.haberlesme;

import java.io.IOException;

import org.snmp4j.CommunityTarget;
import org.snmp4j.Snmp;
import org.snmp4j.smi.Address;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import tr.com.aselsan.hiye.model.common.mesaj.SNMPMesaj;

@Slf4j
@Component("snmpIletisimKanali")
public class SNMPIletisimKanali extends AIletisimKanali implements IIletisimKanali<SNMPMesaj> {

	private Snmp snmp;
	private CommunityTarget<Address> target;

	public SNMPIletisimKanali() {}
	
	public SNMPIletisimKanali(@NonNull String ip, int port) {
		super(ip, port);
	}

	@Override
	public void baglan() {
//		try {
		System.out.println("Baglandi...");
//			target = new CommunityTarget<Address>();
//			target.setAddress(new UdpAddress(InetAddress.getByName(super.ip), port));
//			target.setCommunity(new OctetString("public"));
//			target.setVersion(SnmpConstants.version1);
//			snmp = new Snmp(new DefaultUdpTransportMapping());
//		} catch (IOException e) {
//			log.error(e.getMessage());
//		}
	}

	public void mesajDinlemeyeBasla() {
//		try {
			System.out.println("Dinlemeye başladı...");

//			snmp.listen();
//		} catch (IOException e) {
//			log.error(e.getMessage());
//		}
	}

	@Override
	public void mesajDinlemeyiBitir() {
		// snmp için işlem yoktur.
	}

	@Override
	public void baglantiyiKes() {
		try {
			snmp.close();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}

	@Override
	public void mesajGonder(SNMPMesaj aMesaj) {

		System.out.println("mesaj gönderildi.." + aMesaj.getOid());
//		PDU pdu = new PDU();
//		pdu.add(new VariableBinding(new OID(aMesaj.getOid())));
//		pdu.setType(PDU.GETNEXT);
//
//		try {
//			ResponseEvent response = snmp.send(pdu, target);
//			// TODO parse etme kısmını ayır
////			if (response.getResponse() == null) {
////				System.out.println("Error: There is some problems.");
////			} else {
////				List<? extends VariableBinding> variableBindings = response.getResponse().getVariableBindings();
////				for (int i = 0; i < variableBindings.size(); i++) {
////					System.out.println(variableBindings.get(i));
////				}
////			}
//		} catch (IOException e) {
//			log.error(e.getMessage());
//		}
	}

	@Override
	public SNMPMesaj mesajGetir(SNMPMesaj aMesaj) {
		System.out.println("mesaj getirildi.." + aMesaj.getOid());

//		try {
//			PDU pdu = new PDU();
//			pdu.add(new VariableBinding(new OID(aMesaj.getOid())));
//			pdu.setType(PDU.GETNEXT);
//			ResponseEvent<Address> event = snmp.get(pdu, target);
//			VariableBinding binding = event.getResponse().get(aMesaj.getOid()).get(0);
			aMesaj.setDeger("5");
//		} catch (IOException e) {
//			log.error(e.getMessage());
//		}
		return aMesaj;
	}


}
