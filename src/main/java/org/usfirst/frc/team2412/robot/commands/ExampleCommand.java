/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import org.usfirst.frc.team2412.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class ExampleCommand extends CommandBase {

	public ExampleCommand() {
		// Use addRequirements() here to declare subsystem dependencies
		addRequirements(Robot.kExampleSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	public void initialize() {}

	// Called repeatedly when this Command is scheduled to run
	@Override
	public void execute() {}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	public boolean isFinished() {
		return false;
	}
}
