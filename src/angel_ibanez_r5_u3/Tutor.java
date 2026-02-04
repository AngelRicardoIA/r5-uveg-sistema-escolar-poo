package angel_ibanez_r5_u3;

public class Tutor extends Persona implements Calificaciones {
    private Alumno alumno;
    //Constructor
    public Tutor(){
        super();
    }
    
    @Override
    public void mostrarCalificaciones() {
        alumno.mostrarCalificaciones();
    }

    protected void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    } 
}
