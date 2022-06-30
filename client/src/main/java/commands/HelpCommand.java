package commands;

import common.commands.CommandImpl;
import common.commands.CommandManager;
import common.commands.CommandType;

public class HelpCommand extends CommandImpl {
    public HelpCommand() {
        super("help", CommandType.NORMAL);
    }

    @Override
    public String execute() {
        /*Platform.runLater(()->{
            Text text = new Text(CommandManager.getHelp());
            TextFlow textFlow = new TextFlow(text);
            Stage stage = new Stage();
            Scene scene = new Scene(textFlow);
            stage.setScene(scene);
            stage.setTitle("s");
            stage.showAndWait();
        });*/
        return CommandManager.getHelp();
    }
}
