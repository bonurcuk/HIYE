package tr.com.aselsan.hiye.exception;

import java.io.IOException;

public class OkumaHatasiIstisnasi extends IOException {

	private static final long serialVersionUID = 1L;

	public OkumaHatasiIstisnasi() {
		super();
	}

	public OkumaHatasiIstisnasi(String aMesaj, Throwable aSebep) {
		super(aMesaj, aSebep);
	}

	public OkumaHatasiIstisnasi(String aMesaj) {
		super(aMesaj);
	}

	public OkumaHatasiIstisnasi(Throwable aSebep) {
		super(aSebep);
	}
}