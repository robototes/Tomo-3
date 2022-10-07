package org.usfirst.frc.team2412.robot.commands;

public class MoveCannonDownCommand extends CommandBase {

	public MoveCannonDownCommand() {
		requires(moveCannon);
	}

	/** Called when the command is run */
	@Override
	protected void execute() {
		moveCannon.moveCannonDown();
	}

	/** Determines when this command exits */
	@Override
	protected boolean isFinished() {
		return false;
	}

	/** Called when this command ends */
	@Override
	protected void end() {
		moveCannon.stopCannon();
	}
}
