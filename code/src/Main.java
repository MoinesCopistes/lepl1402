
public class Main<E> {
    public E e;
    public Main(E e){
        this.e = e;
    }
    public static void main(String[] args){
        Main<Integer> main = new Main<>(0);
    }

}
class SecondClass {
    public static void main(String[] args){
        class ThirdClass{
            public static void main(String[] args){
                class FourthClass{
                    public static void main(String[] args){

                    }
                }
                FourthClass.main(args);
            }
        }
        ThirdClass.main(args);
    }
}