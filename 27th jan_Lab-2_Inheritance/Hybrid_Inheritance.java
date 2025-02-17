import java.util.Scanner;

// Base class
abstract class SmartDevice {
    protected String deviceName;
    protected int powerConsumption;

    public SmartDevice(String deviceName, int powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
    }

    public void displayInfo() {
        System.out.println("\nDevice: " + deviceName);
        System.out.println("Power Consumption: " + powerConsumption + "W");
    }
}

// First interface for remote control operations
interface RemoteControl {
    void turnOn();
    void turnOff();
}

// Second interface for internet connectivity operations
interface InternetConnectivity {
    void connectToWiFi(String networkName);
}

// SmartTV extends SmartDevice and implements both interfaces
class SmartTV extends SmartDevice implements RemoteControl, InternetConnectivity {
    private boolean isOn;
    private String connectedNetwork;

    public SmartTV(String deviceName, int powerConsumption) {
        super(deviceName, powerConsumption);
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(deviceName + " is now ON.");
        } else {
            System.out.println("Warning: " + deviceName + " is already ON.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(deviceName + " is now OFF.");
        } else {
            System.out.println("Warning: " + deviceName + " is already OFF.");
        }
    }

    @Override
    public void connectToWiFi(String networkName) {
        try {
            if (networkName == null || networkName.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: WiFi network name cannot be empty.");
            }
            connectedNetwork = networkName;
            System.out.println(deviceName + " connected to WiFi: " + connectedNetwork);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

// SmartLight implements only the RemoteControl interface
class SmartLight implements RemoteControl {
    private boolean isOn;
    private String lightColor;

    public SmartLight(String lightColor) {
        this.isOn = false;
        this.lightColor = lightColor;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("SmartLight (" + lightColor + ") is now ON.");
        } else {
            System.out.println("Warning: SmartLight is already ON.");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("SmartLight (" + lightColor + ") is now OFF.");
        } else {
            System.out.println("Warning: SmartLight is already OFF.");
        }
    }
}

// Main class with User Interaction
public class Inherit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Smart Devices
        SmartTV tv = new SmartTV("Samsung 4K TV", 150);
        SmartLight light = new SmartLight("Warm White");

        int choice;
        do {
            System.out.println("\nSmart Device Controller");
            System.out.println("1. Smart TV");
            System.out.println("2. Smart Light");
            System.out.println("3. Exit");
            System.out.print("Choose a device: ");

            try {
                choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        controlSmartTV(tv, scanner);
                        break;
                    case 2:
                        controlSmartLight(light, scanner);
                        break;
                    case 3:
                        System.out.println("Exiting Smart Device Controller. Thank you!");
                        break;
                    default:
                        System.out.println("Error: Invalid choice! Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input! Please enter a numeric value.");
                choice = 0; // Reset choice to keep loop running
            }
        } while (choice != 3);

        scanner.close();
    }

    // Control Smart TV
    private static void controlSmartTV(SmartTV tv, Scanner scanner) {
        int option;
        do {
            System.out.println("\nSmart TV Menu");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Connect to WiFi");
            System.out.println("4. Display Info");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            try {
                option = Integer.parseInt(scanner.nextLine().trim());

                switch (option) {
                    case 1:
                        tv.turnOn();
                        break;
                    case 2:
                        tv.turnOff();
                        break;
                    case 3:
                        System.out.print("Enter WiFi Network Name: ");
                        String networkName = scanner.nextLine().trim();
                        tv.connectToWiFi(networkName);
                        break;
                    case 4:
                        tv.displayInfo();
                        break;
                    case 5:
                        return; // Go back to main menu
                    default:
                        System.out.println("Error: Invalid choice! Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input! Please enter a numeric value.");
                option = 0;
            }
        } while (option != 5);
    }

    // Control Smart Light
    private static void controlSmartLight(SmartLight light, Scanner scanner) {
        int option;
        do {
            System.out.println("\nSmart Light Menu");
            System.out.println("1. Turn ON");
            System.out.println("2. Turn OFF");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            try {
                option = Integer.parseInt(scanner.nextLine().trim());

                switch (option) {
                    case 1:
                        light.turnOn();
                        break;
                    case 2:
                        light.turnOff();
                        break;
                    case 3:
                        return; // Go back to main menu
                    default:
                        System.out.println("Error: Invalid choice! Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input! Please enter a numeric value.");
                option = 0;
            }
        } while (option != 3);
    }
}
