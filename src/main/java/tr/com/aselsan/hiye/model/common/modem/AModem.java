package tr.com.aselsan.hiye.model.common.modem;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class AModem {
  
	@Getter @Setter private String ip;
	@Getter @Setter private int id;
	
}
