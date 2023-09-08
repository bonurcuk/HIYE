package tr.com.aselsan.hiye.model.common;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ FIELD, METHOD })
public @interface SNMPMesajNitelik {

	public String isim() default "";

	public String oid() default "";
}
