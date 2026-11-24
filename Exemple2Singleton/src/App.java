public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int som= Singleton.getInstance().somme(2, 5);
        System.out.println("la somme est : "+som);

        Singleton S1= Singleton.getInstance(8, 3);

        S1.affiche();
        Singleton S2= Singleton.getInstance(16, 19);
        S2.affiche();
    }
}
