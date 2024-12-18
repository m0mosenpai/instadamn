package com.instagram.debug.devoptions.vtd.core;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class VtdLifecycleEvent {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ VtdLifecycleEvent[] $VALUES;
    public static final VtdLifecycleEvent LAYOUT = new VtdLifecycleEvent("LAYOUT", 0);
    public static final VtdLifecycleEvent ATTACH = new VtdLifecycleEvent("ATTACH", 1);
    public static final VtdLifecycleEvent DETACH = new VtdLifecycleEvent("DETACH", 2);

    public static final /* synthetic */ VtdLifecycleEvent[] $values() {
        return new VtdLifecycleEvent[]{LAYOUT, ATTACH, DETACH};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        VtdLifecycleEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static VtdLifecycleEvent valueOf(String str) {
        return (VtdLifecycleEvent) Enum.valueOf(VtdLifecycleEvent.class, str);
    }

    public static VtdLifecycleEvent[] values() {
        return (VtdLifecycleEvent[]) $VALUES.clone();
    }

    public VtdLifecycleEvent(String str, int i) {
    }
}
