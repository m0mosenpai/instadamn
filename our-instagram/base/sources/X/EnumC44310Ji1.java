package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ji1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44310Ji1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC44310Ji1[] A01;
    public static final EnumC44310Ji1 A02;
    public static final EnumC44310Ji1 A03;
    public static final EnumC44310Ji1 A04;

    static {
        EnumC44310Ji1 enumC44310Ji1 = new EnumC44310Ji1("FADED", 0);
        A04 = enumC44310Ji1;
        EnumC44310Ji1 enumC44310Ji12 = new EnumC44310Ji1("ENABLE", 1);
        A03 = enumC44310Ji12;
        EnumC44310Ji1 enumC44310Ji13 = new EnumC44310Ji1("DISABLED", 2);
        A02 = enumC44310Ji13;
        EnumC44310Ji1[] enumC44310Ji1Arr = {enumC44310Ji1, enumC44310Ji12, enumC44310Ji13};
        A01 = enumC44310Ji1Arr;
        A00 = AbstractC12190kN.A00(enumC44310Ji1Arr);
    }

    public static EnumC44310Ji1 valueOf(String str) {
        return (EnumC44310Ji1) Enum.valueOf(EnumC44310Ji1.class, str);
    }

    public static EnumC44310Ji1[] values() {
        return (EnumC44310Ji1[]) A01.clone();
    }

    public EnumC44310Ji1(String str, int i) {
    }
}
