package commandpattern;

import java.util.ArrayList;
import java.util.List;


interface Command {
    void execute();
}

// Concrete Command classes
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}


class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}


class RemoteControl {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressButton(int slot) {
        if (slot >= 0 && slot < commands.size()) {
            commands.get(slot).execute();
        } else {
            System.out.println("Invalid slot");
        }
    }
}

public class RemoteControlTest {
    public static void main(String[] args) {
        
        Light light = new Light();

       
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        
        RemoteControl remote = new RemoteControl();

       
        remote.addCommand(lightOn);
        remote.addCommand(lightOff);

        
        remote.pressButton(0); 
        remote.pressButton(1); 
    }
}

/*  Output:
    Light is on
    Light is off */