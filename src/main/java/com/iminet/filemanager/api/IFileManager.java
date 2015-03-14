package com.iminet.filemanager.api; 

import java.util.List;

/**
 * The Interface IFileManager.
 */
public interface IFileManager {

	/**
	 * Gets the list files names.
	 *
	 * @param path the path
	 * @return the list files names
	 */
	List<String> getListFilesNames(final String path);
	
	/**
	 * Update files.
	 *
	 * @param listFilesNames the list files names
	 */
	void updateFiles(final List<String> listFilesNames);
}
