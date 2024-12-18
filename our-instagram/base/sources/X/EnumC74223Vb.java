package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74223Vb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC74223Vb[] A01;
    public static final EnumC74223Vb A02;
    public static final EnumC74223Vb A03;
    public static final EnumC74223Vb A04;
    public static final EnumC74223Vb A05;
    public static final EnumC74223Vb A06;

    static {
        EnumC74223Vb enumC74223Vb = new EnumC74223Vb("BIAS_START", 0);
        A06 = enumC74223Vb;
        EnumC74223Vb enumC74223Vb2 = new EnumC74223Vb("BIAS_CENTER", 1);
        A03 = enumC74223Vb2;
        EnumC74223Vb enumC74223Vb3 = new EnumC74223Vb("BIAS_END", 2);
        A04 = enumC74223Vb3;
        EnumC74223Vb enumC74223Vb4 = new EnumC74223Vb("BIAS_FORWARD", 3);
        A05 = enumC74223Vb4;
        EnumC74223Vb enumC74223Vb5 = new EnumC74223Vb("BIAS_ADAPTIVE", 4);
        A02 = enumC74223Vb5;
        EnumC74223Vb[] enumC74223VbArr = {enumC74223Vb, enumC74223Vb2, enumC74223Vb3, enumC74223Vb4, enumC74223Vb5};
        A01 = enumC74223VbArr;
        A00 = AbstractC12190kN.A00(enumC74223VbArr);
    }

    public static EnumC74223Vb valueOf(String str) {
        return (EnumC74223Vb) Enum.valueOf(EnumC74223Vb.class, str);
    }

    public static EnumC74223Vb[] values() {
        return (EnumC74223Vb[]) A01.clone();
    }

    public EnumC74223Vb(String str, int i) {
    }
}
