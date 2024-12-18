package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53211Ng9 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53211Ng9[] A02;
    public static final EnumC53211Ng9 A03;
    public static final EnumC53211Ng9 A04;
    public static final EnumC53211Ng9 A05;
    public final int A00;

    static {
        EnumC53211Ng9 enumC53211Ng9 = new EnumC53211Ng9("OPEN", 0, 0);
        A04 = enumC53211Ng9;
        EnumC53211Ng9 enumC53211Ng92 = new EnumC53211Ng9("LOST", 1, 1);
        A03 = enumC53211Ng92;
        EnumC53211Ng9 enumC53211Ng93 = new EnumC53211Ng9("REJECTED", 2, 2);
        A05 = enumC53211Ng93;
        EnumC53211Ng9[] enumC53211Ng9Arr = {enumC53211Ng9, enumC53211Ng92, enumC53211Ng93, new EnumC53211Ng9("NO_ROUTE", 3, 3)};
        A02 = enumC53211Ng9Arr;
        A01 = AbstractC12190kN.A00(enumC53211Ng9Arr);
    }

    public static EnumC53211Ng9 valueOf(String str) {
        return (EnumC53211Ng9) Enum.valueOf(EnumC53211Ng9.class, str);
    }

    public static EnumC53211Ng9[] values() {
        return (EnumC53211Ng9[]) A02.clone();
    }

    public EnumC53211Ng9(String str, int i, int i2) {
        this.A00 = i2;
    }
}
