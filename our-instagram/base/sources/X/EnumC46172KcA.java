package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46172KcA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46172KcA[] A01;
    public static final EnumC46172KcA A02;
    public static final EnumC46172KcA A03;
    public static final EnumC46172KcA A04;
    public static final EnumC46172KcA A05;
    public static final EnumC46172KcA A06;
    public static final EnumC46172KcA A07;

    static {
        EnumC46172KcA enumC46172KcA = new EnumC46172KcA("Unknown", 0);
        A07 = enumC46172KcA;
        EnumC46172KcA enumC46172KcA2 = new EnumC46172KcA("Loading", 1);
        A05 = enumC46172KcA2;
        EnumC46172KcA enumC46172KcA3 = new EnumC46172KcA("NoBackupsPresent", 2);
        A06 = enumC46172KcA3;
        EnumC46172KcA enumC46172KcA4 = new EnumC46172KcA("DeviceNotOnboarded", 3);
        A02 = enumC46172KcA4;
        EnumC46172KcA enumC46172KcA5 = new EnumC46172KcA("DeviceOnboarded", 4);
        A03 = enumC46172KcA5;
        EnumC46172KcA enumC46172KcA6 = new EnumC46172KcA("FetchError", 5);
        A04 = enumC46172KcA6;
        EnumC46172KcA[] enumC46172KcAArr = {enumC46172KcA, enumC46172KcA2, enumC46172KcA3, enumC46172KcA4, enumC46172KcA5, enumC46172KcA6};
        A01 = enumC46172KcAArr;
        A00 = AbstractC12190kN.A00(enumC46172KcAArr);
    }

    public static EnumC46172KcA valueOf(String str) {
        return (EnumC46172KcA) Enum.valueOf(EnumC46172KcA.class, str);
    }

    public static EnumC46172KcA[] values() {
        return (EnumC46172KcA[]) A01.clone();
    }

    public EnumC46172KcA(String str, int i) {
    }
}
