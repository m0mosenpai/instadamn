package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Neg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53128Neg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53128Neg[] A01;
    public static final EnumC53128Neg A02;
    public static final EnumC53128Neg A03;
    public static final EnumC53128Neg A04;

    static {
        EnumC53128Neg enumC53128Neg = new EnumC53128Neg("STARTED", 0);
        A03 = enumC53128Neg;
        EnumC53128Neg enumC53128Neg2 = new EnumC53128Neg("DOWNLOADING", 1);
        A02 = enumC53128Neg2;
        EnumC53128Neg enumC53128Neg3 = new EnumC53128Neg("SUCCEEDED", 2);
        A04 = enumC53128Neg3;
        EnumC53128Neg[] enumC53128NegArr = {enumC53128Neg, enumC53128Neg2, enumC53128Neg3, new EnumC53128Neg("FAILED", 3)};
        A01 = enumC53128NegArr;
        A00 = AbstractC12190kN.A00(enumC53128NegArr);
    }

    public static EnumC53128Neg valueOf(String str) {
        return (EnumC53128Neg) Enum.valueOf(EnumC53128Neg.class, str);
    }

    public static EnumC53128Neg[] values() {
        return (EnumC53128Neg[]) A01.clone();
    }

    public EnumC53128Neg(String str, int i) {
    }
}
