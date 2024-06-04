/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: alquilerCarros
 * Autor: Kelvin Guerrero - 06-feb-2013
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.alquilerCarros.mundo;

/**
 * Clase que representa un carro de la tienda de alquiler de carros
 */
public class Carro
{

    // -------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------

    /**
     * El numero horas que ha sido alquilado el carro
     */
    private int numeroHoras;

    /**
     * El precio por hora de alquiler del carro
     */
    private int precioHora;

    /**
     * El nombre de la marca del carro
     */
    private String marcaCarro;
    //TODO declare el atributo marcaCarro de tipo String

    /**
     * El total de dinero recaudado por el alquiler del Carro
     */
    private int dineroRecaudado;

    //TODO declare el atributo dineroRecaudado de tipo int

    /**
     * El total de cupones redimidos  
     */
    private int cupones;
    //TODO declare el atributo cupones de tipo int


    // -------------------------------------------------------------
    // M�todos
    // -------------------------------------------------------------

    /**
     * Inicializa el Carro con los valores que llegan por par�metro<br>
     * <b>post: </b> El Carro se inicializ� con numero de horas en cero,<br>
     * dinero recaudado en cero y los cupones en cero<br>
     * @param pPrecioHora Valor del alquiler por hora
     * @param pMarcaCarro El nombre de la marca del carro
     */
    public void inicializar( int pPrecioHora, String pMarcaCarro )
    {
        precioHora = pPrecioHora;
        marcaCarro = pMarcaCarro;
        
        numeroHoras = 0;
        dineroRecaudado = 0;
        cupones = 0;
        //TODO inicialice numeroHoras, dineroRecaudado y cupones en cero 
        
    }

    /**
     * Devuelve el numero de horas alquiladas del carro <br>
     * @return numero de horas alquiladas
     */
    public int darNumeroHoras( )
    {
        return numeroHoras;
    }

    /**
     * Devuelve el precio por hora de alquiler del carro <br>
     * @return precio por hora de alquiler
     */
    public int darPrecioHora( )
    {
        return precioHora;
    }

    /**
     * Devuelve la marca del carro <br>
     * @return La marca del carro
     */
    public String darMarcaCarro( )
    {
        return marcaCarro;//TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Devuelve el dinero recaudado por el carro<br>
     * @return El dinero recaudado
     */
    public int darDineroRecaudado( )
    {
        return dineroRecaudado;//TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Devuelve la cantidad de cupones redimidos <br>
     * @return N�mero de cupones redimidos
     */
    public int darCuponesRedimidos( )
    {
        return cupones;//TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Registrar el alquiler del carro dado un n�mero de horas <br>
     * <b>post: </b> Se incremento el numero de horas alquiladas del carro, <br>
     *               Se incremento el dineroRecaudado de acuerdo al numero 
     *               de horas alquiladas y su precio. <br>
     * @param pNumeroHoras Numero de horas alquiladas
     */
    public void registrarAlquiler( int pNumeroHoras )
    {
        numeroHoras += pNumeroHoras;
        dineroRecaudado += (pNumeroHoras * precioHora);
        
        //TODO Completar seg�n la documentaci�n del m�todo

    }

    /**
     * Registrar el alquiler del carro dado un n�mero de horas, teniendo en cuenta el descuento dado por el cup�n.<br>
     * <b>post: </b> Se incremento el numero de horas alquiladas del carro, <br>
     *               Se incremento el dineroRecaudado de acuerdo al numero de horas alquiladas y su precio con un descuento del 50% <br>
     *               Se incremento el n�mero de cupones en uno. 
     * @param pNumeroHoras Numero de horas alquiladas
     */
    public void registrarAlquilerCupon( int pNumeroHoras )
    {
        numeroHoras += pNumeroHoras;
        dineroRecaudado += (pNumeroHoras * precioHora)  * 0.5;
        cupones++;
        //TODO Completar seg�n la documentaci�n del m�todo
    }

    /**
     * Reinicia el Carro, deja el n�mero de horas alquiladas, el dinero recaudado y el n�mero de cupones en cero.
     */
    public void reiniciar( )
    {
        numeroHoras = 0;
        dineroRecaudado = 0;
        cupones = 0;
        //TODO Completar seg�n la documentaci�n del m�todo
    }
}