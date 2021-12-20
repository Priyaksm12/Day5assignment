public class Passbyrefernce {
    int a = 10;
        void call(Passbyrefernce eg) {
            eg.a = eg.a+10;
        }
        public static void main(String[] args) {

            Passbyrefernce eg = new Passbyrefernce();
            System.out.println("Before call-by-reference: " + eg.a);


            eg.call(eg);
            System.out.println("After call-by-reference: " + eg.a);
        }
    }

