package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.CannonSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.MoveCannonSubsystem;

public class CommandBase extends edu.wpi.first.wpilibj2.command.CommandBase {

	/** Subsystem instances for driving and shooting */
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static CannonSubsystem cannon = new CannonSubsystem();
	public static MoveCannonSubsystem moveCannon = new MoveCannonSubsystem();

	@Override
	public boolean isFinished() {
		return true;
	}
}
