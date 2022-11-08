package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

public class DriveBaseSubsystem extends SubsystemBase {

	/** MecanumDrive instance for driving */
	private MecanumDrive driving = RobotMap.driving;

	/** Gyroscope instance for driving */
	private Gyro gyro = RobotMap.gyro;

	public DriveBaseSubsystem() {
		setDefaultCommand(new DriveCommand());
	}

	/** Method for driving using a joystick and gyroscope if specified*/
	public void driveMecanumGyro(XboxController stick, boolean useGyro) {
		if (useGyro) {
			driving.driveCartesian(
				-stick.getLeftX(),
				-stick.getRightX(),
				-stick.getLeftX(),
				// 90 + gyro.getAngle()
			);
		} else {
			driving.driveCartesian(
				stick.getLeftX(),
				-stick.getLeftY(),
				stick.getRightX()
			);
		}
	}
}
