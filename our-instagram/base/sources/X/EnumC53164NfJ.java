package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53164NfJ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53164NfJ[] A01;
    public static final EnumC53164NfJ A02;
    public static final EnumC53164NfJ A03;
    public static final EnumC53164NfJ A04;
    public static final EnumC53164NfJ A05;
    public static final EnumC53164NfJ A06;

    static {
        EnumC53164NfJ enumC53164NfJ = new EnumC53164NfJ("UNKNOWN", 0);
        A06 = enumC53164NfJ;
        EnumC53164NfJ enumC53164NfJ2 = new EnumC53164NfJ("CREATION", 1);
        A02 = enumC53164NfJ2;
        EnumC53164NfJ enumC53164NfJ3 = new EnumC53164NfJ("DRAFT_MEGAPHONE", 2);
        A03 = enumC53164NfJ3;
        EnumC53164NfJ enumC53164NfJ4 = new EnumC53164NfJ("PRODASH", 3);
        A04 = enumC53164NfJ4;
        EnumC53164NfJ enumC53164NfJ5 = new EnumC53164NfJ("SELF_PROFILE_QP", 4);
        A05 = enumC53164NfJ5;
        EnumC53164NfJ[] enumC53164NfJArr = {enumC53164NfJ, enumC53164NfJ2, enumC53164NfJ3, enumC53164NfJ4, enumC53164NfJ5};
        A01 = enumC53164NfJArr;
        A00 = AbstractC12190kN.A00(enumC53164NfJArr);
    }

    public static EnumC53164NfJ valueOf(String str) {
        return (EnumC53164NfJ) Enum.valueOf(EnumC53164NfJ.class, str);
    }

    public static EnumC53164NfJ[] values() {
        return (EnumC53164NfJ[]) A01.clone();
    }

    public EnumC53164NfJ(String str, int i) {
    }
}
