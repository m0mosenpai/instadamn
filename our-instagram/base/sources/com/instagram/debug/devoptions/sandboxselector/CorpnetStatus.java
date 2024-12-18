package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class CorpnetStatus {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CorpnetStatus[] $VALUES;
    public static final CorpnetStatus OFF_CORPNET = new CorpnetStatus("OFF_CORPNET", 0);
    public static final CorpnetStatus ON_CORPNET = new CorpnetStatus("ON_CORPNET", 1);
    public static final CorpnetStatus CHECKING = new CorpnetStatus("CHECKING", 2);

    public static final /* synthetic */ CorpnetStatus[] $values() {
        return new CorpnetStatus[]{OFF_CORPNET, ON_CORPNET, CHECKING};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        CorpnetStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static CorpnetStatus valueOf(String str) {
        return (CorpnetStatus) Enum.valueOf(CorpnetStatus.class, str);
    }

    public static CorpnetStatus[] values() {
        return (CorpnetStatus[]) $VALUES.clone();
    }

    public CorpnetStatus(String str, int i) {
    }
}
