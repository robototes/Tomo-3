/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import org.usfirst.frc.team2412.robot.commands.CommandBase;
import org.usfirst.frc.team2412.robot.commands.FireCannonCommand;
import org.usfirst.frc.team2412.robot.commands.MoveCannonDownCommand;
import org.usfirst.frc.team2412.robot.commands.MoveCannonThrottleCommand;
import org.usfirst.frc.team2412.robot.commands.MoveCannonUpCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	/** Joystick for driving and shooting */
	public XboxController controller = new XboxController(0);

	/** The joystick's trigger */
	public Button trigger = new JoystickButton(controller, 6);

	public OI() {
		trigger.whenPressed(new FireCannonCommand());

		moveUp.whileHeld(new MoveCannonUpCommand());
		moveDown.whileHeld(new MoveCannonDownCommand());
		moveUp.whenReleased(
			new MoveCannonThrottleCommand(CommandBase.moveCannon, .25)
		);
	}

	/** Button for moving the cannon up */
	public Button moveUp = new JoystickButton(controller, 4);

	/** Button for moving the cannon down */
	public Button moveDown = new JoystickButton(controller, 1);

	/** Arduino */
	public static SerialPort arduino = new SerialPort(9600, Port.kUSB);
}
