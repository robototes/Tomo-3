package org.usfirst.frc.team2412.robot.commands;

public class ShootCannonCommand extends CommandBase {

	public ShootCannonCommand() {
		addRequirements(cannon);
	}

	long time;

	@Override
	public void initialize() {
		time = System.currentTimeMillis();
	}

	@Override
	public void execute() {
		cannon.fireCannon();
	}

	@Override
	public void end(boolean interrupted) {
		cannon.resetCannon();
	}

	@Override
	public boolean isFinished() {
		return System.currentTimeMillis() >= time + 1000;
	}
}
