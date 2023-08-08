package org.usfirst.frc.team2412.robot.commands;

public class MoveCannonUpCommand extends CommandBase {

	public MoveCannonUpCommand() {
		addRequirements(moveCannon);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		moveCannon.moveCannonUp();
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
