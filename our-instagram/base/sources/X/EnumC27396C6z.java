package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27396C6z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27396C6z[] A01;
    public static final EnumC27396C6z A02;
    public static final EnumC27396C6z A03;
    public static final EnumC27396C6z A04;
    public static final EnumC27396C6z A05;
    public static final EnumC27396C6z A06;

    static {
        EnumC27396C6z enumC27396C6z = new EnumC27396C6z("EMPTY", 0);
        A03 = enumC27396C6z;
        EnumC27396C6z enumC27396C6z2 = new EnumC27396C6z("VALID", 1);
        A06 = enumC27396C6z2;
        EnumC27396C6z enumC27396C6z3 = new EnumC27396C6z("INVALID", 2);
        A04 = enumC27396C6z3;
        EnumC27396C6z enumC27396C6z4 = new EnumC27396C6z("SCHOOL_NOT_FOUND", 3);
        A05 = enumC27396C6z4;
        EnumC27396C6z enumC27396C6z5 = new EnumC27396C6z("EMAIL_IN_USE", 4);
        A02 = enumC27396C6z5;
        EnumC27396C6z[] enumC27396C6zArr = {enumC27396C6z, enumC27396C6z2, enumC27396C6z3, enumC27396C6z4, enumC27396C6z5};
        A01 = enumC27396C6zArr;
        A00 = AbstractC12190kN.A00(enumC27396C6zArr);
    }

    public static EnumC27396C6z valueOf(String str) {
        return (EnumC27396C6z) Enum.valueOf(EnumC27396C6z.class, str);
    }

    public static EnumC27396C6z[] values() {
        return (EnumC27396C6z[]) A01.clone();
    }

    public EnumC27396C6z(String str, int i) {
    }
}
