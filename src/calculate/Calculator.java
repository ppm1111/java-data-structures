package calculate;

public class Calculator {
    public int x;
    public int y;
    
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int add() {
        return x + y;
    }
    
    public int sub() {
        return x - y;
    }
    
    public int mul() {
        return x * y;
    }
    
    public int div() {
        return x / y;
    }
    
    public int mod() {
        return x % y;
    }
}
