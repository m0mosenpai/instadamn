package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53257Ngv {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53257Ngv[] A03;
    public static final EnumC53257Ngv A04;
    public static final EnumC53257Ngv A05;
    public static final EnumC53257Ngv A06;
    public static final EnumC53257Ngv A07;
    public static final EnumC53257Ngv A08;
    public static final EnumC53257Ngv A09;
    public final float A00;
    public final boolean A01;

    static {
        EnumC53257Ngv enumC53257Ngv = new EnumC53257Ngv("ROUNDED_RECT", 16.0f, 0, false);
        A08 = enumC53257Ngv;
        EnumC53257Ngv enumC53257Ngv2 = new EnumC53257Ngv("ROUNDED_RECT_COMPACT", 16.0f, 1, true);
        A09 = enumC53257Ngv2;
        EnumC53257Ngv enumC53257Ngv3 = new EnumC53257Ngv("ICON", 16.0f, 2, false);
        A04 = enumC53257Ngv3;
        EnumC53257Ngv enumC53257Ngv4 = new EnumC53257Ngv("ICON_COMPACT", 16.0f, 3, false);
        A05 = enumC53257Ngv4;
        EnumC53257Ngv enumC53257Ngv5 = new EnumC53257Ngv("ICON_ONLY", 16.0f, 4, false);
        A06 = enumC53257Ngv5;
        EnumC53257Ngv enumC53257Ngv6 = new EnumC53257Ngv("PILL", 500.0f, 5, false);
        A07 = enumC53257Ngv6;
        EnumC53257Ngv[] enumC53257NgvArr = {enumC53257Ngv, enumC53257Ngv2, enumC53257Ngv3, enumC53257Ngv4, enumC53257Ngv5, enumC53257Ngv6};
        A03 = enumC53257NgvArr;
        A02 = AbstractC12190kN.A00(enumC53257NgvArr);
    }

    public static EnumC53257Ngv valueOf(String str) {
        return (EnumC53257Ngv) Enum.valueOf(EnumC53257Ngv.class, str);
    }

    public static EnumC53257Ngv[] values() {
        return (EnumC53257Ngv[]) A03.clone();
    }

    public EnumC53257Ngv(String str, float f, int i, boolean z) {
        this.A00 = f;
        this.A01 = z;
    }
}
