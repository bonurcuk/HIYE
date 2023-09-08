package tr.com.aselsan.hiye.controller.haberlesme;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import tr.com.aselsan.hiye.model.common.mesaj.IMesaj;

/**
 * konsol yazılımın haberleşme sağlayacağı birimde oluşturacağı iletişim kanalıdır.
 */
@Component
public interface IIletisimKanali<T extends IMesaj> {

	void baglan();

	void baglantiyiKes();

	void mesajGonder(T aMesaj);
	
	T mesajGetir(@Nullable T aMesaj);
	
	void mesajDinlemeyeBasla();
	
	void mesajDinlemeyiBitir();
}
