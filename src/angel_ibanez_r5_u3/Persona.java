package angel_ibanez_r5_u3;

abstract class Persona {
    
    //Atributos
    private int iD;
    private static int contador = 0;
    private String nombre;
    private String apellidoPaterno; 
    private String apellidoMaterno; 
    private String correoElectronico;
    
    //Constructor
    public Persona (){
        contador++;
        this.iD = contador;
    }
    
    protected void generarCorreo(){
        if(nombre != null && apellidoPaterno != null){
        correoElectronico = nombre.toLowerCase().replace(" ", "") + "." 
                + apellidoPaterno.toLowerCase().replace(" ", "") +
                "@es.uveg.edu.mx";
        }
    }
    
    //Metodo para imprimir el perfil
    public void imprimirPerfil(){
        System.out.printf("""
                          -------------------- DATOS --------------------
                          ID:        %04d
                          Nombre:    %s
                          Apellido:  %s %s
                          Correo:    %s
                          -----------------------------------------------
                           """, iD, nombre, apellidoPaterno, apellidoMaterno, correoElectronico);
    }
    
    protected int getiD() {
        return iD;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
        generarCorreo();
    }

    protected String getApellidoPaterno() {
        return apellidoPaterno;
    }

    protected void setApellidoPaterno(String apellido) {
        this.apellidoPaterno = apellido;
        generarCorreo();
    }

    protected String getApellidoMaterno() {
        return apellidoMaterno;
    }

    protected void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    protected String getCorreoElectronico() {
        return correoElectronico;
    }

    protected void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    } 
}
