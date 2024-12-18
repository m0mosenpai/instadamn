package com.instagram.autoplay.models;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AutoplayLayout {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AutoplayLayout[] $VALUES;
    public static final AutoplayLayout ALL = new AutoplayLayout("ALL", 0);
    public static final AutoplayLayout TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT1 = new AutoplayLayout("TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT1", 1);
    public static final AutoplayLayout TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT2 = new AutoplayLayout("TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT2", 2);
    public static final AutoplayLayout EXPLORE_DIAGONAL = new AutoplayLayout("EXPLORE_DIAGONAL", 3);
    public static final AutoplayLayout EXPLORE_LOW_DIAGONAL = new AutoplayLayout("EXPLORE_LOW_DIAGONAL", 4);
    public static final AutoplayLayout UNKNOWN = new AutoplayLayout("UNKNOWN", 5);

    public static final /* synthetic */ AutoplayLayout[] $values() {
        return new AutoplayLayout[]{ALL, TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT1, TEST_SURFACE_TEST_SCREEN_TEST_LAYOUT2, EXPLORE_DIAGONAL, EXPLORE_LOW_DIAGONAL, UNKNOWN};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AutoplayLayout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AutoplayLayout valueOf(String str) {
        return (AutoplayLayout) Enum.valueOf(AutoplayLayout.class, str);
    }

    public static AutoplayLayout[] values() {
        return (AutoplayLayout[]) $VALUES.clone();
    }

    public AutoplayLayout(String str, int i) {
    }
}
