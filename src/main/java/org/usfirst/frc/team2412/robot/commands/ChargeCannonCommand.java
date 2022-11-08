package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.OI;

public class ChargeCannonCommand extends CommandBase {

	public ChargeCannonCommand() {
		addRequirements(CommandBase.cannon);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		CommandBase.cannon.chargeCompressors();
		OI.arduino.writeString("go");
	}
}
