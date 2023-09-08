package tr.com.aselsan.hiye.model.common.mesaj;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class UDPMesaj implements IMesaj {

	@Getter @Setter
	private byte[] mesajVerileri;
	
	@Override
	public byte[] getByteArray() {
		return mesajVerileri;
	}

	@Override
	public IMesaj mesajOlustur(byte[] mesajVerileri) {
		this.mesajVerileri = mesajVerileri;
		return new UDPMesaj();
	}

	@Override
	public int getMesajBoyutu() {
		return mesajVerileri.length;
	}

}
