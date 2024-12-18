package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39591He1 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39591He1[] A03;
    public static final EnumC39591He1 A04;
    public static final EnumC39591He1 A05;
    public static final EnumC39591He1 A06;
    public static final EnumC39591He1 A07;
    public static final EnumC39591He1 A08;
    public final boolean A00;
    public final boolean A01;

    static {
        EnumC39591He1 enumC39591He1 = new EnumC39591He1("UNINITIALIZED", false, false, 0);
        A08 = enumC39591He1;
        EnumC39591He1 enumC39591He12 = new EnumC39591He1("SKIPPED", true, true, 1);
        A07 = enumC39591He12;
        EnumC39591He1 enumC39591He13 = new EnumC39591He1("LOADING", false, false, 2);
        A06 = enumC39591He13;
        EnumC39591He1 enumC39591He14 = new EnumC39591He1("LOADED", true, true, 3);
        A05 = enumC39591He14;
        EnumC39591He1 enumC39591He15 = new EnumC39591He1("FAILED", true, false, 4);
        A04 = enumC39591He15;
        EnumC39591He1[] enumC39591He1Arr = {enumC39591He1, enumC39591He12, enumC39591He13, enumC39591He14, enumC39591He15};
        A03 = enumC39591He1Arr;
        A02 = AbstractC12190kN.A00(enumC39591He1Arr);
    }

    public static EnumC39591He1 valueOf(String str) {
        return (EnumC39591He1) Enum.valueOf(EnumC39591He1.class, str);
    }

    public static EnumC39591He1[] values() {
        return (EnumC39591He1[]) A03.clone();
    }

    public EnumC39591He1(String str, boolean z, boolean z2, int i) {
        this.A00 = z;
        this.A01 = z2;
    }
}
