package jelly9912.fakedead;

import cn.nukkit.event.TranslationContainer;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.utils.TextFormat;

import java.util.Objects;

public class FakeDeadPlugin extends PluginBase implements Listener {

    @Override
    public void onEnable(){
        this.getLogger().info(TextFormat.GREEN + "FakeDead has been enabled");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(Objects.equals(command.getName(), "fd")){
            if(args.length == 0 || args.length >= 2){
                sender.sendMessage(new TranslationContainer("commands.generic.usage", command.getUsage()));
                return true;
            }else{
                if(!sender.hasPermission("fakedead.command")){
                    sender.sendMessage(new TranslationContainer(TextFormat.RED + "%commands.generic.permission"));
                }
                String msg = "";
                switch((int)(Math.random()*12d + 1d)){
                    case 1:
                        msg = args[0] + " died";
                        break;
                    case 2:
                        msg = args[0] + " drowned";
                        break;
                    case 3:
                        msg = args[0] + " fell out of the world";
                        break;
                    case 4:
                        msg = args[0] + " fell from a high place";
                        break;
                    case 5:
                        msg = args[0] + " was died by void";
                        break;
                    case 6:
                        msg = args[0] + " suffocated in a wall";
                        break;
                    case 7:
                        msg = args[0] + " tried to swim in lava";
                        break;
                    case 8:
                        msg = args[0] + " went up in flames";
                        break;
                    case 9:
                        msg = args[0] + " burned to death";
                        break;
                    case 10:
                        msg = args[0] + " was pricked to death";
                        break;
                    case 11:
                        msg = args[0] + " blew up";
                        break;
                    case 12:
                        msg = args[0] + " was killed by magic";
                        break;
                    case 13:
                        msg = args[0] + " hit the ground too hard";
                        break;
                    default:break;
                }
                getServer().broadcastMessage(msg);
            }
            return true;
        }
        return false;
    }

}
