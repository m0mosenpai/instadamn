package com.facebook.react.bridge;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ReadableType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ReadableType[] $VALUES;
    public static final ReadableType Null = new ReadableType("Null", 0);
    public static final ReadableType Boolean = new ReadableType("Boolean", 1);
    public static final ReadableType Number = new ReadableType("Number", 2);
    public static final ReadableType String = new ReadableType("String", 3);
    public static final ReadableType Map = new ReadableType("Map", 4);
    public static final ReadableType Array = new ReadableType("Array", 5);

    public static final /* synthetic */ ReadableType[] $values() {
        return new ReadableType[]{Null, Boolean, Number, String, Map, Array};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ReadableType valueOf(String str) {
        return (ReadableType) Enum.valueOf(ReadableType.class, str);
    }

    public static ReadableType[] values() {
        return (ReadableType[]) $VALUES.clone();
    }

    static {
        ReadableType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public ReadableType(String str, int i) {
    }
}
