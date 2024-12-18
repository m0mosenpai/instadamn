package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53166NfN {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53166NfN[] A01;
    public static final EnumC53166NfN A02;
    public static final EnumC53166NfN A03;
    public static final EnumC53166NfN A04;
    public static final EnumC53166NfN A05;
    public static final EnumC53166NfN A06;

    static {
        EnumC53166NfN enumC53166NfN = new EnumC53166NfN("FILE_VALID", 0);
        A06 = enumC53166NfN;
        EnumC53166NfN enumC53166NfN2 = new EnumC53166NfN("FILE_MISSING", 1);
        A03 = enumC53166NfN2;
        EnumC53166NfN enumC53166NfN3 = new EnumC53166NfN("FILE_EMPTY", 2);
        A02 = enumC53166NfN3;
        EnumC53166NfN enumC53166NfN4 = new EnumC53166NfN("FILE_TOO_BIG", 3);
        A05 = enumC53166NfN4;
        EnumC53166NfN enumC53166NfN5 = new EnumC53166NfN("FILE_NOT_GENERATED", 4);
        A04 = enumC53166NfN5;
        EnumC53166NfN[] enumC53166NfNArr = {enumC53166NfN, enumC53166NfN2, enumC53166NfN3, enumC53166NfN4, enumC53166NfN5};
        A01 = enumC53166NfNArr;
        A00 = AbstractC12190kN.A00(enumC53166NfNArr);
    }

    public static EnumC53166NfN valueOf(String str) {
        return (EnumC53166NfN) Enum.valueOf(EnumC53166NfN.class, str);
    }

    public static EnumC53166NfN[] values() {
        return (EnumC53166NfN[]) A01.clone();
    }

    public EnumC53166NfN(String str, int i) {
    }
}
