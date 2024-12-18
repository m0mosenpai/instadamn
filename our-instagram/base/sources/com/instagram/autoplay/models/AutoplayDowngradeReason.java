package com.instagram.autoplay.models;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AutoplayDowngradeReason {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AutoplayDowngradeReason[] $VALUES;
    public static final AutoplayDowngradeReason NETWORK_TOO_MUCH_BUFFERING = new AutoplayDowngradeReason("NETWORK_TOO_MUCH_BUFFERING", 0);
    public static final AutoplayDowngradeReason MEMORY_CONSTRAINED = new AutoplayDowngradeReason("MEMORY_CONSTRAINED", 1);

    public static final /* synthetic */ AutoplayDowngradeReason[] $values() {
        return new AutoplayDowngradeReason[]{NETWORK_TOO_MUCH_BUFFERING, MEMORY_CONSTRAINED};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AutoplayDowngradeReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AutoplayDowngradeReason valueOf(String str) {
        return (AutoplayDowngradeReason) Enum.valueOf(AutoplayDowngradeReason.class, str);
    }

    public static AutoplayDowngradeReason[] values() {
        return (AutoplayDowngradeReason[]) $VALUES.clone();
    }

    public AutoplayDowngradeReason(String str, int i) {
    }
}
