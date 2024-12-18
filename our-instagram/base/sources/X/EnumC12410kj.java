package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC12410kj {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC12410kj[] A02;
    public static final EnumC12410kj A03;
    public static final EnumC12410kj A04;
    public static final EnumC12410kj A05;
    public static final EnumC12410kj A06;
    public static final EnumC12410kj A07;
    public static final EnumC12410kj A08;
    public static final EnumC12410kj A09;
    public static final EnumC12410kj A0A;
    public static final EnumC12410kj A0B;
    public final Integer A00;

    static {
        EnumC12410kj enumC12410kj = new EnumC12410kj("LOGGING", 0, C05F.A00);
        A09 = enumC12410kj;
        EnumC12410kj enumC12410kj2 = new EnumC12410kj("MEDIUM_SEVERITY", 1, C05F.A01);
        A0A = enumC12410kj2;
        EnumC12410kj enumC12410kj3 = new EnumC12410kj("HIGH_SEVERITY", 2, C05F.A0C);
        A07 = enumC12410kj3;
        EnumC12410kj enumC12410kj4 = new EnumC12410kj("EXTREME_SEVERITY", 3, C05F.A0N);
        A04 = enumC12410kj4;
        EnumC12410kj enumC12410kj5 = new EnumC12410kj("CRASH_LIKE", 4, C05F.A0Y);
        A03 = enumC12410kj5;
        EnumC12410kj enumC12410kj6 = new EnumC12410kj("FAIL_FUNCTIONAL", 5, C05F.A0j);
        A06 = enumC12410kj6;
        EnumC12410kj enumC12410kj7 = new EnumC12410kj("FAIL_CONTENT_CREATION", 6, C05F.A0u);
        A05 = enumC12410kj7;
        EnumC12410kj enumC12410kj8 = new EnumC12410kj("PRIVACY", 7, C05F.A15);
        A0B = enumC12410kj8;
        EnumC12410kj enumC12410kj9 = new EnumC12410kj("LEGACY", 8, C05F.A1F);
        A08 = enumC12410kj9;
        EnumC12410kj[] enumC12410kjArr = {enumC12410kj, enumC12410kj2, enumC12410kj3, enumC12410kj4, enumC12410kj5, enumC12410kj6, enumC12410kj7, enumC12410kj8, enumC12410kj9, new EnumC12410kj("LEGACY_FAIL_HARDER", 9, C05F.A1I)};
        A02 = enumC12410kjArr;
        A01 = AbstractC12190kN.A00(enumC12410kjArr);
    }

    public static EnumC12410kj valueOf(String str) {
        return (EnumC12410kj) Enum.valueOf(EnumC12410kj.class, str);
    }

    public static EnumC12410kj[] values() {
        return (EnumC12410kj[]) A02.clone();
    }

    public EnumC12410kj(String str, int i, Integer num) {
        this.A00 = num;
    }
}
