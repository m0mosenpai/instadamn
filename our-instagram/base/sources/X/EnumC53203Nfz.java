package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53203Nfz {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53203Nfz[] A02;
    public static final EnumC53203Nfz A03;
    public static final EnumC53203Nfz A04;
    public final int A00;

    public static EnumC53203Nfz valueOf(String str) {
        return (EnumC53203Nfz) Enum.valueOf(EnumC53203Nfz.class, str);
    }

    public static EnumC53203Nfz[] values() {
        return (EnumC53203Nfz[]) A02.clone();
    }

    static {
        EnumC53203Nfz enumC53203Nfz = new EnumC53203Nfz("SHORT_ANSWER", 0, 2131964960);
        A04 = enumC53203Nfz;
        EnumC53203Nfz enumC53203Nfz2 = new EnumC53203Nfz("MULTIPLE_CHOICE", 1, 2131964959);
        A03 = enumC53203Nfz2;
        EnumC53203Nfz[] enumC53203NfzArr = {enumC53203Nfz, enumC53203Nfz2};
        A02 = enumC53203NfzArr;
        A01 = AbstractC12190kN.A00(enumC53203NfzArr);
    }

    public EnumC53203Nfz(String str, int i, int i2) {
        this.A00 = i2;
    }
}
