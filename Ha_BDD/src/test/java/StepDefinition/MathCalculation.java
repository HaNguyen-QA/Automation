package StepDefinition;

public class MathCalculation {
    private int a;
    private int b;


    public MathCalculation(int a, int b){
        this.a=a;
        this.b=b;

    }


    public float sum(){return this.a + this.b;}
    public float subtract(){return this.a - this.b;}
    public float multiply(){return this.a * this.b;}
    public float divide(){

        return this.a/this.b;}

    @Override
    public String toString() {
        return "StepDefinition.MathCalculation{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
