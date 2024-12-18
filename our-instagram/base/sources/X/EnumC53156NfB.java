package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53156NfB {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53156NfB[] A01;
    public static final EnumC53156NfB A02;
    public static final EnumC53156NfB A03;
    public static final EnumC53156NfB A04;
    public static final EnumC53156NfB A05;

    static {
        EnumC53156NfB enumC53156NfB = new EnumC53156NfB("CONNECTED", 0);
        A02 = enumC53156NfB;
        EnumC53156NfB enumC53156NfB2 = new EnumC53156NfB("DISCONNECTED", 1);
        A05 = enumC53156NfB2;
        EnumC53156NfB enumC53156NfB3 = new EnumC53156NfB("CONNECTING", 2);
        A03 = enumC53156NfB3;
        EnumC53156NfB enumC53156NfB4 = new EnumC53156NfB("CONNECTION_FAILURE", 3);
        A04 = enumC53156NfB4;
        EnumC53156NfB[] enumC53156NfBArr = {enumC53156NfB, enumC53156NfB2, enumC53156NfB3, enumC53156NfB4};
        A01 = enumC53156NfBArr;
        A00 = AbstractC12190kN.A00(enumC53156NfBArr);
    }

    public static EnumC53156NfB valueOf(String str) {
        return (EnumC53156NfB) Enum.valueOf(EnumC53156NfB.class, str);
    }

    public static EnumC53156NfB[] values() {
        return (EnumC53156NfB[]) A01.clone();
    }

    public EnumC53156NfB(String str, int i) {
    }
}
