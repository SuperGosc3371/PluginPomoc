package klocunie.com.pluginpomoc.utils;

import org.bukkit.ChatColor;

public class Chat {
    public static String colorize (String messege) {
     return ChatColor.translateAlternateColorCodes('&', messege);
    }

}
