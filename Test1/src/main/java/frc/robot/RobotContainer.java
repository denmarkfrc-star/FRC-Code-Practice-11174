package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

class RobotContainer{

    CommandXboxController joystick = new CommandXboxController(0);

    public RobotContainer()
    {
        configureBindings();
        
    }

    private void configureBindings()
    {
        
    }

}