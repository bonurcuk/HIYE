package tr.com.aselsan.hiye.model.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * koordinat bilgisi.
 * 
 * double degree
 */
@AllArgsConstructor
public class KoordinatBilgisi {

	@Getter
	@Setter
	private double enlem;
	@Getter
	@Setter
	private double boylam;
	@Getter
	@Setter
	private double yukseklik;
}
