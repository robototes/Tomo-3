package org.usfirst.frc.team2412.robot.commands;

public class MoveCannonDownCommand extends CommandBase {

	public MoveCannonDownCommand() {
		addRequirements(moveCannon);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		moveCannon.moveCannonDown();
	}

	/** Determines when this command exits */
	@Override
	public boolean isFinished() {
		return false;
	}

	/** Called when this command ends */
	@Override
	public void end(boolean interrupted) {
		moveCannon.stopCannon();
	}
}
