package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.CannonSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	/** Subsystem instances for driving and shooting */
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static CannonSubsystem cannon = new CannonSubsystem();
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
