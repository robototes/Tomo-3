package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;

public class DriveCommand extends CommandBase {

	DriveBaseSubsystem driveBase;

	public DriveCommand(DriveBaseSubsystem driveBase) {
		this.driveBase = driveBase;
		addRequirements(driveBase);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		driveBase.driveMecanumGyro(Robot.m_oi.controller);
	}
}
