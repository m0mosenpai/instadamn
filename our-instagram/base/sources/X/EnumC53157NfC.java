package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53157NfC {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53157NfC[] A01;
    public static final EnumC53157NfC A02;
    public static final EnumC53157NfC A03;
    public static final EnumC53157NfC A04;
    public static final EnumC53157NfC A05;

    static {
        EnumC53157NfC enumC53157NfC = new EnumC53157NfC("CANCEL_SETTING_CHANGE_REQUEST", 0);
        A02 = enumC53157NfC;
        EnumC53157NfC enumC53157NfC2 = new EnumC53157NfC("CANCEL_SETTING_CHANGE_REQUEST_SUPERVISION_PENDING", 1);
        A03 = enumC53157NfC2;
        EnumC53157NfC enumC53157NfC3 = new EnumC53157NfC("REQUEST_SETTING_CHANGE", 2);
        A05 = enumC53157NfC3;
        EnumC53157NfC enumC53157NfC4 = new EnumC53157NfC("EXPEDITE_REMOVAL", 3);
        A04 = enumC53157NfC4;
        EnumC53157NfC[] enumC53157NfCArr = {enumC53157NfC, enumC53157NfC2, enumC53157NfC3, enumC53157NfC4};
        A01 = enumC53157NfCArr;
        A00 = AbstractC12190kN.A00(enumC53157NfCArr);
    }

    public static EnumC53157NfC valueOf(String str) {
        return (EnumC53157NfC) Enum.valueOf(EnumC53157NfC.class, str);
    }

    public static EnumC53157NfC[] values() {
        return (EnumC53157NfC[]) A01.clone();
    }

    public EnumC53157NfC(String str, int i) {
    }
}
