package com.instagram.debug.trainyardtracker;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class TrainyardEventType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ TrainyardEventType[] $VALUES;
    public static final TrainyardEventType QUEUE = new TrainyardEventType("QUEUE", 0);
    public static final TrainyardEventType EXECUTE = new TrainyardEventType("EXECUTE", 1);
    public static final TrainyardEventType FINISH = new TrainyardEventType("FINISH", 2);
    public static final TrainyardEventType STUCK = new TrainyardEventType("STUCK", 3);
    public static final TrainyardEventType FAIL = new TrainyardEventType("FAIL", 4);

    public static final /* synthetic */ TrainyardEventType[] $values() {
        return new TrainyardEventType[]{QUEUE, EXECUTE, FINISH, STUCK, FAIL};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        TrainyardEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static TrainyardEventType valueOf(String str) {
        return (TrainyardEventType) Enum.valueOf(TrainyardEventType.class, str);
    }

    public static TrainyardEventType[] values() {
        return (TrainyardEventType[]) $VALUES.clone();
    }

    public TrainyardEventType(String str, int i) {
    }
}
