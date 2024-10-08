public class Kangur implements Zwierze{

    String imie;
    public Kangur(String imie){
        this.imie = imie;
    }

    @Override
    public void dajGlos(){
        System.out.println("Głośne warczące kaszlenie");

    }
    @Override
    public int ileNog(){
        return 2;
    }
}
