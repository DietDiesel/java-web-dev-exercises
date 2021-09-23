package exercises.technology;

import javax.sound.midi.SysexMessage;

public class Program {
    public static void main(String[] args) {
        Laptop system76Gazelle = new Laptop("Core i7-1185G7 Tiger Lake", "Mouse & Keyboard");
        SmartPhone samsungGalaxy42 = new SmartPhone("Snapdragon 888", "Touchscreen");
        system76Gazelle.installSoftware("CentOS Stream");
        system76Gazelle.installSoftware("JetBrains IntelliJ");
        system76Gazelle.installSoftware("Microsoft VS Code");
        system76Gazelle.installSoftware("Steam");
        System.out.println(system76Gazelle.getInstalledSoftware());
        system76Gazelle.sendEmail("Bill Gates");
        system76Gazelle.sendEmail("Adam Savage");
        system76Gazelle.sendEmail("Linus Torvalds");
        system76Gazelle.sendEmail("Max Cooper");

        do {
            system76Gazelle.sendEmail("Adam Savage");
        } while (system76Gazelle.getBatteryLevel() > 0.0);

        samsungGalaxy42.installApp("Slack");
        samsungGalaxy42.installApp("GitHub");
        samsungGalaxy42.installApp("Trello");
        samsungGalaxy42.installApp("Twitter");
        System.out.println(samsungGalaxy42.getInstalledApps());

        do {
            samsungGalaxy42.sendEmail("Adam Savage");
        } while (samsungGalaxy42.getBatteryLevel() > 0.0);

        system76Gazelle.recharge();
        samsungGalaxy42.recharge();

    }
}
