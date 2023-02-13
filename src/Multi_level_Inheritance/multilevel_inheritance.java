package Multi_level_Inheritance;

import Classes.SamsungCamera;

public class multilevel_inheritance {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This is Multilevel Inheritance");
        SamsungCamera samsungCamera = new SamsungCamera();
        samsungCamera.phone();
        samsungCamera.operatingSystem();
        samsungCamera.camera();
    }
}
