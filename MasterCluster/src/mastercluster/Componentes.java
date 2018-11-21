package mastercluster;

public class Componentes {
    
    int ID;
    String IP;
    String Estado = "Desativado";

    Componentes() {}

    public int getID() {
        return ID;
    }

    public String getIP() {
        return IP;
    }

    public String getEstado() {
        return Estado;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Componentes(int ID, String IP, String Est) {
        this.ID = ID;
        this.IP = IP;
        this.Estado = Est;
    }
}
