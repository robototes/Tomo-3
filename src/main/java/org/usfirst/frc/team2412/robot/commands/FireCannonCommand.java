package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class FireCannonCommand extends SequentialCommandGroup {

	public FireCannonCommand() {
		addCommands(new WaitForArduinoCommand(), new ShootCannonCommand());
	}
}
