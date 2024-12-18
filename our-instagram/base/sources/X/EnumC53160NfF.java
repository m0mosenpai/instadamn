package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53160NfF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53160NfF[] A01;
    public static final EnumC53160NfF A02;
    public static final EnumC53160NfF A03;
    public static final EnumC53160NfF A04;
    public static final EnumC53160NfF A05;
    public static final EnumC53160NfF A06;

    static {
        EnumC53160NfF enumC53160NfF = new EnumC53160NfF("BLUE", 0);
        A02 = enumC53160NfF;
        EnumC53160NfF enumC53160NfF2 = new EnumC53160NfF("SUCCESS", 1);
        A05 = enumC53160NfF2;
        EnumC53160NfF enumC53160NfF3 = new EnumC53160NfF("WARNING", 2);
        A06 = enumC53160NfF3;
        EnumC53160NfF enumC53160NfF4 = new EnumC53160NfF("ERROR", 3);
        A03 = enumC53160NfF4;
        EnumC53160NfF enumC53160NfF5 = new EnumC53160NfF("ERROR_DOT", 4);
        A04 = enumC53160NfF5;
        EnumC53160NfF[] enumC53160NfFArr = {enumC53160NfF, enumC53160NfF2, enumC53160NfF3, enumC53160NfF4, enumC53160NfF5};
        A01 = enumC53160NfFArr;
        A00 = AbstractC12190kN.A00(enumC53160NfFArr);
    }

    public static EnumC53160NfF valueOf(String str) {
        return (EnumC53160NfF) Enum.valueOf(EnumC53160NfF.class, str);
    }

    public static EnumC53160NfF[] values() {
        return (EnumC53160NfF[]) A01.clone();
    }

    public EnumC53160NfF(String str, int i) {
    }
}
