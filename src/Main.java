//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pies p1 = new Pies("Azor");
    Kot k1 = new Kot("Maciek");
    Kangur ka1 = new Kangur("Boxer");
    Kangur ka2 = new Kangur("Brytan");
    p1.oddychaj();
    k1.oddychaj();
    p1.dajGlos();
    k1.dajGlos();
    ka1.dajGlos();
    ka2.dajGlos();
        System.out.println(p1.ileNog());
        System.out.println(k1.ileNog());


    }
}