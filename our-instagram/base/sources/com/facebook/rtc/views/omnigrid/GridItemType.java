package com.facebook.rtc.views.omnigrid;

import X.AbstractC12190kN;
import X.C53744Npw;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class GridItemType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ GridItemType[] $VALUES;
    public static final C53744Npw Companion;
    public static final GridItemType[] VALUES;
    public final int value;
    public static final GridItemType SELF_VIEW = new GridItemType("SELF_VIEW", 0, 0);
    public static final GridItemType PEER_VIEW = new GridItemType("PEER_VIEW", 1, 1);
    public static final GridItemType OTHER = new GridItemType("OTHER", 2, 2);

    public static final /* synthetic */ GridItemType[] $values() {
        return new GridItemType[]{SELF_VIEW, PEER_VIEW, OTHER};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.Npw, java.lang.Object] */
    static {
        GridItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
        Companion = new Object();
        VALUES = values();
    }

    public static GridItemType valueOf(String str) {
        return (GridItemType) Enum.valueOf(GridItemType.class, str);
    }

    public static GridItemType[] values() {
        return (GridItemType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public GridItemType(String str, int i, int i2) {
        this.value = i2;
    }
}
