package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72389XcP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72389XcP[] A02;
    public static final EnumC72389XcP A03;
    public static final EnumC72389XcP A04;
    public static final EnumC72389XcP A05;
    public final int A00;

    static {
        EnumC72389XcP enumC72389XcP = new EnumC72389XcP("STRING", 0, 0);
        A05 = enumC72389XcP;
        EnumC72389XcP enumC72389XcP2 = new EnumC72389XcP("INTEGER", 1, 1);
        A04 = enumC72389XcP2;
        EnumC72389XcP enumC72389XcP3 = new EnumC72389XcP("FLOAT", 2, 2);
        A03 = enumC72389XcP3;
        EnumC72389XcP[] enumC72389XcPArr = {enumC72389XcP, enumC72389XcP2, enumC72389XcP3};
        A02 = enumC72389XcPArr;
        A01 = AbstractC12190kN.A00(enumC72389XcPArr);
    }

    public static EnumC72389XcP valueOf(String str) {
        return (EnumC72389XcP) Enum.valueOf(EnumC72389XcP.class, str);
    }

    public static EnumC72389XcP[] values() {
        return (EnumC72389XcP[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                return "Float";
            }
            return "Integer";
        }
        return "String";
    }

    public EnumC72389XcP(String str, int i, int i2) {
        this.A00 = i2;
    }
}
