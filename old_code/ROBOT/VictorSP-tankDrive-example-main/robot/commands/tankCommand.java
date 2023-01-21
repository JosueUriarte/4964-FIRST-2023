// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class tankCommand extends CommandBase {
  /** Creates a new tankCommand. */
  public tankCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
  //adds the required subsystem so that you can use the stuff defined in it
    addRequirements(RobotContainer.mTankSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    //gets the values from the analog sticks on your joystick
    double Left_Side = RobotContainer.driver.getRawAxis(1);
    double Right_Side = RobotContainer.driver.getRawAxis(3);


    //uses the method that sets the power of the motors
    //Right_Side is the value gathered from right analog stick, this controls right motors
    //Left_Side is the value gathered from left analog stick, this controls left motors
    RobotContainer.mTankSub.setRaw(Right_Side, Left_Side);


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
