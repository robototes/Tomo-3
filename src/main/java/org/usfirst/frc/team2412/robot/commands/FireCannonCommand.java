package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.OI;

public class FireCannonCommand extends CommandBase {

	public FireCannonCommand() {
		addRequirements(cannon);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		cannon.fireCannon();
	}

	/** Determines when this command exits */
	@Override
	public boolean isFinished() {
		return OI.arduino.readString() != "";
	}

	/** Called when this command ends */
	@Override
	public void end(boolean interrupted) {
		cannon.resetCannon();
	}
}
