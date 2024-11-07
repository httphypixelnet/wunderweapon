package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
    
    private DifferentialDrive drive = new DifferentialDrive();
    
    public DriveSubsystem() {
    }
    public void tankDrive(XboxController x) {
        
    }
    
    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}