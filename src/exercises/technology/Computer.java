package exercises.technology;

public class Computer {
    private String cpu;
    private String userInterface;
    private double batteryLevel = 100.0;

    public Computer(String aCpu, String aUserInterface) {
        cpu = aCpu;
        userInterface = aUserInterface;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getUserInterface() {
        return userInterface;
    }

    public void setUserInterface(String userInterface) {
        this.userInterface = userInterface;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void recharge() {
        batteryLevel = 100.0;
    }

    public boolean consumePower(double aWatts) {
        batteryLevel -= aWatts;
        if (batteryLevel <= 0.0) {
            batteryLevel = 0.0;
            System.out.println("Battery too low! Operation not complete. Please recharge me!");
            return false;
        }
        return true;
    }

    public void sendEmail(String aRecip) {
        double powerNeeded = aRecip.length() % 3;
        if (consumePower(powerNeeded)) {
            System.out.println("Email to " + aRecip + " sent!");
            return;
        }
    }
}
