package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53214NgC {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53214NgC[] A02;
    public static final EnumC53214NgC A03;
    public static final EnumC53214NgC A04;
    public static final EnumC53214NgC A05;
    public final Integer A00;

    public static EnumC53214NgC valueOf(String str) {
        return (EnumC53214NgC) Enum.valueOf(EnumC53214NgC.class, str);
    }

    public static EnumC53214NgC[] values() {
        return (EnumC53214NgC[]) A02.clone();
    }

    static {
        EnumC53214NgC enumC53214NgC = new EnumC53214NgC("DIRECT", 0, 2131973315);
        A03 = enumC53214NgC;
        EnumC53214NgC enumC53214NgC2 = new EnumC53214NgC("SHARE", 1, null);
        A05 = enumC53214NgC2;
        EnumC53214NgC enumC53214NgC3 = new EnumC53214NgC("LINK", 2, 2131966814);
        A04 = enumC53214NgC3;
        EnumC53214NgC[] enumC53214NgCArr = {enumC53214NgC, enumC53214NgC2, enumC53214NgC3};
        A02 = enumC53214NgCArr;
        A01 = AbstractC12190kN.A00(enumC53214NgCArr);
    }

    public EnumC53214NgC(String str, int i, Integer num) {
        this.A00 = num;
    }
}
