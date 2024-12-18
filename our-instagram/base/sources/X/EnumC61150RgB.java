package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61150RgB {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61150RgB[] A02;
    public static final EnumC61150RgB A03;
    public static final EnumC61150RgB A04;
    public static final EnumC61150RgB A05;
    public final int A00;

    public static EnumC61150RgB valueOf(String str) {
        return (EnumC61150RgB) Enum.valueOf(EnumC61150RgB.class, str);
    }

    public static EnumC61150RgB[] values() {
        return (EnumC61150RgB[]) A02.clone();
    }

    static {
        EnumC61150RgB enumC61150RgB = new EnumC61150RgB("ACTIVE", 0, 0);
        A03 = enumC61150RgB;
        EnumC61150RgB enumC61150RgB2 = new EnumC61150RgB("PASSIVE", 1, 1);
        A04 = enumC61150RgB2;
        EnumC61150RgB enumC61150RgB3 = new EnumC61150RgB("STALE", 2, 2);
        A05 = enumC61150RgB3;
        EnumC61150RgB[] enumC61150RgBArr = {enumC61150RgB, enumC61150RgB2, enumC61150RgB3};
        A02 = enumC61150RgBArr;
        A01 = AbstractC12190kN.A00(enumC61150RgBArr);
    }

    public EnumC61150RgB(String str, int i, int i2) {
        this.A00 = i2;
    }
}
