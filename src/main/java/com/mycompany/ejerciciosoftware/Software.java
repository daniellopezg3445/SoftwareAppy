/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciosoftware;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Software {

     public static void main(String[] args) {
        // Inicializar objetos
        MotionDetection motionDetection = new MotionDetection();
        MotionAction motionAction = new MotionAction();
        CameraManager cameraManager = new CameraManager();
        Scanner scanner = new Scanner(System.in);

        // Simular el ciclo principal del sistema
        while (true) {
            System.out.println("Select a camera to view:");
            for (int i = 0; i < cameraManager.cameras.length; i++) {
                System.out.println((i + 1) + ". " + cameraManager.cameras[i].name);
            }
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else if (choice >= 1 && choice <= cameraManager.cameras.length) {
                // Mostrar información de la cámara seleccionada
                cameraManager.displayCameraInfo(choice - 1);

                // Simular detección de movimiento
                if (motionDetection.isMotionDetected()) {
                    System.out.println("Motion detected in " + cameraManager.cameras[choice - 1].location);
                    motionAction.triggerLights();
                } else {
                    System.out.println("No motion detected in " + cameraManager.cameras[choice - 1].location);
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
