package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CannonSubsystem extends Subsystem {
	/** Talon SR instance for shooting 
	private Talon shootingTalon = RobotMap.shootingTalon;*/
	Relay firingRelay = new Relay(1);
	
	/** Compressor instances for charging pneumatics */
	private Compressor[] shootingCompressors = RobotMap.shootingCompressors;

	@Override
	protected void initDefaultCommand() {
		
	}
	
	/** Method for firing the cannon */
	public void fireCannon() {
		//shootingTalon.set(1.0);
		firingRelay.set(Relay.Value.kForward);
	}
	
	/** Method for resetting the cannon */
	public void resetCannon() {
		//shootingTalon.set(0.0);
		firingRelay.set(Relay.Value.kOff);
	}
	
	/** Method for charging the compressors */
	public void chargeCompressors() {
		for(Compressor shootingCompressor : shootingCompressors) {
			shootingCompressor.start();
		}
	}
}
