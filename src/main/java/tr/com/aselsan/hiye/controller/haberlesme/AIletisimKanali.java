package tr.com.aselsan.hiye.controller.haberlesme;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Component
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class  AIletisimKanali {

	@Setter @NonNull @Getter(AccessLevel.PROTECTED)
	protected String ip;
	@Setter @Getter (AccessLevel.PROTECTED)
	protected int port;

}
