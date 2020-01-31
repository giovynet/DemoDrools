package com.example.drools;

import java.io.PrintStream;
import java.math.BigDecimal;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;

import com.example.drools.model.Person;

public class App {
    @Inject
    @KSession("ksession-rules") 
    KieSession kSession;
    
    public void go(PrintStream out){
        Person person = new Person(1L,"Dulcinea del Toboso", new BigDecimal(100000000.23), new BigDecimal(735000.67), false );
        kSession.insert(person);
        int fired = kSession.fireAllRules();
        out.println("Number of Rules executed = " + fired );
        out.println("Status: " + person.getStatus());
    }
    
    public static void main( String[] args ){
        // Bootstraping the WELD CDI container
        Weld w = new Weld();
        WeldContainer wc = w.initialize();
        App bean = wc.instance().select(App.class).get();
        bean.go(System.out);
        w.shutdown();
    }
}
