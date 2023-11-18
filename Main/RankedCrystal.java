package de.cooltechno.rankedcrystal;

import de.cooltechno.rankedcrystal.Game.onDeath;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RankedCrystal extends JavaPlugin {

    public static RankedCrystal plugin;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getPluginManager().registerEvents(new onDeath(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public static RankedCrystal getPlugin() {
        return plugin;
    }

}
