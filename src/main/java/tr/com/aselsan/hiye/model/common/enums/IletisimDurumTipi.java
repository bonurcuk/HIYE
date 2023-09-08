package tr.com.aselsan.hiye.model.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Antenna Settings: Antenna-1 Type 0. omni 1. directional Anten-1 icin anten
 * tipi secimini yapar.
 * 
 * MIB: commSettings -> commState 
 * OID: 1.3.6.1.4.1.24912.1.11.12.1
 */
@Getter
@ToString
@RequiredArgsConstructor
public enum IletisimDurumTipi {

	IDLE(0, "Haberleşme Yapmıyor"),
	TGC_TUNE(1, "Çıkış Gücü Ayarı Yapıyor"),
	SEARCH_SYNC(2, "KARA terminallerinde Downlink İçin Eş Zamanlama Arıyor"),
	VERIFY(3, "KARA terminallerinde Downlink İçin Eş Zamanlama Arıyor"),
	NET_READY(4, "");

	private final int kimlik;
	private final String metin;
}
