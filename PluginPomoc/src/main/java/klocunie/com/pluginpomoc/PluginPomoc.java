package klocunie.com.pluginpomoc;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginPomoc extends JavaPlugin {

    @Override
    public void onEnable() {
    getCommand("pomoc").setExecutor(new PomocCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
