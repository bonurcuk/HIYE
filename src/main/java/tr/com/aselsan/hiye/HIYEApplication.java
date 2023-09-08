package tr.com.aselsan.hiye;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tr.com.aselsan.hiye.controller.modem.IMesajYoneticisi;
import tr.com.aselsan.hiye.model.common.SNMPMesajNitelik;
import tr.com.aselsan.hiye.model.common.mesaj.SNMPMesaj;
import tr.com.aselsan.hiye.model.common.modem.CBantModem;

@SpringBootApplication
@ComponentScan(basePackages = { "tr.com.aselsan.hiye" })
@EnableAutoConfiguration
public class HIYEApplication {

	@Autowired
	private IMesajYoneticisi<SNMPMesaj> snmpMesajYoneticisi;

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(HIYEApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

	@PostConstruct
	public void init() {
		try {
			snmpMesajYoneticisi.iletisimKanalinaBaglan("localhost", 1234);
			SNMPMesaj snmpMesaj = new SNMPMesaj("", "1.3.6.1.4.1.24912.1.11.7.6.7");
			snmpMesajYoneticisi.iletisimKanalinaMesajGonder(snmpMesaj);

			CBantModem modem = new CBantModem();
			List<SNMPMesaj> mesajlar = new ArrayList<>();
			for (Field field : modem.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				SNMPMesajNitelik mesajNitelik = field.getAnnotation(SNMPMesajNitelik.class);
				mesajlar.add(new SNMPMesaj(mesajNitelik.isim(), mesajNitelik.oid()));
			}
//			mesajlar.stream().forEach(null);
			// tüm mesaj sınıflarını oluştur.
			mesajlar.stream().forEach(snmpMesajYoneticisi::iletisimKanalinaMesajGonder);
			
			// 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
