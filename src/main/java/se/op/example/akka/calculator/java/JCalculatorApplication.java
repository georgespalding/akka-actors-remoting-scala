/**
 *  Copyright (C) 2009-2012 Typesafe Inc. <http://www.typesafe.com>
 */
package se.op.example.akka.calculator.java;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.kernel.Bootable;
import com.typesafe.config.ConfigFactory;

//#setup
public class JCalculatorApplication implements Bootable {
    private ActorSystem system;

    public JCalculatorApplication() {
        system = ActorSystem.create("CalculatorApplication", ConfigFactory.load().getConfig("calculator"));
        ActorRef actor = system.actorOf(new Props(JSimpleCalculatorActor.class), "simpleCalculator");
    }

    @Override
    public void startup() {
    	System.err.println("startup!!! This never happens...");
    }

    @Override
    public void shutdown() {
        system.shutdown();
    }
}
//#setup