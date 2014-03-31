package com.engagepoint.work.beans.client;

import com.engagepoint.work.beans.interfaces.TimeService;

import javax.ejb.EJB;
import javax.naming.InitialContext;

/**
 * User: bogdan.ezapenkin
 * Date: 3/31/14
 * Time: 1:38 PM
 */
public class Client {
    @EJB
    private static TimeService timeService;

    public static void main(String args[]) throws Exception {
        String time = timeService.getTime();
        System.out.println("Time is: " + time);
    }
}
