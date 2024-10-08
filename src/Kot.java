public class Kot implements Zwierze {

    String imie;
     public Kot(String imie){
         this.imie = imie;
     }

    @Override
    public void dajGlos(){
        System.out.println("Miau Miau !!!");
    }
    @Override
    public int ileNog(){
        return 4;
    }

}
