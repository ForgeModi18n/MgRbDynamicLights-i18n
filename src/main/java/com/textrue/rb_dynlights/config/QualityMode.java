package com.textrue.rb_dynlights.config;

import me.jellysquid.mods.sodium.client.gui.options.TextProvider;
import net.minecraft.client.resources.I18n;


public enum QualityMode implements TextProvider
{
    OFF("Off"),
    SLOW("Slow"),
    FAST("Fast"),
    REALTIME("Realtime");

    private final String name;

    private QualityMode(String name) {
        this.name = name;
    }

    public String getLocalizedName() {
        return this.name;
    }
}