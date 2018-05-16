package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CannonSubsystem extends Subsystem {
	/** Talon SR instance for shooting */
	private Talon shootingTalon = RobotMap.shootingTalon;
	
	/** Compressor instances for charging pneumatics */
//	private Compressor[] shootingCompressors = RobotMap.shootingCompressors;

	@Override
	protected void initDefaultCommand() {
		
	}
	
	/** Method for firing the cannon */
	public void fireCannon() {
		shootingTalon.set(1.0);
	}
	
	/** Method for resetting the cannon */
	public void resetCannon() {
		shootingTalon.set(0.0);
	}
	
	/** Method for charging the compressors */
	public void chargeCompressors() {
//		for(Compressor shootingCompressor : shootingCompressors) {
//			shootingCompressor.start();
//		}
	}
}
