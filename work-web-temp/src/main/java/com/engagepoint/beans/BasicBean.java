package com.engagepoint.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * User: bogdan.ezapenkin
 * Date: 3/31/14
 * Time: 12:01 PM
 */
@ManagedBean(name="basicBean")
@SessionScoped
public class BasicBean implements Serializable {
    private static String DEFAULT_NAME = "Work";

    public String getDefaultName(){
        return DEFAULT_NAME;
    }

}
