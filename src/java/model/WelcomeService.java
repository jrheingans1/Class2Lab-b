/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.*;
import java.util.*;

/**
 *
 * @author James
 */
public class WelcomeService {

    private Calendar cal = Calendar.getInstance();
    private Calendar cal2 = Calendar.getInstance();
    private Date date = cal.getTime();
    private String mor = "9/1/2014 00:00 AM";
    private String aft = "9/1/2014 11:00 AM";
    private String eve = "9/1/2014 5:00 PM";
    private Date after;
    private Date morn;
    private Date even;
    private String format = "MM/dd/yyyy hh:mm a";
    private SimpleDateFormat sdf = new SimpleDateFormat(format);
    private String dayMsg;
    private String welMsg = "Good ";
    private String name;
    private String morMsg;
    private String aftMsg;
    private String eveMsg;

    public String Run() {
        WelcomeService wel = new WelcomeService();
        wel.TimeOfDay();
        return wel.greetingMessage(name);
    }

    public String TimeOfDay() {
        try {
            sdf.format(date);
            Date morn = sdf.parse(mor);
            Date after = sdf.parse(aft);
            Date even = sdf.parse(eve);
        } catch (ParseException pe) {

        }
        if (date.after(morn) && date.before(after)) {
            dayMsg = "Morning";
        } else if (date.after(after) && date.before(even)) {
            dayMsg = "Afternoon";
        } else if (date.after(even) && date.before(morn)) {
            dayMsg = "Evening";
        } else {
            dayMsg = "Error Occured";
        }
        return dayMsg;
    }

    public String greetingMessage(String name) {
        welMsg += dayMsg + " " + name + ", Welcome";
        return welMsg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
