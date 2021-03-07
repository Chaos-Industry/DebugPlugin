package com.github.crewl.testworld;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.*;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class playerEvent implements Listener {
    @EventHandler
    public void onPlayerClick(PlayerInteractEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Player player = event.getPlayer();
        if(event.getClickedBlock()!=null){
            Bukkit.getLogger().info(event.getClickedBlock().toString());
            Bukkit.getLogger().info(event.getClickedBlock().getType().toString());
            if(event.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")){
                if(player.getInventory().getItemInMainHand().getType().toString().equalsIgnoreCase("BLAZE_ROD")){
                    player.sendMessage(event.getClickedBlock().getLocation().toString());
                }
            }
            Bukkit.getLogger().info(event.getAction().toString());
        }else{
            Bukkit.getLogger().info(event.getAction().toString());
            Bukkit.getLogger().info("null");
        }
    }

    @EventHandler
    public void onPlayer1(EntityShootBowEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.getEntity().getName());
    }

    @EventHandler
    public void onPlayer2(ProjectileLaunchEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        if(event.getEntity().getName().equalsIgnoreCase("Trident")){
            Bukkit.getLogger().info(event.getEntity().getName());
        }
    }

    @EventHandler
    public void onPlayer3(PlayerItemDamageEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.getItem().toString());
    }

    @EventHandler
    public void onPlayer4(PlayerMoveEvent event){
        //Bukkit.getLogger().info("●"+event.getEventName());
        //Bukkit.getLogger().info(event.getPlayer().toString());
    }

    @EventHandler
    public void onPlayer5(PlayerInteractEntityEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.toString());
    }

    @EventHandler
    public void onPlayer6(PlayerChangedMainHandEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.getPlayer().getMainHand().toString());
    }

    @EventHandler
    public void onPlayer7(AsyncPlayerChatEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.getPlayer().toString() +" : "+ event.getMessage());
    }

    @EventHandler
    public void onPlayer8(EntityInteractEvent event){
        //Bukkit.getLogger().info("●"+event.getEventName());
        //Bukkit.getLogger().info(event.getBlock().toString());
    }

    @EventHandler
    public void onPlayer9(ItemDespawnEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        Bukkit.getLogger().info(event.getEntity().toString()+" : "+event.getLocation().toString());
    }

    @EventHandler
    public void onPlayer10(BlockIgniteEvent event) {
        Bukkit.getLogger().info("●" + event.getEventName());
        if (event.getPlayer() != null) {
            Bukkit.getLogger().info(event.getPlayer().toString() + " ignited : "+event.getPlayer().getLocation().toString());
            event.getPlayer().addPotionEffect(new PotionEffect(
                    PotionEffectType.GLOWING,500,100));
        } else {
            Bukkit.getLogger().info("spreading fire");
        }
    }

    @EventHandler
    public void onPlayer11(EntityDeathEvent event){
        if(event.getEntity().getKiller()!=null){
            Bukkit.getLogger().info("●"+event.getEventName());
            Bukkit.getLogger().info(event.getEntity().getKiller().getName()+" killed "+event.getEntity().toString());
        }
    }

    @EventHandler
    public void onPlayer12(EntityDamageByEntityEvent event){
        Bukkit.getLogger().info("●"+event.getEventName());
        if(event.getEntityType() == EntityType.PLAYER){
            Bukkit.getLogger().info(event.getDamager().getName()+" attacked "+event.getEntity().toString());
        }
    }
}
