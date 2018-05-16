package org.usfirst.frc.team2412.robot.commands;

public class ChargeCannonCommand extends CommandBase {

	public ChargeCannonCommand() {
		requires(cannon);
	}

	/** Called when the command is run */
	@Override
	protected void execute() {
		cannon.chargeCompressors();
	}
}
