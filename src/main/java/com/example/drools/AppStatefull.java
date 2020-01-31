package com.example.drools;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import com.example.drools.model.Person;

public class AppStatefull {

	public static void main(String[] args) {
		// 1) Bootstrapping a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		StatelessKieSession kieSession = kContainer.newStatelessKieSession("ksession-stateless");

		List<Person> lstPerson = new ArrayList<>();
		lstPerson.add(new Person(1L, "Alonso Quijano", new BigDecimal(3000.00), new BigDecimal(3000.00), true));
		lstPerson.add(new Person(2L, "Dulcinea del Toboso", new BigDecimal(5000.00), new BigDecimal(4750.00), true));
		lstPerson.add(new Person(1L, "Sancho Panza", new BigDecimal(1000.00), new BigDecimal(7900.00), false));

		kieSession.execute(lstPerson);
		
		lstPerson.forEach(System.out::println);

	}

}
