package com.sun.faces.util;

import java.util.ResourceBundle;
import java.util.Locale;
import java.text.MessageFormat;

/**
 * Created by IntelliJ IDEA. User: rlubke Date: Nov 18, 2004 Time: 10:03:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class ToolsUtil {

    private static final String RESOURCE_BUNDLE_BASE_NAME =
        "com.sun.faces.resources.JsfToolsMessages";


    // --------------------------------------------------- Message Key Constants


    public static final String MANAGED_BEAN_NO_MANAGED_BEAN_NAME_ID =
        "com.sun.faces.MANAGED_BEAN_NO_MANAGED_BEAN_NAME";
    
    public static final String MANAGED_BEAN_NO_MANAGED_BEAN_CLASS_ID =
        "com.sun.faces.MANAGED_BEAN_NO_MANAGED_BEAN_CLASS";
    
    public static final String MANAGED_BEAN_NO_MANAGED_BEAN_SCOPE_ID =
        "com.sun.faces.MANAGED_BEAN_NO_MANAGED_BEAN_SCOPE";
    
    public static final String MANAGED_BEAN_INVALID_SCOPE_ID =
        "com.sun.faces.MANAGED_BEAN_INVALID_SCOPE";
    
    public static final String MANAGED_BEAN_AS_LIST_CONFIG_ERROR_ID =
        "com.sun.faces.MANAGED_BEAN_AS_LIST_CONFIG_ERROR";
    
    public static final String MANAGED_BEAN_AS_MAP_CONFIG_ERROR_ID = 
        "com.sun.faces.MANAGED_BEAN_AS_MAP_CONFIG_ERROR";
    
    public static final String MANAGED_BEAN_LIST_PROPERTY_CONFIG_ERROR_ID =
        "com.sun.faces.MANAGED_BEAN_LIST_PROPERTY_CONFIG_ERROR";
    
    public static final String MANAGED_BEAN_MAP_PROPERTY_CONFIG_ERROR_ID =
        "com.sun.faces.MANAGED_BEAN_MAP_PROPERTY_CONFIG_ERROR";
    
    public static final String MANAGED_BEAN_PROPERTY_CONFIG_ERROR_ID = 
        "com.sun.faces.MANAGED_BEAN_PROPERTY_CONFIG_ERROR";
    
    public static final String MANAGED_BEAN_NO_MANAGED_PROPERTY_NAME_ID =
        "com.sun.faces.MANAGED_BEAN_NO_MANAGED_PROPERTY_NAME";


    // ---------------------------------------------------------- Public Methods


    public static String getMessage(String messageKey, Object[] params) {

        ResourceBundle bundle =
            ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME,
                Locale.getDefault(),
                Thread.currentThread().getContextClassLoader());
        return MessageFormat.format(bundle.getString(messageKey), params);

    } // END getMessage


    public static String getMessage(String messageKey) {

        return getMessage(messageKey, null);

    } // END getMessage

}
