package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class DriveBaseSubsystem extends Subsystem {
	/** MecanumDrive instance for driving */
	private MecanumDrive driving = RobotMap.driving;
	
	/** Gyroscope instance for driving */
	private Gyro gyro = RobotMap.gyro;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}
	
	/** Method for driving using a joystick and gyroscope if specified*/
	public void driveMecanumGyro(XboxController stick, boolean useGyro) {
		if(useGyro) {
			driving.driveCartesian(-stick.getX(Hand.kLeft), -stick.getX(Hand.kRight), -stick.getX(Hand.kLeft), 90+gyro.getAngle());
		} else {
			driving.driveCartesian(-stick.getX(Hand.kLeft), stick.getY(Hand.kLeft), -stick.getX(Hand.kRight));
		}
	}
}
