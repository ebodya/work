package com.engagepoint.work.beans.services;

import com.engagepoint.work.beans.interfaces.TimeService;

import javax.ejb.Stateless;
import java.util.Calendar;
import java.util.Formatter;

/**
 * User: bogdan.ezapenkin
 * Date: 3/31/14
 * Time: 12:22 PM
 */
@Stateless
public class TimeServiceImpl implements TimeService {
    @Override
    public String getTime() {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tr", cal);
        return fmt.toString();
    }
}
