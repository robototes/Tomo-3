/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	/** Talon SR IDs for driving */
	public static int[] drivingTalonsIDs = new int[] {
		//    FRONT   //
		//------------//
		0, /*       */1,
		//------------//
		//------------//
		2, /*       */3
		//------------//
		//    BACK    //
		// [value][description]
		// 0 front-left
		// 1 front-right
		// 2 back-left
		// 3 back-right
	};
	
	/** Talon SR instances for driving */
	public static Talon[] drivingTalons = new Talon[] {
		new Talon(drivingTalonsIDs[0]),
		new Talon(drivingTalonsIDs[1]),
		new Talon(drivingTalonsIDs[2]),
		new Talon(drivingTalonsIDs[3])
	};
	
	/** MecanumDrive instance for driving */
	public static MecanumDrive driving = new MecanumDrive(drivingTalons[0], drivingTalons[2], drivingTalons[1], drivingTalons[3]);
	
	/** Gyroscope instance for driving */
	public static Gyro gyro = new ADXRS450_Gyro();
	
	/** Talon SR ID for shooting */
	public static int shootingTalonID = 4;
	
	/** Talon SR instance for shooting */
	public static Talon shootingTalon = new Talon(shootingTalonID);
	
	/** Compressor IDs for shooting */
	public static int[] shootingCompressorIDs = new int[] {
		0, 1
	};
	
	/** Compressor instances for shooting */
//	public static Compressor[] shootingCompressors = new Compressor[] {
//		new Compressor(shootingCompressorIDs[0]),
//		new Compressor(shootingCompressorIDs[1])
//	};
}
