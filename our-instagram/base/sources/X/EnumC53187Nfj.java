package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53187Nfj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53187Nfj[] A01;
    public static final EnumC53187Nfj A02;
    public static final EnumC53187Nfj A03;
    public static final EnumC53187Nfj A04;
    public static final EnumC53187Nfj A05;
    public static final EnumC53187Nfj A06;
    public static final EnumC53187Nfj A07;
    public static final EnumC53187Nfj A08;
    public static final EnumC53187Nfj A09;
    public static final EnumC53187Nfj A0A;
    public static final EnumC53187Nfj A0B;
    public static final EnumC53187Nfj A0C;

    static {
        EnumC53187Nfj enumC53187Nfj = new EnumC53187Nfj("UNKNOWN", 0);
        A0B = enumC53187Nfj;
        EnumC53187Nfj enumC53187Nfj2 = new EnumC53187Nfj("INVITED", 1);
        A08 = enumC53187Nfj2;
        EnumC53187Nfj enumC53187Nfj3 = new EnumC53187Nfj("CONNECTING", 2);
        A04 = enumC53187Nfj3;
        EnumC53187Nfj enumC53187Nfj4 = new EnumC53187Nfj("UNREACHABLE", 3);
        A0C = enumC53187Nfj4;
        EnumC53187Nfj enumC53187Nfj5 = new EnumC53187Nfj("REJECTED", 4);
        A09 = enumC53187Nfj5;
        EnumC53187Nfj enumC53187Nfj6 = new EnumC53187Nfj("CONNECTED", 5);
        A03 = enumC53187Nfj6;
        EnumC53187Nfj enumC53187Nfj7 = new EnumC53187Nfj("ACTIVE", 6);
        A02 = enumC53187Nfj7;
        EnumC53187Nfj enumC53187Nfj8 = new EnumC53187Nfj("STALLED", 7);
        A0A = enumC53187Nfj8;
        EnumC53187Nfj enumC53187Nfj9 = new EnumC53187Nfj("DISCONNECTING", 8);
        A06 = enumC53187Nfj9;
        EnumC53187Nfj enumC53187Nfj10 = new EnumC53187Nfj("DISMISSED", 9);
        A07 = enumC53187Nfj10;
        EnumC53187Nfj enumC53187Nfj11 = new EnumC53187Nfj("DISCONNECTED", 10);
        A05 = enumC53187Nfj11;
        EnumC53187Nfj[] enumC53187NfjArr = {enumC53187Nfj, enumC53187Nfj2, enumC53187Nfj3, enumC53187Nfj4, enumC53187Nfj5, enumC53187Nfj6, enumC53187Nfj7, enumC53187Nfj8, enumC53187Nfj9, enumC53187Nfj10, enumC53187Nfj11};
        A01 = enumC53187NfjArr;
        A00 = AbstractC12190kN.A00(enumC53187NfjArr);
    }

    public static EnumC53187Nfj valueOf(String str) {
        return (EnumC53187Nfj) Enum.valueOf(EnumC53187Nfj.class, str);
    }

    public static EnumC53187Nfj[] values() {
        return (EnumC53187Nfj[]) A01.clone();
    }

    public EnumC53187Nfj(String str, int i) {
    }
}
