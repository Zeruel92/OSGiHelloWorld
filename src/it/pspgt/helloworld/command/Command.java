/*
 * Author Gabriele Tramonte
 * Classe che definisce la commandline
 */
package it.pspgt.helloworld.command;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class Command {
	private volatile HelloWorldInterface service;
	public void print(){
		service.hello();
	}
}
