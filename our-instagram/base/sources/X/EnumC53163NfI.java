package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53163NfI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53163NfI[] A01;
    public static final EnumC53163NfI A02;
    public static final EnumC53163NfI A03;
    public static final EnumC53163NfI A04;
    public static final EnumC53163NfI A05;
    public static final EnumC53163NfI A06;

    static {
        EnumC53163NfI enumC53163NfI = new EnumC53163NfI("MUSIC", 0);
        A06 = enumC53163NfI;
        EnumC53163NfI enumC53163NfI2 = new EnumC53163NfI("CATEGORY", 1);
        A03 = enumC53163NfI2;
        EnumC53163NfI enumC53163NfI3 = new EnumC53163NfI("CUSTOM_LINK", 2);
        A04 = enumC53163NfI3;
        EnumC53163NfI enumC53163NfI4 = new EnumC53163NfI("BROADCAST", 3);
        A02 = enumC53163NfI4;
        EnumC53163NfI enumC53163NfI5 = new EnumC53163NfI("FUNDRAISER", 4);
        A05 = enumC53163NfI5;
        EnumC53163NfI[] enumC53163NfIArr = {enumC53163NfI, enumC53163NfI2, enumC53163NfI3, enumC53163NfI4, enumC53163NfI5};
        A01 = enumC53163NfIArr;
        A00 = AbstractC12190kN.A00(enumC53163NfIArr);
    }

    public static EnumC53163NfI valueOf(String str) {
        return (EnumC53163NfI) Enum.valueOf(EnumC53163NfI.class, str);
    }

    public static EnumC53163NfI[] values() {
        return (EnumC53163NfI[]) A01.clone();
    }

    public EnumC53163NfI(String str, int i) {
    }
}
