public class Empresa {

    //Atributos

    private String razonSocial;
    private String nit;
    private String telefono;
    private String direccion;

    public Empresa(String razonSocial, String nit, String telefono, String direccion) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    }


