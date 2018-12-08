package org.usfirst.frc.team1339.robot.commands;

import org.usfirst.frc.team1339.robot.OI;

import org.usfirst.frc.team1339.robot.RobotMap;
import org.usfirst.frc.team1339.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends CommandBase {
	

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        requires(chassis);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double throttle = oi.controller.getRawAxis(RobotMap.leftYAxis);
    	double turn = oi.controller.getRawAxis(RobotMap.leftXAxis);
    	double left = throttle + turn;
    	double right = throttle - turn;
    	chassis.setMotorValues(left*left*left, right*right*right); 
    	System.out.println("YAY!");
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
