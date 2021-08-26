package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;

public class MoveCannonThrottleCommand extends CommandBase {

	public MoveCannonThrottleCommand() {
		requires(moveCannon);
	}
	
	/** Called when the command is run */
	@Override
	protected void execute() {
		moveCannon.moveCannonSpeed(-Robot.m_oi.controller.getTriggerAxis(Hand.kLeft));
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
