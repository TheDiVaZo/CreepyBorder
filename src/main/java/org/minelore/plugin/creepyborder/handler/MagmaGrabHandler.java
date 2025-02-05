package org.minelore.plugin.creepyborder.handler;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;
import org.minelore.plugin.creepyborder.CreepyBorder;

/**
 * @author TheDiVaZo
 * created on 26.01.2025
 */
public class MagmaGrabHandler extends BukkitTaskHandler {
    public static final String NAME = "MagmaGrab";

    private final double vectorLength;

    public MagmaGrabHandler(CreepyBorder plugin, double vectorLength) {
        super(plugin, NAME);
        this.vectorLength = vectorLength;
    }

    @Override
    protected BukkitTask runTask() {
        return Bukkit.getScheduler().runTaskTimer(plugin, () -> {
            for (Player player : activePlayer) {
                if (player.getGameMode().equals(GameMode.CREATIVE) || player.getGameMode().equals(GameMode.SPECTATOR) || !player.isSwimming() && !player.isInWater() && !player.isUnderWater()) return;
                Vector vector = new Vector(0, -vectorLength, 0);
                player.setVelocity(vector);
            }
        }, 0, 5);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MagmaGrabHandler that = (MagmaGrabHandler) o;
        return name.equals(that.name) && Double.compare(vectorLength, that.vectorLength) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(vectorLength);
        return result;
    }
}
