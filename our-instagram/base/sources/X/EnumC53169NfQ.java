package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53169NfQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53169NfQ[] A01;
    public static final EnumC53169NfQ A02;
    public static final EnumC53169NfQ A03;
    public static final EnumC53169NfQ A04;
    public static final EnumC53169NfQ A05;
    public static final EnumC53169NfQ A06;
    public static final EnumC53169NfQ A07;

    static {
        EnumC53169NfQ enumC53169NfQ = new EnumC53169NfQ("GRID", 0);
        A03 = enumC53169NfQ;
        EnumC53169NfQ enumC53169NfQ2 = new EnumC53169NfQ("CALENDAR", 1);
        A02 = enumC53169NfQ2;
        EnumC53169NfQ enumC53169NfQ3 = new EnumC53169NfQ("MAP", 2);
        A05 = enumC53169NfQ3;
        EnumC53169NfQ enumC53169NfQ4 = new EnumC53169NfQ("PEOPLE", 3);
        A06 = enumC53169NfQ4;
        EnumC53169NfQ enumC53169NfQ5 = new EnumC53169NfQ("RECYCLE_BIN", 4);
        A07 = enumC53169NfQ5;
        EnumC53169NfQ enumC53169NfQ6 = new EnumC53169NfQ("HIGHLIGHTS", 5);
        A04 = enumC53169NfQ6;
        EnumC53169NfQ[] enumC53169NfQArr = {enumC53169NfQ, enumC53169NfQ2, enumC53169NfQ3, enumC53169NfQ4, enumC53169NfQ5, enumC53169NfQ6};
        A01 = enumC53169NfQArr;
        A00 = AbstractC12190kN.A00(enumC53169NfQArr);
    }

    public static EnumC53169NfQ valueOf(String str) {
        return (EnumC53169NfQ) Enum.valueOf(EnumC53169NfQ.class, str);
    }

    public static EnumC53169NfQ[] values() {
        return (EnumC53169NfQ[]) A01.clone();
    }

    public EnumC53169NfQ(String str, int i) {
    }
}
