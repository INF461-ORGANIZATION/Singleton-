package Singleton3;

public final class Configuration {
    private static Configuration instance = null;
    private String langue;
    private boolean modeSombre;

    private Configuration() {
        super();
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public void setModeSombre(boolean modeSombre) {
        this.modeSombre = modeSombre;
    }
    public void afficherConfiguration() {
        System.out.println("Langue: " + langue);
        System.out.println("Mode sombre: " + modeSombre);
    }

}
