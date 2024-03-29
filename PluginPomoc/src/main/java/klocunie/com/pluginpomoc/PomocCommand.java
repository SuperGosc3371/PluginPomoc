package klocunie.com.pluginpomoc;

import klocunie.com.pluginpomoc.utils.Chat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PomocCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player p = ((Player) sender).getPlayer();
            p.sendMessage(Chat.colorize("  &x&1&E&8&D&B&6&lP&x&3&3&9&7&B&B&lo&x&4&7&A&0&C&1&lm&x&5&C&A&A&C&6&lo&x&7&0&B&3&C&C&lc &x&8&5&B&D&D&1&lG&x&9&A&C&6&D&6&lr&x&A&E&D&0&D&C&la&x&C&3&D&9&E&1&lc&x&D&7&E&3&E&7&lz&x&E&C&E&C&E&C&la  "));
            p.sendMessage(Chat.colorize("&x&7&3&A&D&C&2/&x&7&8&B&0&C&4d&x&7&D&B&2&C&6r&x&8&2&B&5&C&7o&x&8&7&B&8&C&9p &x&8&C&B&A&C&B- &x&9&1&B&D&C&Dd&x&9&6&B&F&C&Er&x&9&B&C&2&D&0o&x&A&0&C&5&D&2p &x&A&5&C&7&D&4r&x&A&A&C&A&D&5z&x&B&0&C&D&D&7e&x&B&5&C&F&D&9c&x&B&A&D&2&D&Bz&x&B&F&D&4&D&Cy &x&C&4&D&7&D&Ez &x&C&9&D&A&E&0k&x&C&E&D&C&E&2a&x&D&3&D&F&E&3m&x&D&8&E&2&E&5i&x&D&D&E&4&E&7e&x&E&2&E&7&E&9n&x&E&7&E&9&E&Ai&x&E&C&E&C&E&Ca"));
            p.sendMessage(Chat.colorize("&x&7&3&A&D&C&2/&x&7&7&A&F&C&3s&x&7&A&B&1&C&5p&x&7&E&B&3&C&6a&x&8&2&B&5&C&7w&x&8&5&B&7&C&8n &x&8&9&B&8&C&A- &x&8&D&B&A&C&BK&x&9&0&B&C&C&Co&x&9&4&B&E&C&Dm&x&9&8&C&0&C&Fe&x&9&B&C&2&D&0n&x&9&F&C&4&D&1d&x&A&3&C&6&D&3a &x&A&6&C&8&D&4t&x&A&A&C&A&D&5e&x&A&E&C&C&D&6l&x&B&1&C&D&D&8e&x&B&5&C&F&D&9p&x&B&9&D&1&D&Ao&x&B&C&D&3&D&Br&x&C&0&D&5&D&Dt&x&C&4&D&7&D&Eu&x&C&7&D&9&D&Fj&x&C&B&D&B&E&1ą&x&C&F&D&D&E&2c&x&D&2&D&F&E&3a &x&D&6&E&1&E&4n&x&D&A&E&2&E&6a &x&D&D&E&4&E&7s&x&E&1&E&6&E&8p&x&E&5&E&8&E&9a&x&E&8&E&A&E&Bw&x&E&C&E&C&E&Cn"));
            p.sendMessage(Chat.colorize("&x&7&3&A&D&C&2/&x&7&A&B&1&C&4r&x&8&0&B&4&C&7t&x&8&7&B&8&C&9p &x&8&E&B&B&C&B- &x&9&5&B&F&C&El&x&9&B&C&2&D&0o&x&A&2&C&6&D&2s&x&A&9&C&9&D&5o&x&B&0&C&D&D&7w&x&B&6&D&0&D&9y &x&B&D&D&4&D&Ct&x&C&4&D&7&D&Ee&x&C&A&D&B&E&0l&x&D&1&D&E&E&3e&x&D&8&E&2&E&5p&x&D&F&E&5&E&7o&x&E&5&E&9&E&Ar&x&E&C&E&C&E&Ct"));
        } else {
            System.out.println("Komende może używać tylko gracz");
        }
        return false;

    }
}
