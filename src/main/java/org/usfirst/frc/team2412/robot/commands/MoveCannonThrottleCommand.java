package org.usfirst.frc.team2412.robot.commands;

public class MoveCannonThrottleCommand extends CommandBase {

	double speed;

	public MoveCannonThrottleCommand(double speed) {
		addRequirements(moveCannon);
		this.speed = speed;
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		moveCannon.moveCannonSpeed(speed);
	}

	/** Determines when this command exits */
	@Override
	public boolean isFinished() {
		return false;
	}

	/** Called when this command ends */
	@Override
	public void end(boolean interrupted) {
		//		moveCannon.stopCannon();
	}
}
