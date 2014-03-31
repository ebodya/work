package com.engagepoint.work.beans.interfaces;

import javax.ejb.Remote;

/**
 * User: bogdan.ezapenkin
 * Date: 3/31/14
 * Time: 12:18 PM
 */
@Remote
public interface TimeService {
    public String getTime();
}
