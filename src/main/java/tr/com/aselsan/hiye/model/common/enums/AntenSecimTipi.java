package tr.com.aselsan.hiye.model.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Hangi antenin kullanilacagini secer. 'Auto' secimi, yonlu/yonsuz antenin
 * hedefin uzakligina bagli olarak otomatik anten secimidir. Mesafe esik degeri
 * icin bknz 'autoAntennaSwitchDistance'. 
 * 
 * MIB: antennaSettings -> antennaSelect OID: 1.3.6.1.4.1.24912.1.11.7.3
 */
@Getter
@ToString
@RequiredArgsConstructor
public enum AntenSecimTipi {
	
	ANTENNA_1(0),
	ANTENNA_2(1),
	AUTO(2);
	
	private final int kimlik;

}
