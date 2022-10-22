public class Complejo {
    private int real;
    private int imag;
    
    Complejo (int pr, int pi) {
        real = pr;
        imag = pi;
    }
    
    Complejo () {
        real = 0;
        imag = 0;
    }
    
    int getReal () {
        return real;
    }
    
    void setReal (int numR) {
        real = numR;
    }
    
    int getImag () {
        return imag;
    }
    
    void setImag (int numI) {
        imag = numI;
    }
    
    int getSumaRealImag () {
        return real + imag;
    }
}
