package com.facebook.rtc.views.omnigrid;

import X.AbstractC12190kN;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class GridSelfViewLocation {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ GridSelfViewLocation[] $VALUES;
    public final int value;
    public static final GridSelfViewLocation NONE = new GridSelfViewLocation(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
    public static final GridSelfViewLocation TOP_LEFT = new GridSelfViewLocation("TOP_LEFT", 1, 1);
    public static final GridSelfViewLocation TOP_RIGHT = new GridSelfViewLocation("TOP_RIGHT", 2, 2);
    public static final GridSelfViewLocation BOTTOM_RIGHT = new GridSelfViewLocation("BOTTOM_RIGHT", 3, 3);

    public static final /* synthetic */ GridSelfViewLocation[] $values() {
        return new GridSelfViewLocation[]{NONE, TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        GridSelfViewLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static GridSelfViewLocation valueOf(String str) {
        return (GridSelfViewLocation) Enum.valueOf(GridSelfViewLocation.class, str);
    }

    public static GridSelfViewLocation[] values() {
        return (GridSelfViewLocation[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public GridSelfViewLocation(String str, int i, int i2) {
        this.value = i2;
    }
}
