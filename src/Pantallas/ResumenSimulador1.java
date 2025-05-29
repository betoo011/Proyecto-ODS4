/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

/**
 *
 * @author pc
 */
public class ResumenSimulador1 {
    private static int aciertos = 0;

    public static void sumarAcierto() {
        aciertos++;
    }

    public static int getAciertos() {
        return aciertos;
    }

    public static void resetear() {
        aciertos = 0;
    }
}

