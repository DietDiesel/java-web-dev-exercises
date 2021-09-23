package exercises.technology.test;

import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    Laptop system76Gazelle;
    SmartPhone samsungGalaxy42;

    @Before
    public void createObjects() {
        system76Gazelle = new Laptop("Core i7-1185G7 Tiger Lake", "Mouse & Keyboard");
        samsungGalaxy42 = new SmartPhone("Snapdragon 888", "Touchscreen");
    }

    @Test
    public void testLaptopCpuSet() {
        assertEquals("Core i7-1185G7 Tiger Lake", system76Gazelle.getCpu());
    }

    @Test
    public void testLaptopInstallSoftware() {
        system76Gazelle.installSoftware("CentOS Stream");
        system76Gazelle.installSoftware("JetBrains IntelliJ");
        system76Gazelle.installSoftware("Microsoft VS Code");
        system76Gazelle.installSoftware("Steam");
        String softwareNumber2 = system76Gazelle.getInstalledSoftware().get(1);
        assertEquals("JetBrains IntelliJ", softwareNumber2);
    }

    @Test
    public void testLaptopBatteryLife() {
        system76Gazelle.recharge();
        assertEquals(100.0, system76Gazelle.getBatteryLevel(),0);
        system76Gazelle.installSoftware("Steam");
        assertEquals(95.0, system76Gazelle.getBatteryLevel(), 0);
    }

    @Test
    public void testSmartPhoneCpuSet() {
        assertEquals("Snapdragon 888", samsungGalaxy42.getCpu());
    }

    @Test
    public void testSmartPhoneInstallApp() {
        samsungGalaxy42.installApp("Slack");
        samsungGalaxy42.installApp("GitHub");
        samsungGalaxy42.installApp("Trello");
        samsungGalaxy42.installApp("Twitter");
        String softwareNumber2 = samsungGalaxy42.getInstalledApps().get(1);
        assertEquals("GitHub", softwareNumber2);
    }

    @Test
    public void testSmartPhoneBatteryLife() {
        samsungGalaxy42.recharge();
        assertEquals(100.0, samsungGalaxy42.getBatteryLevel(),0);
        samsungGalaxy42.installApp("Slack");
        assertEquals(95.0, samsungGalaxy42.getBatteryLevel(), 0);
    }

    @After
    public void rechargeTestComputers() {
        system76Gazelle.recharge();
        samsungGalaxy42.recharge();
    }
}
