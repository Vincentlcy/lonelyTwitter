package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
// can be class private
interface Tweetable {
    // public is useless for interface
    String getMessage();

    Date getDate();

}
