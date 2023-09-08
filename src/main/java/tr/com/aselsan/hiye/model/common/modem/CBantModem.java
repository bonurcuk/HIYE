package tr.com.aselsan.hiye.model.common.modem;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import tr.com.aselsan.hiye.model.common.KoordinatBilgisi;
import tr.com.aselsan.hiye.model.common.SNMPMesajNitelik;
import tr.com.aselsan.hiye.model.common.enums.AntenAkisDurumu;
import tr.com.aselsan.hiye.model.common.enums.AntenKontrolKomutu;

/**
 * kuzeyBasAcisi:
 * MIB: antennaSettings -> dirMptAntennaGroup -> dirMptAntennaNorthHeading OID: 1.3.6.1.4.1.24912.1.11.7.6.5
 *
 * MPT Directional Antenna: Set entered pan angle as north. (PAN Coordinate ->
 * deg in 'double') (PAN Coordinate/TILT Coordinate) string formatta double
 * cinsinden gonderilir. 38 karaktere tamamlamaya gerek yoktur. PAN Coor. Deger
 * Araligi : -180.00 <= Enlem <= +180.00 Ornek: -179.20
 * 
 * antenLokasyonu:
 * 
 * KARA terminallerinde, antenin kendi konum bilgisini ayarlar.
 * (Enlem,Boylam,Yukseklik) string formatta double cinsinden gonderilir. 
 * 38 karaktere tamamlamaya gerek yoktur. 
 * Enlem Deger Aralığı : -90 <= Enlem <= +90
 * (-): Batı± (+): Dogu 
 * Boylam Deger Aralığı : -180 <= Boylam <= +180 
 * (-): Güney (+): Kuzey 
 * Yükselik : Deniz seviyesine gore
 * Ornek: 31.0123400000,32.045600000,1500 (double degree)
 * 
 * MIB: antennaSettings -> dirMptAntennaGroup -> dirAntennaLocation 
 * OID: 1.3.6.1.4.1.24912.1.11.7.6.3
 *
 * antenGucYonu: 
 * 
 * MIB: antennaSettings -> dirMptAntennaGroup -> dirMptAntennaForceDirection 
 * OID: 1.3.6.1.4.1.24912.1.11.7.6.7
 */
@Component
public class CBantModem extends AModem {

	@Getter
	@Setter
	@SNMPMesajNitelik(isim = "dirMptAntennaFlowState", oid = "1.3.6.1.4.1.24912.1.11.7.6.2")
	private AntenAkisDurumu antenAkisDurumu;
	@Getter
	@Setter
	@SNMPMesajNitelik(isim = "dirMptAntennaLocation", oid = "1.3.6.1.4.1.24912.1.11.7.6.3")
	private KoordinatBilgisi antenLokasyonu;
	@Getter
	@Setter
	@SNMPMesajNitelik(isim = "dirMptAntennaCtrlCmd", oid = "1.3.6.1.4.1.24912.1.11.7.6.1")
	private AntenKontrolKomutu antenKontrolKomutu;
	@Getter
	@Setter
	@SNMPMesajNitelik(isim = "dirMptAntennaNorthHeading", oid = "1.3.6.1.4.1.24912.1.11.7.6.5")
	private double kuzeyBasAcisi;
	@Getter
	@Setter
	@SNMPMesajNitelik(isim = "dirMptAntennaForceDirection", oid = "1.3.6.1.4.1.24912.1.11.7.6.7")
	private KoordinatBilgisi antenGucYonu;

}
