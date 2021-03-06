package org.usfirst.frc.team1339.robot.commands;

import org.usfirst.frc.team1339.robot.OI;
import org.usfirst.frc.team1339.robot.subsystems.Chassis;


import edu.wpi.first.wpilibj.command.Command;


/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static Chassis chassis;
   
    public static OI oi;
    
    public static Drive drive;
    
    public static void init() {
    	
    	chassis = new Chassis();

        oi = new OI();
        
        drive = new Drive();
        
        
        
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}