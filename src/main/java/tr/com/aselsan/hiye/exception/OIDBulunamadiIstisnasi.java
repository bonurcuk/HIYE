package tr.com.aselsan.hiye.exception;

public class OIDBulunamadiIstisnasi extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OIDBulunamadiIstisnasi() {
		super();
	}

	public OIDBulunamadiIstisnasi(String aMesaj, Throwable aSebep) {
		super(aMesaj, aSebep);
	}

	public OIDBulunamadiIstisnasi(String aMesaj) {
		super(aMesaj);
	}

	public OIDBulunamadiIstisnasi(Throwable aSebep) {
		super(aSebep);
	}
}