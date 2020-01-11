package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.commands.UserDriveCommand;

public class DriveTrainSubsystem implements Subsystem {

// Any variables/fields used in the constructor must appear before the "INSTANCE" variable
// so that they are initialized before the constructor is called.

    private final Spark leftSpark1;
    private final Spark leftSpark2;
    private final Spark rightSpark1;
    private final Spark rightSpark2;

    public DriveTrainSubsystem() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
//        rightSpark1 = new Spark(0);
//        rightSpark2 = new Spark(1);
//        leftSpark1 = new Spark(2);
//        leftSpark2 = new Spark(3);
        rightSpark1 = new Spark(3);
        rightSpark2 = new Spark(4);
        leftSpark1 = new Spark(0);
        leftSpark2 = new Spark(1);
        setDefaultCommand(new UserDriveCommand(this));
        System.out.println("drivetrain created");
    }

    public void drive(double leftSpeed, double rightSpeed) {
        leftSpark1.set(leftSpeed);
        leftSpark2.set(leftSpeed);
        rightSpark1.set(rightSpeed);
        rightSpark2.set(rightSpeed);
    }

}

