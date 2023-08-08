package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.MoveCannonSubsystem;

public class MoveCannonThrottleCommand extends CommandBase {

	double speed;
	MoveCannonSubsystem moveCannon;

	public MoveCannonThrottleCommand(
		MoveCannonSubsystem moveCannon,
		double speed
	) {
		this.moveCannon = moveCannon;
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
