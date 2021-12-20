
    class Finalmethod{
        final void demo(){
            System.out.println("XYZ Class Method");
        }
    }

    class DEF extends Finalmethod{
        public static void main(String args[]){
            DEF obj= new DEF();
            obj.demo();
        }
    }

