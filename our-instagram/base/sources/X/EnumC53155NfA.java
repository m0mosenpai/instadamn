package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53155NfA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53155NfA[] A01;
    public static final EnumC53155NfA A02;
    public static final EnumC53155NfA A03;
    public static final EnumC53155NfA A04;
    public static final EnumC53155NfA A05;

    static {
        EnumC53155NfA enumC53155NfA = new EnumC53155NfA("Initial", 0);
        A03 = enumC53155NfA;
        EnumC53155NfA enumC53155NfA2 = new EnumC53155NfA("Loading", 1);
        A04 = enumC53155NfA2;
        EnumC53155NfA enumC53155NfA3 = new EnumC53155NfA("Failed", 2);
        A02 = enumC53155NfA3;
        EnumC53155NfA enumC53155NfA4 = new EnumC53155NfA("Success", 3);
        A05 = enumC53155NfA4;
        EnumC53155NfA[] enumC53155NfAArr = {enumC53155NfA, enumC53155NfA2, enumC53155NfA3, enumC53155NfA4};
        A01 = enumC53155NfAArr;
        A00 = AbstractC12190kN.A00(enumC53155NfAArr);
    }

    public static EnumC53155NfA valueOf(String str) {
        return (EnumC53155NfA) Enum.valueOf(EnumC53155NfA.class, str);
    }

    public static EnumC53155NfA[] values() {
        return (EnumC53155NfA[]) A01.clone();
    }

    public EnumC53155NfA(String str, int i) {
    }
}
