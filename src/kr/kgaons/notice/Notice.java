package kr.kgaons.notice;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Notice extends JavaPlugin{
    public void onEnable(){
        getCommand("확성기").setExecutor(new MainCommand());
        Bukkit.getLogger().info("[Notice] Plugin Enable");
    }
    public void onDisable(){
        Bukkit.getLogger().info("[Notice] Plugin Disable");
    }
}
