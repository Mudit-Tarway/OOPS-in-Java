class Measurement {
    private double km;
    private double meter;
    private double millimeter;

    
    public Measurement(double km, double meter, double millimeter) {
        this.km = km;
        this.meter = meter;
        this.millimeter = millimeter;
    }

 
    public long getRoundedKm() {
        return Math.round(km);
    }

    
    public long getRoundedMeter() {
        return Math.round(meter);
    }

    
    public long getRoundedMillimeter() {
        return Math.round(millimeter);
    }
}


public class question4 {
    public static void main(String[] args) {
        Measurement m = new Measurement(17.67, 551.89, 1500.01);
        System.out.println("Rounded Kilometer: " + m.getRoundedKm());
        System.out.println("Rounded Meter: " + m.getRoundedMeter());
        System.out.println("Rounded Millimeter: " + m.getRoundedMillimeter());
    }
    
}
