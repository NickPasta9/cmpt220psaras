class Complex extends Number implements Comparable<Complex>,Cloneable{
    private double a; 
    private double b; 

    public Complex(double a,double b){ 
        this.a = a;
        this.b = b;
    }

    public Complex(){ 
        a = 0;
        b = 0;
    }

    public Complex(double a){
        this.b = 0;
    }

    public double getRealPart(){
        return a;
    }

    public double getImaginaryPart(){
        return b;
    }

    public String toString(){
        if (b==0){
            return a + "";
        }
        return a + " + " + b + "i";
    }

    public Complex add(Complex o){
        double addA = a + o.getRealPart();
        double addB = b + o.getImaginaryPart();
        return new Complex(addA,addB);
    }
    
    public Complex subtract(Complex o){
        double subtractA = a - o.getRealPart();
        double subtractB = b - o.getImaginaryPart();
        return new Complex(subtractA,subtractB);
    }

    public Complex multiply(Complex o){
        double multiplyA = (a * o.getRealPart()) - (b * o.getImaginaryPart());
        double multiplyB = (b * o.getRealPart()) + (a * o.getImaginaryPart());
        return new Complex(multiplyA,multiplyB);
    }

    public Complex divide(Complex o){
        
        double divideA = (a * o.getRealPart() + b * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        double divideB = (b * o.getRealPart() - a * o.getImaginaryPart()) / (o.getRealPart() * o.getRealPart() + o.getImaginaryPart() * o.getImaginaryPart());
        return new Complex(divideA,divideB);
    }

    public double abs(){
        return Math.sqrt((a*a) + (b*b));
    }

    public double getComplexValue(){ 
        return getRealPart() + getRealPart();
    }

@Override
    public int compareTo(Complex o){
    if (getComplexValue() > o.getComplexValue()){
        return 1;
    }
    else if (getComplexValue() < o.getComplexValue()){
        return -1;
    }
    else{
        return 0;
    }
}

@Override
    public Complex clone(){
    try {
        return super.clone();
    }
    catch (CloneNotSupportedException ex){
        System.out.println(ex.getStackTrace());
    }
}