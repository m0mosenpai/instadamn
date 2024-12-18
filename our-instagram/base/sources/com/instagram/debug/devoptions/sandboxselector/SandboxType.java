package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SandboxType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ SandboxType[] $VALUES;
    public static final SandboxType PRODUCTION = new SandboxType("PRODUCTION", 0);
    public static final SandboxType DEDICATED = new SandboxType("DEDICATED", 1);
    public static final SandboxType ON_DEMAND = new SandboxType("ON_DEMAND", 2);
    public static final SandboxType OTHER = new SandboxType("OTHER", 3);

    public static final /* synthetic */ SandboxType[] $values() {
        return new SandboxType[]{PRODUCTION, DEDICATED, ON_DEMAND, OTHER};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        SandboxType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static SandboxType valueOf(String str) {
        return (SandboxType) Enum.valueOf(SandboxType.class, str);
    }

    public static SandboxType[] values() {
        return (SandboxType[]) $VALUES.clone();
    }

    public SandboxType(String str, int i) {
    }
}
