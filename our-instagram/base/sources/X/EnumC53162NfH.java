package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53162NfH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53162NfH[] A01;
    public static final EnumC53162NfH A02;
    public static final EnumC53162NfH A03;
    public static final EnumC53162NfH A04;
    public static final EnumC53162NfH A05;
    public static final EnumC53162NfH A06;

    static {
        EnumC53162NfH enumC53162NfH = new EnumC53162NfH("NOT_STARTED", 0);
        A06 = enumC53162NfH;
        EnumC53162NfH enumC53162NfH2 = new EnumC53162NfH("LOADING", 1);
        A05 = enumC53162NfH2;
        EnumC53162NfH enumC53162NfH3 = new EnumC53162NfH("EMPTY", 2);
        A02 = enumC53162NfH3;
        EnumC53162NfH enumC53162NfH4 = new EnumC53162NfH("LOADED", 3);
        A04 = enumC53162NfH4;
        EnumC53162NfH enumC53162NfH5 = new EnumC53162NfH("ERROR", 4);
        A03 = enumC53162NfH5;
        EnumC53162NfH[] enumC53162NfHArr = {enumC53162NfH, enumC53162NfH2, enumC53162NfH3, enumC53162NfH4, enumC53162NfH5};
        A01 = enumC53162NfHArr;
        A00 = AbstractC12190kN.A00(enumC53162NfHArr);
    }

    public static EnumC53162NfH valueOf(String str) {
        return (EnumC53162NfH) Enum.valueOf(EnumC53162NfH.class, str);
    }

    public static EnumC53162NfH[] values() {
        return (EnumC53162NfH[]) A01.clone();
    }

    public EnumC53162NfH(String str, int i) {
    }
}
