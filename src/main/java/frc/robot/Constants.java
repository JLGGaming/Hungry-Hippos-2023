// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  // Constants for LED strip
  public static class LEDConstants {
    // Specify LED PWM port
    public static final int kLEDPWMPort = 0;
    // Specify LED length
    public static final int kLEDLength = 64;
  }
  // Constants for motor (controllers)
  public static class MotorConstants {
    // Specify motor ports
    public static final int kRightMotorPort = 2;
    public static final int kLeftMotorPort = 1;

    /* Specify our drivetrain motor "SmartCurrentLimit" and LoopRate (how long it takes motors to reach full power)
    public static final int kDrivetrainMotorCurrent = 55;
    public static final double kDrivetrainMotorLoopRate = 0.5; */
  }
  
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
