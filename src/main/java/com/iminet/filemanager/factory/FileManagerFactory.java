package com.iminet.filemanager.factory;

import com.iminet.filemanager.api.IFileManager;
import com.iminet.filemanager.enums.FileManagerEnum;
import com.iminet.filemanager.exception.FileManagerFactoryCreateException;
import com.iminet.filemanager.impl.locale.LocaleFileManager;
import com.iminet.filemanager.impl.remote.RemoteFileManager;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating FileManager objects.
 */
public class FileManagerFactory {
	
	private static final String EXCEPTION_MESSAGE="method not allowed";
	
	/**
	 * Creates a new FileManager object.
	 *
	 * @param fileManagerEnum the file manager enum
	 * @return the i file manager
	 * @throws Exception 
	 */
	public IFileManager createFileManager(final FileManagerEnum fileManagerEnum) throws FileManagerFactoryCreateException{
		switch(fileManagerEnum){
			case LOCALE:
				return new LocaleFileManager();
			
			case REMOTE:
				return new RemoteFileManager();
				
		    default:
		    	throw new FileManagerFactoryCreateException(EXCEPTION_MESSAGE);			
		}
	}

}
