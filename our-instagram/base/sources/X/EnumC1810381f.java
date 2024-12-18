package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.81f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1810381f {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1810381f[] A01;
    public static final EnumC1810381f A02;
    public static final EnumC1810381f A03;
    public static final EnumC1810381f A04;
    public static final EnumC1810381f A05;

    static {
        EnumC1810381f enumC1810381f = new EnumC1810381f("UNINITIALIZED", 0);
        A05 = enumC1810381f;
        EnumC1810381f enumC1810381f2 = new EnumC1810381f("PRE_CAPTURE", 1);
        A03 = enumC1810381f2;
        EnumC1810381f enumC1810381f3 = new EnumC1810381f("POST_CAPTURE", 2);
        A02 = enumC1810381f3;
        EnumC1810381f enumC1810381f4 = new EnumC1810381f("SUB_FRAGMENT", 3);
        A04 = enumC1810381f4;
        EnumC1810381f[] enumC1810381fArr = {enumC1810381f, enumC1810381f2, enumC1810381f3, enumC1810381f4};
        A01 = enumC1810381fArr;
        A00 = AbstractC12190kN.A00(enumC1810381fArr);
    }

    public static EnumC1810381f valueOf(String str) {
        return (EnumC1810381f) Enum.valueOf(EnumC1810381f.class, str);
    }

    public static EnumC1810381f[] values() {
        return (EnumC1810381f[]) A01.clone();
    }

    public EnumC1810381f(String str, int i) {
    }
}
