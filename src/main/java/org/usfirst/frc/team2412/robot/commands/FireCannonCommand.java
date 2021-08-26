package org.usfirst.frc.team2412.robot.commands;

public class FireCannonCommand extends CommandBase {

	public FireCannonCommand() {
		requires(cannon);
	}

	/** Called when the command is run */
	@Override
	protected void execute() {
		cannon.fireCannon();
	}
	
	/** Determines when this command exits */
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	/** Called when this command ends */
	@Override
	protected void end() {
		cannon.resetCannon();
	}
}
