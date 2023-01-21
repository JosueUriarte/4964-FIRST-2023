// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class tankSub extends SubsystemBase {
  /** Creates a new tankSub. */
  //make sure you install the CTRE phoenix library otherwise you can't use the import for these speed controllers
  //declares the speed controllers
  public static VictorSP FLDrive, BLDrive, FRDrive, BRDrive;

  public tankSub() {
    //initializes the speed controllers and ties them to the ports you want in constants
    FRDrive = new VictorSP(Constants.FRMotor);
    BRDrive = new VictorSP(Constants.BRMotor);
    FLDrive = new VictorSP(Constants.FLMotor);
    BLDrive = new VictorSP(Constants.BLMotor);
    
    
  }

  //creates a method(function for those not familiar to java) that is used to set the power of the motors
  public void setRaw(double Right, double Left){

    FRDrive.set(Right);
    BRDrive.set(Right);
    FLDrive.set(Left);
    BLDrive.set(Left);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
