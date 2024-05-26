package com.badlyac.grenade;

import org.bukkit.plugin.java.JavaPlugin;

public class GrenadeMain extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new tnt(), this);
    }
}
