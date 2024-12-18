package com.instagram.debug.trainyardtracker;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class TrainyardEventTag {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TrainyardEventTag[] $VALUES;
    public static final TrainyardEventTag DEFAULT = new TrainyardEventTag("DEFAULT", 0);
    public static final TrainyardEventTag NETWORK = new TrainyardEventTag("NETWORK", 1);

    public static final /* synthetic */ TrainyardEventTag[] $values() {
        return new TrainyardEventTag[]{DEFAULT, NETWORK};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        TrainyardEventTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static TrainyardEventTag valueOf(String str) {
        return (TrainyardEventTag) Enum.valueOf(TrainyardEventTag.class, str);
    }

    public static TrainyardEventTag[] values() {
        return (TrainyardEventTag[]) $VALUES.clone();
    }

    public TrainyardEventTag(String str, int i) {
    }
}
