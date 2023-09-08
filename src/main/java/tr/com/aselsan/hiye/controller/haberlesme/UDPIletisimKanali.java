package tr.com.aselsan.hiye.controller.haberlesme;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import tr.com.aselsan.hiye.model.common.mesaj.UDPMesaj;

@Slf4j
@Component("udpIletisimKanali")
public class UDPIletisimKanali extends AIletisimKanali implements IIletisimKanali<UDPMesaj> {

	private ExecutorService mesajDinleyicisi;
	private DatagramSocket datagramSocket;

	public UDPIletisimKanali() {}
	
	public UDPIletisimKanali(@NonNull String ip, int port) {
		super(ip, port);
	}

	@Override
	public void baglan() {
		try {
			datagramSocket = new DatagramSocket();
			datagramSocket.bind(new InetSocketAddress(super.ip, super.port));
		} catch (IOException e) {
			log.error(e.getMessage());
		}
	}

	public void mesajDinlemeyeBasla() {
		mesajDinleyicisi = Executors.newSingleThreadExecutor();
		mesajDinleyicisi.execute(new UDPMesajDinleyicisi());
	}

	@Override
	public void mesajDinlemeyiBitir() {
		try {
			mesajDinleyicisi.awaitTermination(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
	}

	@Override
	public void baglantiyiKes() {
		datagramSocket.close();
	}

	@Override
	public void mesajGonder(UDPMesaj aMesaj) {
		try {
			byte[] gonderilecekMesajVerileri = aMesaj.getByteArray();
			DatagramPacket packet = new DatagramPacket(gonderilecekMesajVerileri, port);
			datagramSocket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public class UDPMesajDinleyicisi implements Runnable {
		public void run() {
			try {
				final byte[] veriler = new byte[500];
				final DatagramPacket veriPaketi = new DatagramPacket(veriler, veriler.length);
				datagramSocket.receive(veriPaketi);
				veriPaketi.getData();
				veriPaketi.getLength();

				// burdan gönder veriyi. serialize et.
			} catch (IOException e) {
				log.error("");
			}
		}
	}

	@Override
	public UDPMesaj mesajGetir(@Nullable UDPMesaj aMesaj) {
		// işlem yoktur
		return null;
	}

}
