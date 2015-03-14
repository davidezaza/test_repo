package com.iminet.filemanager.enums;

/**
 * The Enum FileManagerEnum.
 */
public enum FileManagerEnum {
	
	/** The locale. */
	LOCALE,
	
	/** The remote. */
	REMOTE;
	
    /**
     * Value.
     *
     * @return the string
     */
    public String value() {
        return name();
    }

    /**
     * From value.
     *
     * @param v the v
     * @return the file manager enum
     */
    public static FileManagerEnum fromValue(String v) {
        return valueOf(v);
    }	

}
