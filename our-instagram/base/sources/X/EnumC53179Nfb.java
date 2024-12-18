package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53179Nfb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53179Nfb[] A01;
    public static final EnumC53179Nfb A02;
    public static final EnumC53179Nfb A03;
    public static final EnumC53179Nfb A04;
    public static final EnumC53179Nfb A05;
    public static final EnumC53179Nfb A06;
    public static final EnumC53179Nfb A07;
    public static final EnumC53179Nfb A08;

    static {
        EnumC53179Nfb enumC53179Nfb = new EnumC53179Nfb("STRONG", 0);
        A04 = enumC53179Nfb;
        EnumC53179Nfb enumC53179Nfb2 = new EnumC53179Nfb("DOWN_BEAT", 1);
        A02 = enumC53179Nfb2;
        EnumC53179Nfb enumC53179Nfb3 = new EnumC53179Nfb("PHRASE", 2);
        A03 = enumC53179Nfb3;
        EnumC53179Nfb enumC53179Nfb4 = new EnumC53179Nfb("TWO_BAR", 3);
        A05 = enumC53179Nfb4;
        EnumC53179Nfb enumC53179Nfb5 = new EnumC53179Nfb("TWO_BAR_AND_DOWN_BEAT", 4);
        A06 = enumC53179Nfb5;
        EnumC53179Nfb enumC53179Nfb6 = new EnumC53179Nfb("TWO_BAR_AND_PHRASE", 5);
        A07 = enumC53179Nfb6;
        EnumC53179Nfb enumC53179Nfb7 = new EnumC53179Nfb("TWO_BAR_AND_PHRASE_AND_DOWN_BEAT", 6);
        A08 = enumC53179Nfb7;
        EnumC53179Nfb[] enumC53179NfbArr = {enumC53179Nfb, enumC53179Nfb2, enumC53179Nfb3, enumC53179Nfb4, enumC53179Nfb5, enumC53179Nfb6, enumC53179Nfb7};
        A01 = enumC53179NfbArr;
        A00 = AbstractC12190kN.A00(enumC53179NfbArr);
    }

    public static EnumC53179Nfb valueOf(String str) {
        return (EnumC53179Nfb) Enum.valueOf(EnumC53179Nfb.class, str);
    }

    public static EnumC53179Nfb[] values() {
        return (EnumC53179Nfb[]) A01.clone();
    }

    public EnumC53179Nfb(String str, int i) {
    }
}
