package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53159NfE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53159NfE[] A01;
    public static final EnumC53159NfE A02;
    public static final EnumC53159NfE A03;
    public static final EnumC53159NfE A04;
    public static final EnumC53159NfE A05;
    public static final EnumC53159NfE A06;

    static {
        EnumC53159NfE enumC53159NfE = new EnumC53159NfE("ABSOLUTE", 0);
        A02 = enumC53159NfE;
        EnumC53159NfE enumC53159NfE2 = new EnumC53159NfE("TOP_LEFT", 1);
        A05 = enumC53159NfE2;
        EnumC53159NfE enumC53159NfE3 = new EnumC53159NfE("TOP_RIGHT", 2);
        A06 = enumC53159NfE3;
        EnumC53159NfE enumC53159NfE4 = new EnumC53159NfE("BOTTOM_LEFT", 3);
        A03 = enumC53159NfE4;
        EnumC53159NfE enumC53159NfE5 = new EnumC53159NfE("BOTTOM_RIGHT", 4);
        A04 = enumC53159NfE5;
        EnumC53159NfE[] enumC53159NfEArr = {enumC53159NfE, enumC53159NfE2, enumC53159NfE3, enumC53159NfE4, enumC53159NfE5};
        A01 = enumC53159NfEArr;
        A00 = AbstractC12190kN.A00(enumC53159NfEArr);
    }

    public static EnumC53159NfE valueOf(String str) {
        return (EnumC53159NfE) Enum.valueOf(EnumC53159NfE.class, str);
    }

    public static EnumC53159NfE[] values() {
        return (EnumC53159NfE[]) A01.clone();
    }

    public EnumC53159NfE(String str, int i) {
    }
}
