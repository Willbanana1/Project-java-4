

import java.math.BigInteger;
import java.nio.ByteBuffer;

public class BigUnsigned extends Number {

    //BigInteger вмещает в себя "бесконечные" целые числа
    BigInteger value;

    public BigUnsigned(String s) {
        value = new BigInteger(s);
    }

    
    /** 
     * @return int
     */
    @Override
    public int intValue() {
        return value.intValue();
    }

    
    /** 
     * @return long
     */
    @Override
    public long longValue() {
        return value.longValue();
    }

    
    /** 
     * @return float
     */
    @Override
    public float floatValue() {
        return value.floatValue();
    }

    
    /** 
     * @return double
     */
    @Override
    public double doubleValue() {
        return value.doubleValue();
    }
}
