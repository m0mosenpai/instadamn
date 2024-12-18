package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC60772q1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC60772q1[] A01;
    public static final EnumC60772q1 A02;
    public static final EnumC60772q1 A03;
    public static final EnumC60772q1 A04;
    public static final EnumC60772q1 A05;

    static {
        EnumC60772q1 enumC60772q1 = new EnumC60772q1("DEFAULT", 0);
        A02 = enumC60772q1;
        EnumC60772q1 enumC60772q12 = new EnumC60772q1("TRANSPARENT", 1);
        A05 = enumC60772q12;
        EnumC60772q1 enumC60772q13 = new EnumC60772q1("FORCED_DARK_MODE", 2);
        A03 = enumC60772q13;
        EnumC60772q1 enumC60772q14 = new EnumC60772q1("PERSIST", 3);
        A04 = enumC60772q14;
        EnumC60772q1[] enumC60772q1Arr = {enumC60772q1, enumC60772q12, enumC60772q13, enumC60772q14, new EnumC60772q1("GONE", 4)};
        A01 = enumC60772q1Arr;
        A00 = AbstractC12190kN.A00(enumC60772q1Arr);
    }

    public static EnumC60772q1 valueOf(String str) {
        return (EnumC60772q1) Enum.valueOf(EnumC60772q1.class, str);
    }

    public static EnumC60772q1[] values() {
        return (EnumC60772q1[]) A01.clone();
    }

    public EnumC60772q1(String str, int i) {
    }
}
