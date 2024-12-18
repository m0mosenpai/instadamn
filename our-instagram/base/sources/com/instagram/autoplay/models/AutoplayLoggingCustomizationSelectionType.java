package com.instagram.autoplay.models;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AutoplayLoggingCustomizationSelectionType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AutoplayLoggingCustomizationSelectionType[] $VALUES;
    public static final AutoplayLoggingCustomizationSelectionType INITIAL = new AutoplayLoggingCustomizationSelectionType("INITIAL", 0);
    public static final AutoplayLoggingCustomizationSelectionType DOWNGRADE = new AutoplayLoggingCustomizationSelectionType("DOWNGRADE", 1);
    public static final AutoplayLoggingCustomizationSelectionType UPGRADE = new AutoplayLoggingCustomizationSelectionType("UPGRADE", 2);
    public static final AutoplayLoggingCustomizationSelectionType COULD_NOT_UPGRADE = new AutoplayLoggingCustomizationSelectionType("COULD_NOT_UPGRADE", 3);
    public static final AutoplayLoggingCustomizationSelectionType COULD_NOT_DOWNGRADE = new AutoplayLoggingCustomizationSelectionType("COULD_NOT_DOWNGRADE", 4);

    public static final /* synthetic */ AutoplayLoggingCustomizationSelectionType[] $values() {
        return new AutoplayLoggingCustomizationSelectionType[]{INITIAL, DOWNGRADE, UPGRADE, COULD_NOT_UPGRADE, COULD_NOT_DOWNGRADE};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AutoplayLoggingCustomizationSelectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AutoplayLoggingCustomizationSelectionType valueOf(String str) {
        return (AutoplayLoggingCustomizationSelectionType) Enum.valueOf(AutoplayLoggingCustomizationSelectionType.class, str);
    }

    public static AutoplayLoggingCustomizationSelectionType[] values() {
        return (AutoplayLoggingCustomizationSelectionType[]) $VALUES.clone();
    }

    public AutoplayLoggingCustomizationSelectionType(String str, int i) {
    }
}
