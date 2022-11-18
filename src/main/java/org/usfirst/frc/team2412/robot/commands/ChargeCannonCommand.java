package org.usfirst.frc.team2412.robot.commands;

public class ChargeCannonCommand extends CommandBase {

	public ChargeCannonCommand() {
		addRequirements(cannon);
	}

	/** Called when the command is run */
	@Override
	public void execute() {
		CommandBase.cannon.chargeCompressors();
	}
}
