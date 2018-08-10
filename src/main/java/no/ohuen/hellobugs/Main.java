package no.ohuen.hellobugs;

public class Main {

    public static void main(String[] args) {
        String[] pieces = new String[]{"Hello", ",", "world", "!"};

        String helloString = "";

        for (String s : pieces) {
            helloString += s;
        }
        System.out.println(helloString);
        
        Main m = new Main();
        m.Testa(null, null);
    }

    public void Testa(Long from, Long to) {
        Long _from = from != 0 ? from : null;
        Long _to = to != 0 ? to : 0L;
        System.out.println(_from);
        System.out.println(_to);
    }
}
