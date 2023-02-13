package Hybrid_Inheritance;

import Classes.Samsung;
import Classes.SamsungCamera;
import Classes.SmartPhone;
import Classes.Pixel;

public class hybrid_inheritance {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This is hybrid Inheritance");
        System.out.println();
        System.out.println("Parent Class");
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.phone();
        System.out.println();

        System.out.println("Child Class 1");
        Pixel pixel=new Pixel();
        pixel.phone();
        pixel.operatingSystem();
        System.out.println();

        System.out.println("Child Class 2");
        Samsung samsung = new Samsung();
        samsung.phone();
        samsung.operatingSystem();
        System.out.println();

        System.out.println("Child Class 3 derived from Child Class 2");
        SamsungCamera samsungCamera = new SamsungCamera();
        samsungCamera.phone();
        samsungCamera.operatingSystem();
        samsungCamera.camera();
    }
}
