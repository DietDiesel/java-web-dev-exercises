package exercises.technology;

import java.util.ArrayList;

public class Laptop extends Computer{
    private ArrayList<String> installedSoftware = new ArrayList<>();

    public Laptop(String aCpu, String aUserInterface) {
        super(aCpu, aUserInterface);
    }

    public ArrayList<String> getInstalledSoftware() {
        return installedSoftware;
    }

    public void installSoftware(String aSoftwareName) {
        double powerNeeded = aSoftwareName.length() % 12;
        if (this.consumePower(powerNeeded)) {
            installedSoftware.add(aSoftwareName);
            return;
        }
        //yeah, the amount of battery consumed is based on the length of the software name.
        //just a funsy way to get a random-ish number.
    }

    public void uninstallSoftware(String aSoftwareName) {
        double powerNeeded = aSoftwareName.length() % 7;
        if (this.consumePower(powerNeeded)) {
            installedSoftware.remove(installedSoftware.indexOf(aSoftwareName));
            return;
        }
        //yeah, the amount of battery consumed is based on the length of the software name.
        //just a funsy way to get a random-ish number.
    }
}
