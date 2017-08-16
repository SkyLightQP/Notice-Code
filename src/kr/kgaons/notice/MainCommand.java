package kr.kgaons.notice;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length > 0) {
                Bukkit.broadcastMessage("§6[" + p.getName() + "] §f" + args[0]);
            }
            else p.sendMessage("§c[NOTICE] 사용법: /확성기 <메세지>");
        }
        else { // 콘솔이 입력할 때의 동작
            if(args.length > 0) {
                Bukkit.broadcastMessage("§6[CONSOLE] §f" + args[0]);
            }
            else Bukkit.getConsoleSender().sendMessage("§c[NOTICE] 사용법: /확성기 <메세지>");
        }
        return false;
    }
}