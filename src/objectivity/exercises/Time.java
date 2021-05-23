package objectivity.exercises;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours + minutes/60;
        this.minutes = minutes % 60;

    }

    public Time(String time) {
        String[] array = time.split(" ");
        this.hours = Integer.parseInt(array[0]);
        this.minutes = Integer.parseInt(array[2]);
    }
    public void adjustTime(){
        int temporaryHours = this.minutes / 60;
        this.minutes = this.minutes % 60;
        this.hours += temporaryHours;
        if(this. hours > 1 && this. minutes < 0){
            this.hours -= 1;
            this.minutes += 60;
        }
    }

    @Override
    public String toString() {
        return this.hours + "h " + this.minutes + "min";
    }
    public Time addTime(Time time){
        Time tempTime = new Time(this.hours + time.hours, this.minutes + time.minutes);
        tempTime.adjustTime();
        return tempTime;
    }
    public Time subtractTime(Time time){
        Time tempTime = new Time(this.hours - time.hours, this.minutes - time.minutes);
        tempTime.adjustTime();
        return tempTime;
    }
    public Time multiplyTime(int multiplier){
        Time tempTime = new Time(this.hours * multiplier, this.minutes * multiplier);
        tempTime.adjustTime();
        return tempTime;
    }
    public static Time addTimes(Time[] times){
        int temporaryHours = 0, temporaryMinutes = 0;
        for (Time t : times) {
            temporaryHours += t.hours;
            temporaryMinutes += t.minutes;
        }
        Time temporaryTime = new Time(temporaryHours, temporaryMinutes);
        temporaryTime.adjustTime();
        return temporaryTime;
    }

}
