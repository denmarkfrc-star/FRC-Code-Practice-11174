package frc.robot;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

class RobotContainer{

    LauncherSubsystem launcher = new LauncherSubsystem();

    CommandXboxController joystick = new CommandXboxController(0);

    public RobotContainer()
    {
        configureBindings();
        
    }

    private void configureBindings()
    {
        joystick.a().whileTrue(Commands.runOnce(() -> launcher.setSpeedLauncher(0.6))).onFalse(Commands.runOnce(() -> launcher.setSpeedLauncher(0)));
    }

}