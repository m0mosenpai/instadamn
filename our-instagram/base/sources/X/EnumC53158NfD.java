package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53158NfD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53158NfD[] A01;
    public static final EnumC53158NfD A02;
    public static final EnumC53158NfD A03;
    public static final EnumC53158NfD A04;
    public static final EnumC53158NfD A05;

    static {
        EnumC53158NfD enumC53158NfD = new EnumC53158NfD("DURING_LIVE", 0);
        A02 = enumC53158NfD;
        EnumC53158NfD enumC53158NfD2 = new EnumC53158NfD("POST_LIVE", 1);
        A03 = enumC53158NfD2;
        EnumC53158NfD enumC53158NfD3 = new EnumC53158NfD("SETTINGS", 2);
        A04 = enumC53158NfD3;
        EnumC53158NfD enumC53158NfD4 = new EnumC53158NfD("STICKER_EDITING", 3);
        A05 = enumC53158NfD4;
        EnumC53158NfD[] enumC53158NfDArr = {enumC53158NfD, enumC53158NfD2, enumC53158NfD3, enumC53158NfD4};
        A01 = enumC53158NfDArr;
        A00 = AbstractC12190kN.A00(enumC53158NfDArr);
    }

    public static EnumC53158NfD valueOf(String str) {
        return (EnumC53158NfD) Enum.valueOf(EnumC53158NfD.class, str);
    }

    public static EnumC53158NfD[] values() {
        return (EnumC53158NfD[]) A01.clone();
    }

    public EnumC53158NfD(String str, int i) {
    }
}
