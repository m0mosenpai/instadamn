package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53199Nfv {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53199Nfv[] A02;
    public static final EnumC53199Nfv A03;
    public static final EnumC53199Nfv A04;
    public final String A00;

    static {
        EnumC53199Nfv enumC53199Nfv = new EnumC53199Nfv("ITEM_TYPE_INAPP", 0, "inapp");
        A03 = enumC53199Nfv;
        EnumC53199Nfv enumC53199Nfv2 = new EnumC53199Nfv("ITEM_TYPE_SUBS", 1, "subs");
        A04 = enumC53199Nfv2;
        EnumC53199Nfv[] enumC53199NfvArr = {enumC53199Nfv, enumC53199Nfv2};
        A02 = enumC53199NfvArr;
        A01 = AbstractC12190kN.A00(enumC53199NfvArr);
    }

    public static EnumC53199Nfv valueOf(String str) {
        return (EnumC53199Nfv) Enum.valueOf(EnumC53199Nfv.class, str);
    }

    public static EnumC53199Nfv[] values() {
        return (EnumC53199Nfv[]) A02.clone();
    }

    public EnumC53199Nfv(String str, int i, String str2) {
        this.A00 = str2;
    }
}
