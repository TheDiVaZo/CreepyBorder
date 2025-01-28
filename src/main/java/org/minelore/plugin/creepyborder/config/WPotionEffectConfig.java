package org.minelore.plugin.creepyborder.config;

import org.minelore.plugin.creepyborder.util.PotionEffectData;

import java.util.Set;

/**
 * @author TheDiVaZo
 * created on 28.01.2025
 */
public interface WPotionEffectConfig extends WrapperConfig {
    Set<PotionEffectData> getEffectDatas();
}
