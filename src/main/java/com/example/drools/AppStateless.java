package com.example.drools;

import java.math.BigDecimal;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.drools.model.Person;

public class AppStateless {

	public static void main(String[] args) {
		// 1) Bootstrapping a Rule Engine Session
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-statefull");

		Person person = new Person(1L, "Alonso Quijano", new BigDecimal(3000.00), new BigDecimal(3000.00), true);
		kSession.insert(person);
		int fired = kSession.fireAllRules();
		System.out.println("Number of Rules executed = " + fired);
		System.out.println("Status: " + person.getStatus());

	}

}
