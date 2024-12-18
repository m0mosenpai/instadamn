package com.facebookpay.offsite.models.message;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SessionUsageType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ SessionUsageType[] $VALUES;
    public static final SessionUsageType ON_SESSION = new SessionUsageType("ON_SESSION", 0);
    public static final SessionUsageType OFF_SESSION = new SessionUsageType("OFF_SESSION", 1);

    public static final /* synthetic */ SessionUsageType[] $values() {
        return new SessionUsageType[]{ON_SESSION, OFF_SESSION};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        SessionUsageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static SessionUsageType valueOf(String str) {
        return (SessionUsageType) Enum.valueOf(SessionUsageType.class, str);
    }

    public static SessionUsageType[] values() {
        return (SessionUsageType[]) $VALUES.clone();
    }

    public SessionUsageType(String str, int i) {
    }
}
