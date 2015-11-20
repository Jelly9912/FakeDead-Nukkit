package Jelly9912.FakeDead;

import nc.nukkit.Server;
import nc.nukkit.plugin.PluginBase;
import nc.nukkit.command.Command;
import nc.nukkit.command.CommandSender;
import nc.nukkit.event.Listener;
import nc.nukkit.utils.TextFormat;
import nc.nukkit.utils.Random;


public class Main extends PluginBase implements Listener {

public void onEnable(){
 this.getLogger().info(TextFormat.GREEN + "FakeDead has been enabled");
 this.getServer().getPluginManager().registerEvents(this, this);
 }
 
public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
 switch (command.getName()) {
   case "fd":
   	if(!(isset(args[0]))){
		  sender.sendMessage(TextFormat.GOLD + "[FakeDead] " + TextFormat.YELLOW + "Use /fd <player>");
		   return true;
	 		}elseif(isset(args[0])){
	  		if(sender.hasPermission("fakedead.command")){
	   		switch(mt_rand(1, 13)){
       case 1:
         this.getServer().getInstance().broadcastMessage(args[0] + " died");
         break;
     case 2:
         this.getServer().getInstance().broadcastMessage(args[0] + " drowned");
         break;
     case 3:
         this.getServer().getInstance().broadcastMessage(args[0] + " fell out of the world");
         break;
     case 4:
         this.getServer().getInstance().broadcastMessage(args[0] + " fell from a high place");
         break;
     case 5:
         this.getServer().getInstance().broadcastMessage(args[0] + " was died by void");
         break;
     case 6:
         this.getServer().getInstance().broadcastMessage(args[0] + " suffocated in a wall");
         break;
     case 7:
         this.getServer().getInstance().broadcastMessage(args[0] + " tried to swim in lava");
         break;
     case 8:
         this.getServer().getInstance().broadcastMessage(args[0] + " went up in flames");
         break;
     case 9:
         this.getServer().getInstance().broadcastMessage(args[0] + " burned to death");
         break;
     case 10:
         this.getServer().getInstance().broadcastMessage(args[0] + " was pricked to death");
         break;
     case 11:
         this.getServer().getInstance().broadcastMessage(args[0] + " blew up");
         break;
     case 12:
         this.getServer().getInstance().broadcastMessage(args[0] + " was killed by magic");
         break;
     case 13:
         this.getServer().getInstance().broadcastMessage(args[0] + " hit the ground too hard");
         break;
       }
					}else{
					sender.sendMessage(TextFormat.RED + "You do not have permission to import this command");
     }
				}
				break;
			}
			return true;
		}
	}
