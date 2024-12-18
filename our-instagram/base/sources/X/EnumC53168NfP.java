package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53168NfP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53168NfP[] A01;
    public static final EnumC53168NfP A02;
    public static final EnumC53168NfP A03;
    public static final EnumC53168NfP A04;
    public static final EnumC53168NfP A05;
    public static final EnumC53168NfP A06;
    public static final EnumC53168NfP A07;

    static {
        EnumC53168NfP enumC53168NfP = new EnumC53168NfP("GLOBAL_ONLY", 0);
        A02 = enumC53168NfP;
        EnumC53168NfP enumC53168NfP2 = new EnumC53168NfP("MILD", 1);
        A03 = enumC53168NfP2;
        EnumC53168NfP enumC53168NfP3 = new EnumC53168NfP("MODERATE", 2);
        A04 = enumC53168NfP3;
        EnumC53168NfP enumC53168NfP4 = new EnumC53168NfP("NORMAL", 3);
        A05 = enumC53168NfP4;
        EnumC53168NfP enumC53168NfP5 = new EnumC53168NfP("PRONOUNCED", 4);
        A06 = enumC53168NfP5;
        EnumC53168NfP enumC53168NfP6 = new EnumC53168NfP("STRONG", 5);
        A07 = enumC53168NfP6;
        EnumC53168NfP[] enumC53168NfPArr = {enumC53168NfP, enumC53168NfP2, enumC53168NfP3, enumC53168NfP4, enumC53168NfP5, enumC53168NfP6, new EnumC53168NfP("MAXIMUM", 6)};
        A01 = enumC53168NfPArr;
        A00 = AbstractC12190kN.A00(enumC53168NfPArr);
    }

    public static EnumC53168NfP valueOf(String str) {
        return (EnumC53168NfP) Enum.valueOf(EnumC53168NfP.class, str);
    }

    public static EnumC53168NfP[] values() {
        return (EnumC53168NfP[]) A01.clone();
    }

    public EnumC53168NfP(String str, int i) {
    }
}
