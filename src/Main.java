//PROVA "CARTACEA"
//[A]: 2 <= 2 && !true = vero e non vero(falso) -> F
//[B]: !false && 3 > 2 = non falso(vero) e vero -> T
//[C]: considering that t=false and f=true: !(!t || f) = falso || falso -> F
//[D]: 6 > 6 ^ !(true && true) = falso ^ falso -> F

public class Main {
    public static void main(String[] args) {
        boolean t = false;
        boolean f = true;

        System.out.println(2 <= 2 && !true);
        System.out.println(!false && 3 > 2 );
        System.out.println(!(!t || f));
        System.out.println(6 > 6 ^ !(true && true));
    }
}
