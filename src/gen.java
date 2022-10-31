public class gen <T> {
    T thing;

    public  gen(T in) {
        this.thing= in;
        //return thing;
    }
    public void print(){
        System.out.println(thing);
    }

    public static void main(String[] args){
        gen<Integer> print =new gen<>(23);
        print.print();
        // System.out.println(print);

}}
