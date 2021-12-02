
public class Polynom<T extends Number> extends Number{
    private T zero;
    private T one;

    //конструкторы
    public Polynom(T firstPower, T zerosPower) {
        this.zero = zerosPower;
        this.one = firstPower;
    }



    public Polynom(Polynom<T> p){
        this.one = p.one;
        this.zero = p.zero;
    }

    
    /** 
     * @param result
     * @return double
     */
    // решение линейного уравнения
    public double linearEquation(T result){
        return (result.doubleValue() - zero.doubleValue()) / one.doubleValue();
    }

    
    /** 
     * @param result
     * @return double[]
     */
    // решение квадратного уравнения (находим интеграл и приравниваем к 0)
    public double[] quadraticEquation(T result){
        double a = one.doubleValue() / 2;
        double b = zero.doubleValue();
        double c = -result.doubleValue();
        double[] results = new double[2];

        results[0] = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        results[1] = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        return results;
    }


    
    /** 
     * @param x
     * @return double
     */
    // значение полинома в точке х
    public double polynomValue(double x){
        return one.doubleValue() * x + zero.doubleValue();
    }

    
    /** 
     * @return T
     */
    public T derivative(){
        return one;
    }

    
    /** 
     * @return double
     */
    // неопр.интеграл
    public double undefIntegral(){
        double left = one.doubleValue() / 2 * Math.pow(Double.NEGATIVE_INFINITY, 2) +
                zero.doubleValue() * Double.NEGATIVE_INFINITY;
        double right = one.doubleValue() / 2 * Math.pow(Double.POSITIVE_INFINITY, 2) +
                zero.doubleValue() * Double.POSITIVE_INFINITY;
        return right - left;
    }

    
    /** 
     * @param start
     * @param end
     * @return double
     */
    //опр. интеграл
    public double defIntegral(double start, double end){
        double left = one.doubleValue() / 2 * Math.pow(start, 2) +
                zero.doubleValue() * start;
        double right = one.doubleValue() / 2 * Math.pow(end, 2) +
                zero.doubleValue() * end;
        return right - left;
    }

    
    /** 
     * @return T
     */
    //геттеры \ сеттеры
    public T getZero() {
        return zero;
    }

    
    /** 
     * @param zero
     */
    public void setZero(T zero) {
        this.zero = zero;
    }

    
    /** 
     * @return T
     */
    public T getOne() {
        return one;
    }

    
    /** 
     * @param one
     */
    public void setOne(T one) {
        this.one = one;
    }

    
    /** 
     * @return int
     */
    @Override
    public int intValue() {
        return zero.intValue();
    }

    
    /** 
     * @return long
     */
    @Override
    public long longValue() {
        return (long) zero;
    }

    
    /** 
     * @return float
     */
    @Override
    public float floatValue() {
        return (float) zero;
    }

    
    /** 
     * @return double
     */
    @Override
    public double doubleValue() {
        return (double) zero;
    }
}
