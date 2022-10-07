package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.MoveCannonThrottleCommand;

public class MoveCannonSubsystem extends Subsystem {

	/** Victor SP instance for moving the cannon up and down */
	private VictorSP moveCannonVictor = RobotMap.movingCannonVictor;

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new MoveCannonThrottleCommand(0));
	}

	/** Method for moving the cannon based on speed */
	public void moveCannonSpeed(double speed) {
		if (speed < -1.0) {
			speed = -1.0;
		} else if (speed > 1.0) {
			speed = 1.0;
		}

		moveCannonVictor.set(speed);
	}

	/** Method for moving the cannon up */
	public void moveCannonUp() {
		moveCannonVictor.set(0.5);
	}

	/** Method for moving the cannon down */
	public void moveCannonDown() {
		moveCannonVictor.set(-0.2);
	}

	/** Method for not moving the cannon */
	public void stopCannon() {
		moveCannonVictor.set(0.5);
	}
}
