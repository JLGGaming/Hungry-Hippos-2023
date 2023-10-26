// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Watchdog;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.LEDConstants;
import frc.LEDProfiles;

public class LEDSubsystem extends SubsystemBase {

  // Initalize LED strip and LED buffer
  int ledStrip = LEDConstants.kLEDPWMPort;
  int ledBuffer = LEDConstants.kLEDLength;

  LEDProfiles strip1 = new LEDProfiles(ledStrip, ledBuffer);
  public LEDSubsystem() {
  }
  
  @Override
  public void periodic() {
  }

  public void setAll(){
    strip1.setAll(Color.kAzure);
  }
 
  public void halfFront() {
    strip1.halfFront(Color.kRed, Color.kGreen);
  }

  public void halfBack() {
    strip1.halfFront(Color.kGreen, Color.kRed);
  }
}
