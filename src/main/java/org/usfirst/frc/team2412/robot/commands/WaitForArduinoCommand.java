package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.OI;

public class WaitForArduinoCommand extends CommandBase {

	@Override
	public void initialize() {
		OI.arduino.writeString("go");
	}

	@Override
	public boolean isFinished() {
		if (OI.arduino.readString().equals("slay")) {
			OI.arduino.reset();
			return true;
		}
		return false;
	}
}
