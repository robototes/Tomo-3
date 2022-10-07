package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import org.usfirst.frc.team2412.robot.RobotMap;

public class CannonSubsystem extends Subsystem {

	/** Talon SR instance for shooting
	private Talon shootingTalon = RobotMap.shootingTalon;*/
	Relay firingRelay = new Relay(0);
	Talon shootingTalon = RobotMap.shootingTalon;
	/** Compressor instances for charging pneumatics */
	private Compressor[] shootingCompressors = RobotMap.shootingCompressors;

	@Override
	protected void initDefaultCommand() {}

	/** Method for firing the cannon */
	public void fireCannon() {
		shootingTalon.set(1.0);
		firingRelay.set(Relay.Value.kReverse);
		System.out.println(firingRelay.get());
	}

	/** Method for resetting the cannon */
	public void resetCannon() {
		shootingTalon.set(0.0);
		firingRelay.set(Relay.Value.kOff);
		System.out.println(firingRelay.get());
	}

	/** Method for charging the compressors */
	public void chargeCompressors() {
		for (Compressor shootingCompressor : shootingCompressors) {
			shootingCompressor.enableDigital();
		}
	}
}
