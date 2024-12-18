package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC153216up {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC153216up[] A01;
    public static final EnumC153216up A02;
    public static final EnumC153216up A03;
    public static final EnumC153216up A04;
    public static final EnumC153216up A05;
    public static final EnumC153216up A06;
    public static final EnumC153216up A07;

    static {
        EnumC153216up enumC153216up = new EnumC153216up("EMPTY", 0);
        A02 = enumC153216up;
        EnumC153216up enumC153216up2 = new EnumC153216up("EMPTY_PRO", 1);
        A03 = enumC153216up2;
        EnumC153216up enumC153216up3 = new EnumC153216up("LOADING", 2);
        A06 = enumC153216up3;
        EnumC153216up enumC153216up4 = new EnumC153216up("ERROR", 3);
        A04 = enumC153216up4;
        EnumC153216up enumC153216up5 = new EnumC153216up("GONE", 4);
        A05 = enumC153216up5;
        EnumC153216up enumC153216up6 = new EnumC153216up("NOT_LOADED", 5);
        A07 = enumC153216up6;
        EnumC153216up[] enumC153216upArr = {enumC153216up, enumC153216up2, enumC153216up3, enumC153216up4, enumC153216up5, enumC153216up6, new EnumC153216up("EMPTY_FILTERING", 6)};
        A01 = enumC153216upArr;
        A00 = AbstractC12190kN.A00(enumC153216upArr);
    }

    public static EnumC153216up valueOf(String str) {
        return (EnumC153216up) Enum.valueOf(EnumC153216up.class, str);
    }

    public static EnumC153216up[] values() {
        return (EnumC153216up[]) A01.clone();
    }

    public EnumC153216up(String str, int i) {
    }
}
