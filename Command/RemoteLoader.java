package Command;

import Command.Command.LightOffCommand;
import Command.Command.LightOnCommand;
import Command.Command.StereoOffWithCDCommand;
import Command.Command.StereoOnWithCDCommand;
import Command.Invoker.RemoteControl;
import Command.Objects.Light;
import Command.Objects.Stereo;

public class RemoteLoader {
    // Command Pattren
    // encapsulate all information needed to perform an action or trigger an event
    // at a later time
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOffWithCD);

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(3);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
    }
}
