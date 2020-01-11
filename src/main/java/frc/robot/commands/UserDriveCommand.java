package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrainSubsystem;

import java.util.Set;

public class UserDriveCommand implements Command {
    private final DriveTrainSubsystem driveTrainSubsystem;
    private final Set<Subsystem> subsystems;

    public UserDriveCommand(DriveTrainSubsystem driveTrainSubsystem) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.subsystems = Set.of(driveTrainSubsystem);
        System.out.println("user drive created");
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        driveTrainSubsystem.drive(RobotContainer.leftJoystick.getY(),
                RobotContainer.leftJoystick.getY());
        System.out.println("here");
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public Set<Subsystem> getRequirements() {
        return this.subsystems;
    }
}
