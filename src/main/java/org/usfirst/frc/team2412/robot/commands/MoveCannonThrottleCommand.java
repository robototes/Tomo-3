package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import org.usfirst.frc.team2412.robot.Robot;

public class MoveCannonThrottleCommand extends CommandBase {

	double speed;

	public MoveCannonThrottleCommand(double speed) {
		requires(moveCannon);
		this.speed = speed;
	}

	/** Called when the command is run */
	@Override
	protected void execute() {
		moveCannon.moveCannonSpeed(speed);
	}

	/** Determines when this command exits */
	@Override
	protected boolean isFinished() {
		return false;
	}

	/** Called when this command ends */
	@Override
	protected void end() {
		//		moveCannon.stopCannon();
	}
}
