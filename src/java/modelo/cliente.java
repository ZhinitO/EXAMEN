package modelo;

public class cliente {
    
    private int ID_CLI;
    private String DNI_CLI; 
    private String NOM_CLI; 
    private String FONO_CLI; 
    private String CORREO_CLI;
    private String CLAVE_CLI ;

    public cliente() {
    }

    public cliente(int ID_CLI, String DNI_CLI, String NOM_CLI, String FONO_CLI, String CORREO_CLI, String CLAVE_CLI) {
        this.ID_CLI = ID_CLI;
        this.DNI_CLI = DNI_CLI;
        this.NOM_CLI = NOM_CLI;
        this.FONO_CLI = FONO_CLI;
        this.CORREO_CLI = CORREO_CLI;
        this.CLAVE_CLI = CLAVE_CLI;
    }

    public String getCLAVE_CLI() {
        return CLAVE_CLI;
    }

    public void setCLAVE_CLI(String CLAVE_CLI) {
        this.CLAVE_CLI = CLAVE_CLI;
    }

    public int getID_CLI() {
        return ID_CLI;
    }

    public void setID_CLI(int ID_CLI) {
        this.ID_CLI = ID_CLI;
    }

    public String getDNI_CLI() {
        return DNI_CLI;
    }

    public void setDNI_CLI(String DNI_CLI) {
        this.DNI_CLI = DNI_CLI;
    }

    public String getNOM_CLI() {
        return NOM_CLI;
    }

    public void setNOM_CLI(String NOM_CLI) {
        this.NOM_CLI = NOM_CLI;
    }

    public String getFONO_CLI() {
        return FONO_CLI;
    }

    public void setFONO_CLI(String FONO_CLI) {
        this.FONO_CLI = FONO_CLI;
    }

    public String getCORREO_CLI() {
        return CORREO_CLI;
    }

    public void setCORREO_CLI(String CORREO_CLI) {
        this.CORREO_CLI = CORREO_CLI;
    }
    
    
}
