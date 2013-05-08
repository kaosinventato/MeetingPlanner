/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.ingw.meetingplanner.connection;

/**
 *
 * @author Alessandro
 */
public class ConnectionPoolException extends Exception{
	public ConnectionPoolException(){
		System.out.print("ooops! Qualche problema nella connpool!");
	}
}
