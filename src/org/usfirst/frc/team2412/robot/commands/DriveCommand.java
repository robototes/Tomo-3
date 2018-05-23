package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

public class DriveCommand extends CommandBase {
	public DriveCommand() {
		requires(driveBase);
	}
	
	/** Called when the command is run */
	@Override
	protected void execute() {
		driveBase.driveMecanumGyro(Robot.m_oi.stick, true);
	}
}
