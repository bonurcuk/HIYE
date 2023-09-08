package tr.com.aselsan.hiye.model.common.mesaj;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Component
public class SNMPMesaj implements IMesaj {

	@Getter @Setter private String oid;
	@Getter @Setter private String deger;
}
