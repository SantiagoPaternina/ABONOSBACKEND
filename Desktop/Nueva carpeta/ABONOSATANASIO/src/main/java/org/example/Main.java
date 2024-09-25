package org.example;

import org.example.Modelos.Hincha;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("***********");
        System.out.println("SISTEMA DE ABONOS 2024-2");
        System.out.println("*************");

        System.out.println("\n Bienvenido !!!");

        Scanner lea = new Scanner(System.in);
        Hincha hincha = new Hincha();


        System.out.println("Digita tu nombre: ");
        hincha.setNombres(lea.nextLine());

        System.out.println("Digite su apellido: ");
        hincha.setApellido(lea.nextLine());

        System.out.println("Digite su numero de documento: ");
        hincha.setNumeroDocumento(lea.nextLine());

        System.out.println("Digita tu telefono: ");
        hincha.setTelefono(lea.nextLine());

        System.out.println("Digita tu correo: ");
        hincha.setCorreo(lea.nextLine());

        System.out.println("Digita tu direccion: ");
        hincha.setDireccion(lea.nextLine());

        System.out.println("Si mueres a quien llamamos");
        hincha.setContactoEmergencia(lea.nextLine());

        System.out.println("En que ciudad vives: ");
        hincha.setCiudad(lea.nextLine());

        System.out.println("En que año naciste: ");
        Integer anio = lea.nextInt();

        System.out.println("En que mes naciste: ");
        Integer mes = lea.nextInt();

        System.out.println("En que dia naciste: ");
        Integer dia = lea.nextInt();

        hincha.setFechaNacimiento(LocalDate.of(anio, mes, dia));

        //imprimiendo los datos del hincha
        System.out.println(hincha);


        /*LocalDate fechaprueba = LocalDate.of(2007, 7, 30);
        LocalDate fechahoy = LocalDate.now();
        Long diferencia = ChronoUnit.DAYS.between(fechaprueba,fechahoy);
        Long diferencia2 = ChronoUnit.MONTHS.between(fechaprueba,fechahoy);
        System.out.println(diferencia);
        System.out.println(diferencia2);*/
    }
}