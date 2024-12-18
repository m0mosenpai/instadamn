package com.instagram.autoplay.models;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AutoplayInitialSelectionSource {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AutoplayInitialSelectionSource[] $VALUES;
    public static final AutoplayInitialSelectionSource LOCAL_NO_CACHE = new AutoplayInitialSelectionSource("LOCAL_NO_CACHE", 0);
    public static final AutoplayInitialSelectionSource CACHED_FROM_LAST_SESSION = new AutoplayInitialSelectionSource("CACHED_FROM_LAST_SESSION", 1);
    public static final AutoplayInitialSelectionSource CACHED_FROM_CURRENT_SESSION = new AutoplayInitialSelectionSource("CACHED_FROM_CURRENT_SESSION", 2);

    public static final /* synthetic */ AutoplayInitialSelectionSource[] $values() {
        return new AutoplayInitialSelectionSource[]{LOCAL_NO_CACHE, CACHED_FROM_LAST_SESSION, CACHED_FROM_CURRENT_SESSION};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AutoplayInitialSelectionSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AutoplayInitialSelectionSource valueOf(String str) {
        return (AutoplayInitialSelectionSource) Enum.valueOf(AutoplayInitialSelectionSource.class, str);
    }

    public static AutoplayInitialSelectionSource[] values() {
        return (AutoplayInitialSelectionSource[]) $VALUES.clone();
    }

    public AutoplayInitialSelectionSource(String str, int i) {
    }
}
