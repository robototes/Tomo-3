package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.OI;

public class ChargeCannonCommand extends CommandBase {

	public ChargeCannonCommand() {
		requires(cannon);
	}

	/** Called when the command is run */
	@Override
	protected void execute() {
		cannon.chargeCompressors();
		OI.arduino.writeString("go");
	}
}
