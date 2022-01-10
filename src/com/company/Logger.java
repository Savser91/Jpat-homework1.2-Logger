package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log (String msg) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss ");
        System.out.println("[" + formatter.format(calendar.getTime()) + num++ + "] " + msg);
    }
}
