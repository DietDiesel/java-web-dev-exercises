package exercises.technology;

import java.util.ArrayList;

public class SmartPhone extends Computer{
    private ArrayList<String> installedApps = new ArrayList<>();

    public SmartPhone(String aCpu, String aUserInterface) {
        super(aCpu, aUserInterface);
    }


    public ArrayList<String> getInstalledApps() {
        return installedApps;
    }

    public void installApp(String aAppName) {
        double powerNeeded = aAppName.length() % 7;
        if (this.consumePower(powerNeeded)) {
            installedApps.add(aAppName);
            return;
        }
        //yeah, the amount of battery consumed is based on the length of the software name.
        //just a funsy way to get a random-ish number.
    }

    public void uninstallApp(String aAppName) {
        double powerNeeded = aAppName.length() % 2;
        if (this.consumePower(powerNeeded)) {
            installedApps.remove(installedApps.indexOf(aAppName));
            return;
        }
        //yeah, the amount of battery consumed is based on the length of the software name.
        //just a funsy way to get a random-ish number.
    }
}
