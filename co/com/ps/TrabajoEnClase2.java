package co.com.ps;
//Objeto es celular
public class TrabajoEnClase2 {

    private String memoria;

    public void setMemoria(String memoria){
        this.memoria=memoria;
    }

    public String getMemoria(){
        return this.memoria;
    }

    public void foto(){
        System.out.println("Tomar foto");
    }

 ///////////////////////////////////////////////////////////

    private String tamano;

    public void setTamano(String tamano){
        this.tamano=tamano;
    }

    public String getTamano(){
        return  this.tamano;
    }

    public  void video(){
        System.out.println("Tomar video");
    }

    //////////////////////////////////////////////////////////

    private String precio;

    public void setPrecio(String precio){
        this.precio=precio;
    }

    public String getPrecio(){
        return this.precio;
    }

    public void mensaje(){
        System.out.println("Enviar mensaje");
    }

    ////////////////////////////////////////////////////////////////////

    private String peso;

    public void setPeso(String peso){
        this.precio=precio;
    }

    public String getPeso(){
        return  this.peso;
    }

    public void llamada(){
        System.out.println("Haciendo llamada");
    }


}
