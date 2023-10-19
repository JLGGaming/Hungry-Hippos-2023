// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

public class DriveSubsystem extends SubsystemBase {

  // Initalize motor controllers
  public WPI_TalonFX leftMotor = new WPI_TalonFX(MotorConstants.kLeftMotorPort);
  public WPI_TalonFX rightMotor = new WPI_TalonFX(MotorConstants.kRightMotorPort);
  public DifferentialDrive drivetrain = new DifferentialDrive(leftMotor, rightMotor);

  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    configMotors();
  }

  private void configMotors() {
    // Restore motors to factory defaults
    leftMotor.configFactoryDefault();
    rightMotor.configFactoryDefault();

    // Set motors into coast mode
    leftMotor.setNeutralMode(NeutralMode.Coast);
    rightMotor.setNeutralMode(NeutralMode.Coast);;

    // leftMotor.setOpenLoopRampRate(MotorConstants.kMotorLoopRate);
    // rightMotor.setOpenLoopRampRate(MotorConstants.kMotorLoopRate);

    // leftMotor.setSmartCurrentLimit(MotorConstants.kMotorCurrent);
    // rightMotor.setSmartCurrentLimit(MotorConstants.kMotorCurrent);

    leftMotor.setInverted(true);
    rightMotor.setInverted(false);
  }

  public void arcadeDrive(double xSpeed, double zRotation) {
    SmartDashboard.putNumber("Provided X Speed", xSpeed);
    SmartDashboard.putNumber("Provided Z Rotation", zRotation);
    drivetrain.arcadeDrive(xSpeed, zRotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
