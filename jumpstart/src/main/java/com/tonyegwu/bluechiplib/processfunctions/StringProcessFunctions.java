package com.tonyegwu.bluechiplib.processfunctions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessFunctions {
    private static String email_regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

    private static Pattern pattern = Pattern.compile(email_regex);

    public static boolean isValidEmail(String email){

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    //date process functions from long millisecond values

    public static String getDateString(long date){
        String date_string = "The date";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMMM, yyyy", Locale.US);
        date_string = sdf.format(new Date(date));


        return date_string;
    }


    public static String getDateDay(long date){
        String date_string = "The date";
        SimpleDateFormat sdf = new SimpleDateFormat("d, MMM", Locale.US);
        date_string = sdf.format(new Date(date));

        return date_string;
    }
    public static String getDateMonth(long date){
        String date_string = "The date";
        SimpleDateFormat sdf = new SimpleDateFormat("MMM", Locale.US);
        date_string = sdf.format(new Date(date));

        return date_string;
    }

    public static String getDateTime(long date){
        String date_string = "The date";
        long dtime = new Date(date).getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("k:m a", Locale.US);
        date_string = sdf.format(new Date(dtime));

        return date_string;
    }
}
