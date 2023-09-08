package tr.com.aselsan.hiye.model.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Anteni kontrol etmek icin ilgili komutu gonderir veya sorgular.
 * MIB: antennaSettings -> dirMptAntennaGroup -> dirAntennaCtrlCmd 
 * OID: 1.3.6.1.4.1.24912.1.11.7.6.1
 */
@Getter
@ToString
@RequiredArgsConstructor
public enum AntenKontrolKomutu {

	START(0),
	SHUT_DOWN(1),
	START_GPS_TRACK(2),
	STOP_GPS_TRACK(3),
	QUIT_PANIC_MODE(4),
	DISABLE(5);
	
	private final int kimlik;
}
