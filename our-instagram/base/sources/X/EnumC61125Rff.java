package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rff, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61125Rff {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61125Rff[] A01;
    public static final EnumC61125Rff A02;
    public static final EnumC61125Rff A03;
    public static final EnumC61125Rff A04;
    public static final EnumC61125Rff A05;

    static {
        EnumC61125Rff enumC61125Rff = new EnumC61125Rff("InvalidInput", 0);
        A03 = enumC61125Rff;
        EnumC61125Rff enumC61125Rff2 = new EnumC61125Rff("ValidInput", 1);
        A05 = enumC61125Rff2;
        EnumC61125Rff enumC61125Rff3 = new EnumC61125Rff("OperationInProgress", 2);
        A04 = enumC61125Rff3;
        EnumC61125Rff enumC61125Rff4 = new EnumC61125Rff("Error", 3);
        A02 = enumC61125Rff4;
        EnumC61125Rff[] enumC61125RffArr = {enumC61125Rff, enumC61125Rff2, enumC61125Rff3, enumC61125Rff4};
        A01 = enumC61125RffArr;
        A00 = AbstractC12190kN.A00(enumC61125RffArr);
    }

    public static EnumC61125Rff valueOf(String str) {
        return (EnumC61125Rff) Enum.valueOf(EnumC61125Rff.class, str);
    }

    public static EnumC61125Rff[] values() {
        return (EnumC61125Rff[]) A01.clone();
    }

    public EnumC61125Rff(String str, int i) {
    }
}
