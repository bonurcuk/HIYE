/**
 * 
 */
package tr.com.aselsan.hiye.model.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Antenin akis durum bilgisini sorgular. 
 * MIB: antennaSettings -> dirMptAntennaGroup -> dirMptAntennaFlowState 
 * OID: 1.3.6.1.4.1.24912.1.11.7.6.2
 */
@Getter
@ToString
@RequiredArgsConstructor
public enum AntenAkisDurumu {

	OFF(0),
	IDLE(1),
	READY(2),
	STARTUP(3),
	SHUTDOWN(4),
	PANIC(5),
	GPSTRACK(6),
	RFTRACK(7),
	GPSRFTRACK(8),
	ERRORSTARTUP(9),
	ERRORCOMMAND(10),
	ERRORBIT(11),
	ERRORGPSTRACK(12),
	ERRORPANIC(13),
	REPORTCMDERR(14),
	REPORTBIT(15),
	QUITPANIC(16);

	private final int kimlik;

}
