package com.iminet.filemanager.exception;


/**
 * The Class FileManagerFactoryCreateException.
 */
public class FileManagerFactoryCreateException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3296577756041443417L;
	
	/** The message. */
	private String message;
	
	/**
	 * Instantiates a new file manager factory create exception.
	 */
	public FileManagerFactoryCreateException(){
		super();
	}
	
	/**
	 * Instantiates a new file manager factory create exception.
	 *
	 * @param message the message
	 */
	public FileManagerFactoryCreateException(String message){
		super(message);
		this.message=message;
	}

}
