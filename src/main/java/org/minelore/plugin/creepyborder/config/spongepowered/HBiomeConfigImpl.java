package org.minelore.plugin.creepyborder.config.spongepowered;

import org.bukkit.Color;
import org.minelore.plugin.creepyborder.handler.BiomeHandler;
import org.minelore.plugin.creepyborder.config.HBiomeConfig;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

/**
 * @author TheDiVaZo
 * created on 28.01.2025
 */
@ConfigSerializable
public class HBiomeConfigImpl extends WrappedConfigImpl implements HBiomeConfig {
    private Color waterColor = Color.RED;
    private Color skyColor = Color.fromBGR(0x4b0082);
    private Color fogColor = Color.fromBGR(0x8b0000);
    private Color waterFogColor = Color.fromBGR(0x8b0000);

    public HBiomeConfigImpl() {
        super(BiomeHandler.NAME);
    }

    public HBiomeConfigImpl(double distToBorder) {
        this();
        this.distToBorder = distToBorder;
    }

    @Override
    public Color getWaterColor() {
        return waterColor;
    }

    @Override
    public Color getSkyColor() {
        return skyColor;
    }

    @Override
    public Color getFogColor() {
        return fogColor;
    }

    @Override
    public Color getWaterFogColor() {
        return waterFogColor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WBiomeConfigImpl{");
        sb.append("waterColor=").append(waterColor);
        sb.append(", skyColor=").append(skyColor);
        sb.append(", fogColor=").append(fogColor);
        sb.append(", waterFogColor=").append(waterFogColor);
        sb.append(", name='").append(name).append('\'');
        sb.append(", distToBorder=").append(distToBorder);
        sb.append('}');
        return sb.toString();
    }
}
