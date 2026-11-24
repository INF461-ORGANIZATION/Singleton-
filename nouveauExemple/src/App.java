import Singleton3.Configuration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Configuration config = Configuration.getInstance();
        config.setLangue("Français");
        config.setModeSombre(true);
        config.afficherConfiguration();

        config.setLangue("Anglais");
        config.setModeSombre(false);
        config.afficherConfiguration();
    }
}
