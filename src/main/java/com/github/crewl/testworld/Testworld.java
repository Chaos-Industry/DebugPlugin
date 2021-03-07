package com.github.crewl.testworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class Testworld extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new playerEvent(), this);
        getLogger().info("テスト環境が有効になりました");
    }

    @Override
    public void onDisable() {
        getLogger().info("テスト環境が無効になりました");
    }
}
