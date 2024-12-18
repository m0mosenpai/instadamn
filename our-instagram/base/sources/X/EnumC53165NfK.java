package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53165NfK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53165NfK[] A01;
    public static final EnumC53165NfK A02;
    public static final EnumC53165NfK A03;
    public static final EnumC53165NfK A04;
    public static final EnumC53165NfK A05;
    public static final EnumC53165NfK A06;

    static {
        EnumC53165NfK enumC53165NfK = new EnumC53165NfK("STARTED", 0);
        A04 = enumC53165NfK;
        EnumC53165NfK enumC53165NfK2 = new EnumC53165NfK("STOPPED", 1);
        A05 = enumC53165NfK2;
        EnumC53165NfK enumC53165NfK3 = new EnumC53165NfK("RESUMED", 2);
        A03 = enumC53165NfK3;
        EnumC53165NfK enumC53165NfK4 = new EnumC53165NfK("INTERRUPTED", 3);
        A02 = enumC53165NfK4;
        EnumC53165NfK enumC53165NfK5 = new EnumC53165NfK("UNKNOWN", 4);
        A06 = enumC53165NfK5;
        EnumC53165NfK[] enumC53165NfKArr = {enumC53165NfK, enumC53165NfK2, enumC53165NfK3, enumC53165NfK4, enumC53165NfK5};
        A01 = enumC53165NfKArr;
        A00 = AbstractC12190kN.A00(enumC53165NfKArr);
    }

    public static EnumC53165NfK valueOf(String str) {
        return (EnumC53165NfK) Enum.valueOf(EnumC53165NfK.class, str);
    }

    public static EnumC53165NfK[] values() {
        return (EnumC53165NfK[]) A01.clone();
    }

    public EnumC53165NfK(String str, int i) {
    }
}
