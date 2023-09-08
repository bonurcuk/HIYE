package tr.com.aselsan.hiye.model.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Antenna Settings: Antenna-1 Type 0. omni 1. directional Anten-1 icin anten
 * tipi secimini yapar.
 * 
 * MIB: antennaSettings -> antenna1Type 
 * OID: 1.3.6.1.4.1.24912.1.11.7.1
 */
@Getter
@ToString
@RequiredArgsConstructor
public enum AntenTipi {

	OMNI(0, "Tek Yönlü Anten"),

	DIRECTIONAL(1, "Çok Yönlü Anten"),

	NONE(2, "Tanımsız");

	private final int kimlik;
	private final String aciklama;
}
