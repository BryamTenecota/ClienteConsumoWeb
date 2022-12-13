package Modelo;

import sv.MetodosPrueba;
import sv.MetodosPrueba_Service;

public class ConsumoService {
    public static void main(String[] args) {
        MetodosPrueba_Service conexion = new MetodosPrueba_Service();
        MetodosPrueba cliente = conexion.getMetodosPruebaPort();
        
        System.out.println("Test de Servicios");
        System.out.println(cliente.hello("Bryam Tenecota"));
        System.out.println(cliente.potencia(3, 4));
        System.out.println(cliente.parimpar(4));
        System.out.println(cliente.diccionario("Software"));
        System.out.println(cliente.operaciones(23, 4));
        System.out.println(cliente.desplazamiento(34, 20, 15));
        System.out.println(cliente.gravitacionuniversal(40, 20, 15));
        System.out.println(cliente.alturamaxima(80, 30));
        
        if(cliente.login("BryamTenecota", "Bryam123")){
            System.out.println("Datos Correctos");
        } else {
            System.out.println("Datos Incorrectos");
        }
    }
}
