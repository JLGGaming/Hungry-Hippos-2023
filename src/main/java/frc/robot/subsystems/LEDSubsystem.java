// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.LEDConstants;

public class LEDSubsystem extends SubsystemBase {

  // Initalize LED strip and LED buffer
  private final AddressableLED ledStrip = new AddressableLED(LEDConstants.kLEDPWMPort);
  private final AddressableLEDBuffer ledBuffer = new AddressableLEDBuffer(LEDConstants.kLEDLength);

  /** Creates a new LEDSubsystem. */
  public LEDSubsystem() {
    // Set the length of the LED strip
    led.setLength(ledBuffer.getLength());
    led.setData(ledBuffer);
    led.start();
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
