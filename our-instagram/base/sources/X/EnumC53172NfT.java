package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53172NfT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53172NfT[] A01;
    public static final EnumC53172NfT A02;
    public static final EnumC53172NfT A03;
    public static final EnumC53172NfT A04;
    public static final EnumC53172NfT A05;
    public static final EnumC53172NfT A06;
    public static final EnumC53172NfT A07;

    static {
        EnumC53172NfT enumC53172NfT = new EnumC53172NfT("HEADER", 0);
        A02 = enumC53172NfT;
        EnumC53172NfT enumC53172NfT2 = new EnumC53172NfT("OVERVIEW", 1);
        A05 = enumC53172NfT2;
        EnumC53172NfT enumC53172NfT3 = new EnumC53172NfT("INCENTIVES", 2);
        A04 = enumC53172NfT3;
        EnumC53172NfT enumC53172NfT4 = new EnumC53172NfT("HOW_IT_WORKS", 3);
        A03 = enumC53172NfT4;
        EnumC53172NfT enumC53172NfT5 = new EnumC53172NfT("SERVICES", 4);
        A06 = enumC53172NfT5;
        EnumC53172NfT enumC53172NfT6 = new EnumC53172NfT("SOCIAL_PROOF", 5);
        A07 = enumC53172NfT6;
        EnumC53172NfT[] enumC53172NfTArr = {enumC53172NfT, enumC53172NfT2, enumC53172NfT3, enumC53172NfT4, enumC53172NfT5, enumC53172NfT6};
        A01 = enumC53172NfTArr;
        A00 = AbstractC12190kN.A00(enumC53172NfTArr);
    }

    public static EnumC53172NfT valueOf(String str) {
        return (EnumC53172NfT) Enum.valueOf(EnumC53172NfT.class, str);
    }

    public static EnumC53172NfT[] values() {
        return (EnumC53172NfT[]) A01.clone();
    }

    public EnumC53172NfT(String str, int i) {
    }
}
