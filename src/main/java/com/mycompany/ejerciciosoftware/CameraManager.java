/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosoftware;

/**
 *
 * @author Usuario
 */
public class  CameraManager {
    CameraInfo[] cameras;

    CameraManager() {
        // Inicializar las cámaras
        cameras = new CameraInfo[3]; // Supongamos que tenemos 3 cámaras
        cameras[0] = new CameraInfo();
        cameras[0].name = "Camera 1";
        cameras[0].location = "Entrance";

        cameras[1] = new CameraInfo();
        cameras[1].name = "Camera 2";
        cameras[1].location = "Living Room";

        cameras[2] = new CameraInfo();
        cameras[2].name = "Camera 3";
        cameras[2].location = "Backyard";
    }

    void displayCameraInfo(int cameraIndex) {
        CameraInfo camera = cameras[cameraIndex];
        System.out.println("Camera Name: " + camera.name);
        System.out.println("Location: " + camera.location);
        // Puedes mostrar más información aquí según lo necesites
    }
}
