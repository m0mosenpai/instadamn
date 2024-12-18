package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46175KcD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46175KcD[] A01;
    public static final EnumC46175KcD A02;
    public static final EnumC46175KcD A03;
    public static final EnumC46175KcD A04;
    public static final EnumC46175KcD A05;
    public static final EnumC46175KcD A06;
    public static final EnumC46175KcD A07;

    static {
        EnumC46175KcD enumC46175KcD = new EnumC46175KcD("INFO", 0);
        A03 = enumC46175KcD;
        EnumC46175KcD enumC46175KcD2 = new EnumC46175KcD("EYE_OFF", 1);
        A02 = enumC46175KcD2;
        EnumC46175KcD enumC46175KcD3 = new EnumC46175KcD("NEWS_OFF", 2);
        A05 = enumC46175KcD3;
        EnumC46175KcD enumC46175KcD4 = new EnumC46175KcD("WARNING", 3);
        A07 = enumC46175KcD4;
        EnumC46175KcD enumC46175KcD5 = new EnumC46175KcD("PRIVATE", 4);
        A06 = enumC46175KcD5;
        EnumC46175KcD enumC46175KcD6 = new EnumC46175KcD("INFO_FILLED", 5);
        A04 = enumC46175KcD6;
        EnumC46175KcD[] enumC46175KcDArr = {enumC46175KcD, enumC46175KcD2, enumC46175KcD3, enumC46175KcD4, enumC46175KcD5, enumC46175KcD6};
        A01 = enumC46175KcDArr;
        A00 = AbstractC12190kN.A00(enumC46175KcDArr);
    }

    public static EnumC46175KcD valueOf(String str) {
        return (EnumC46175KcD) Enum.valueOf(EnumC46175KcD.class, str);
    }

    public static EnumC46175KcD[] values() {
        return (EnumC46175KcD[]) A01.clone();
    }

    public EnumC46175KcD(String str, int i) {
    }
}
