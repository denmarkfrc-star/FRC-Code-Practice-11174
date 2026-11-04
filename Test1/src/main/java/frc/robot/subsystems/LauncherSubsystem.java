package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

class LauncherSubsystem extends SubsystemBase {

    //Creating motor controllers
    private TalonFX LauncherMain = new TalonFX(53);
    private TalonFX LauncherFeed = new TalonFX(54);

    public LauncherSubsystem() {
        //Initialize PID params
    }

    public void setSpeedLauncher(double speed)
    {
        LauncherMain.set(speed);
        LauncherFeed.set(speed);
    }

}