package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.MoveCannonThrottleCommand;

public class MoveCannonSubsystem extends SubsystemBase {

	/** Victor SP instance for moving the cannon up and down */
	private VictorSP moveCannonVictor = RobotMap.movingCannonVictor;

	public MoveCannonSubsystem() {
		setDefaultCommand(new MoveCannonThrottleCommand(this, 0));
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
		moveCannonVictor.set(0.0);
	}
}
