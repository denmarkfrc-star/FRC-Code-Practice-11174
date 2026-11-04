# FRC-Code-Practice-11174

# Main

 - 

# Robot

# RobotContainer

 - General format for a control in configure bindings: joystick.button().boolType(Commands.sequence(
    Commands.runOnce(() -> {
        subsystem1.setProperty1(x);
        subsystem1.setProperty2(y);
    }),
    Commands.runOnce(() -> subsystem2.runPower())
 ));

Should start with controller name

Should then select button

Then choose between whileTrue and onTrue (on press vs while pressed)

Finally create a list of commmands with sequence or simply run a command once with runOnce then use an arrow function to define the code that should be running (generally methods of subsystems)


# Subsystem format


