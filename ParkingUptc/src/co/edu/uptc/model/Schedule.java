package co.edu.uptc.model;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class Schedule {
    private String days;
    private LocalTime  initialDate;
    private LocalTime finalDate;
    public Schedule(String days, LocalTime startWeek, LocalTime endWeek) {
        this.days = days;
        this.initialDate = startWeek;
        this.finalDate = endWeek;
    }
    public String getDays() {
        return days;
    }
    public void setDays(String days) {
        this.days = days;
    }
    public LocalTime getInitialDate() {
        return initialDate;
    }
    public void setInitialDate(LocalTime initialDate) {
        this.initialDate = initialDate;
    }
    public LocalTime getFinalDate() {
        return finalDate;
    }
    public void setFinalDate(LocalTime finalDate) {
        this.finalDate = finalDate;
    }
    @Override
    public String toString() {
        return "Schedule [days=" + days + ", initialDate=" + initialDate + ", finalDate=" + finalDate + "]";
    }
    


}
