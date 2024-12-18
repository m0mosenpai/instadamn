package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC99714dp {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC99714dp[] A01;
    public static final EnumC99714dp A02;
    public static final EnumC99714dp A03;
    public static final EnumC99714dp A04;
    public static final EnumC99714dp A05;

    static {
        EnumC99714dp enumC99714dp = new EnumC99714dp("MEDIUM", 0);
        A04 = enumC99714dp;
        EnumC99714dp enumC99714dp2 = new EnumC99714dp("LARGE", 1);
        A03 = enumC99714dp2;
        EnumC99714dp enumC99714dp3 = new EnumC99714dp("COMPACT", 2);
        A02 = enumC99714dp3;
        EnumC99714dp enumC99714dp4 = new EnumC99714dp("UNKNOWN", 3);
        A05 = enumC99714dp4;
        EnumC99714dp[] enumC99714dpArr = {enumC99714dp, enumC99714dp2, enumC99714dp3, enumC99714dp4};
        A01 = enumC99714dpArr;
        A00 = AbstractC12190kN.A00(enumC99714dpArr);
    }

    public static EnumC99714dp valueOf(String str) {
        return (EnumC99714dp) Enum.valueOf(EnumC99714dp.class, str);
    }

    public static EnumC99714dp[] values() {
        return (EnumC99714dp[]) A01.clone();
    }

    public EnumC99714dp(String str, int i) {
    }
}
