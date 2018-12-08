package org.usfirst.frc.team1339.robot.subsystems;

import org.usfirst.frc.team1339.robot.RobotMap;
import org.usfirst.frc.team1339.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	public TalonSRX leftTop;
	TalonSRX leftFront;
	TalonSRX leftBack;
	public TalonSRX rightTop;
	TalonSRX rightFront;
	TalonSRX rightBack;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Chassis() {
		leftTop = new TalonSRX(RobotMap.leftTopDriveMotor);
		leftFront = new TalonSRX(RobotMap.leftFrontDriveMotor);
		leftBack = new TalonSRX(RobotMap.leftBackDriveMotor);
		rightTop = new TalonSRX(RobotMap.rightTopDriveMotor);
		rightFront = new TalonSRX(RobotMap.rightFrontDriveMotor);
		rightBack = new TalonSRX(RobotMap.rightBackDriveMotor);
		
		leftFront.follow(leftTop);
		leftBack.follow(leftTop);
		rightBack.follow(rightTop);
		rightFront.follow(rightTop);
		
		leftTop.setInverted(true);
		leftFront.setInverted(true);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }

	public void setMotorValues(double left, double right) {
		// TODO Auto-generated method stub
		leftTop.set(ControlMode.PercentOutput, -left);
		rightTop.set(ControlMode.PercentOutput, -right);
		
		
	}
}

