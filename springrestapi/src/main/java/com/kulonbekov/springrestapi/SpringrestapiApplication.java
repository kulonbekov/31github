package com.kulonbekov.springrestapi;

import com.declination.names.declinationnamesrussionandkyrgyz.Declination;
import com.declination.names.declinationnamesrussionandkyrgyz.DeclinationProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);

		Declination name = new Declination("Кулонбеков Таалайбек Толосунович");

		System.out.println(name.fullName(DeclinationProcessor.gcaseIm));
		System.out.println(name.fullName(DeclinationProcessor.gcaseDat));
		System.out.println(name.fullName(DeclinationProcessor.gcasePred));
		System.out.println(name.fullName(DeclinationProcessor.gcaseRod));
		System.out.println(name.fullName(DeclinationProcessor.gcaseTvor));
		System.out.println(name.fullName(DeclinationProcessor.gcaseVin));

	}

}
