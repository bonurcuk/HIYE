package tr.com.aselsan.hiye.model.common.modem;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class LBantModem extends AModem {

	@Getter @Setter private int lBandValue;

}
