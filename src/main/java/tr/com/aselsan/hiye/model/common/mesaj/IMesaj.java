package tr.com.aselsan.hiye.model.common.mesaj;

import org.springframework.stereotype.Component;

@Component
public interface IMesaj {
	
	default  int getMesajBoyutu() {
		return 0;
	}
	
	default byte[] getByteArray() {
		return new byte[0];
	}
	
	default IMesaj mesajOlustur(byte[] mesajVerileri) {
		return null;
	}

}
