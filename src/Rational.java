

public class Rational extends Number {

    //любое
    public double value;

    public Rational(double value) {
        this.value = value;
    }

    
    /** 
     * @return int
     */
    @Override
    public int intValue() {
        return (int) value;
    }

    
    /** 
     * @return long
     */
    @Override
    public long longValue() {
        return (long) value;
    }

    
    /** 
     * @return float
     */
    @Override
    public float floatValue() {
        return (float) value;
    }

    
    /** 
     * @return double
     */
    @Override
    public double doubleValue() {
        return value;
    }
}
