public class Pies implements Zwierze {

    String imie;
    public Pies(String imie){
        this.imie = imie;
    }


    @Override
    public void dajGlos(){
        System.out.println("Hau Hau !!!");
    }
    @Override
    public int ileNog(){
        return 4;
    }

}
