package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27370C5z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27370C5z[] A01;
    public static final EnumC27370C5z A02;
    public static final EnumC27370C5z A03;

    static {
        EnumC27370C5z enumC27370C5z = new EnumC27370C5z("TRY_IT", 0);
        A03 = enumC27370C5z;
        EnumC27370C5z enumC27370C5z2 = new EnumC27370C5z("NOT_NOW", 1);
        A02 = enumC27370C5z2;
        EnumC27370C5z[] enumC27370C5zArr = {enumC27370C5z, enumC27370C5z2};
        A01 = enumC27370C5zArr;
        A00 = AbstractC12190kN.A00(enumC27370C5zArr);
    }

    public static EnumC27370C5z valueOf(String str) {
        return (EnumC27370C5z) Enum.valueOf(EnumC27370C5z.class, str);
    }

    public static EnumC27370C5z[] values() {
        return (EnumC27370C5z[]) A01.clone();
    }

    public EnumC27370C5z(String str, int i) {
    }
}
