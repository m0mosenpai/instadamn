package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC75183Zl {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC75183Zl[] A02;
    public static final EnumC75183Zl A03;
    public static final EnumC75183Zl A04;
    public static final EnumC75183Zl A05;
    public static final EnumC75183Zl A06;
    public final int A00;

    static {
        EnumC75183Zl enumC75183Zl = new EnumC75183Zl("Original", 0, 0);
        A04 = enumC75183Zl;
        EnumC75183Zl enumC75183Zl2 = new EnumC75183Zl("Translated", 1, 1);
        A06 = enumC75183Zl2;
        EnumC75183Zl enumC75183Zl3 = new EnumC75183Zl("Loading", 2, 2);
        A03 = enumC75183Zl3;
        EnumC75183Zl enumC75183Zl4 = new EnumC75183Zl("PartiallyTranslated", 3, 3);
        A05 = enumC75183Zl4;
        EnumC75183Zl[] enumC75183ZlArr = {enumC75183Zl, enumC75183Zl2, enumC75183Zl3, enumC75183Zl4};
        A02 = enumC75183ZlArr;
        A01 = AbstractC12190kN.A00(enumC75183ZlArr);
    }

    public static EnumC75183Zl valueOf(String str) {
        return (EnumC75183Zl) Enum.valueOf(EnumC75183Zl.class, str);
    }

    public static EnumC75183Zl[] values() {
        return (EnumC75183Zl[]) A02.clone();
    }

    public EnumC75183Zl(String str, int i, int i2) {
        this.A00 = i2;
    }
}
