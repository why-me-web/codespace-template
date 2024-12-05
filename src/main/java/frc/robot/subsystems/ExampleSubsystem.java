// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Constants.OperatorConstants;
public class ExampleSubsystem extends SubsystemBase {
CANSparkMax armMotor = new CANSparkMax(OperatorConstants.motorID, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
 
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command upCommand() {
  return startEnd(() ->{
      armMotor.set(OperatorConstants.armSpeed);
    }, 
    ()->{
      armMotor.set(0);
    });
  }
  public Command downCommand() {
  return startEnd(() ->{
      armMotor.set(OperatorConstants.armSpeed * -1);
    }, 
    ()->{
      armMotor.set(0);
    });
  }


  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
