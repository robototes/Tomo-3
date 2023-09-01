package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

public class DriveBaseSubsystem extends SubsystemBase {

	/** MecanumDrive instance for driving */
	private MecanumDrive driving = RobotMap.driving;

	/** Gyroscope instance for driving */
	//private Gyro gyro = RobotMap.gyro;

	public DriveBaseSubsystem() {
		setDefaultCommand(new DriveCommand(this));

		RobotMap.drivingTalons[1].setInverted(true);
		RobotMap.drivingTalons[3].setInverted(true);
	}

	/** Method for driving using a joystick and gyroscope if specified*/
	public void driveMecanumGyro(XboxController stick) {
		/*if (useGyro) {
			driving.driveCartesian(
				-stick.getLeftX(),
				-stick.getRightX(),
				-stick.getLeftX(),
				90 + gyro.getAngle()
			);
		} else {*/
		driving.driveCartesian(
			stick.getLeftY(),
			stick.getLeftX(),
			stick.getRightX()
		);
		//}
	}
}
