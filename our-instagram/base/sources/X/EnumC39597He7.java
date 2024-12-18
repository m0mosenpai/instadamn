package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.He7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39597He7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39597He7[] A01;
    public static final EnumC39597He7 A02;
    public static final EnumC39597He7 A03;
    public static final EnumC39597He7 A04;
    public static final EnumC39597He7 A05;
    public static final EnumC39597He7 A06;
    public static final EnumC39597He7 A07;
    public static final EnumC39597He7 A08;
    public static final EnumC39597He7 A09;
    public static final EnumC39597He7 A0A;
    public static final EnumC39597He7 A0B;
    public static final EnumC39597He7 A0C;
    public static final EnumC39597He7 A0D;

    static {
        EnumC39597He7 enumC39597He7 = new EnumC39597He7("NOT_BOOSTED", 0);
        A07 = enumC39597He7;
        EnumC39597He7 enumC39597He72 = new EnumC39597He7("PENDING", 1);
        A0A = enumC39597He72;
        EnumC39597He7 enumC39597He73 = new EnumC39597He7("BOOSTED", 2);
        A02 = enumC39597He73;
        EnumC39597He7 enumC39597He74 = new EnumC39597He7("BOOSTED_ELIGIBLE", 3);
        A03 = enumC39597He74;
        EnumC39597He7 enumC39597He75 = new EnumC39597He7("NOT_APPROVED", 4);
        A06 = enumC39597He75;
        EnumC39597He7 enumC39597He76 = new EnumC39597He7("FINISHED", 5);
        A05 = enumC39597He76;
        EnumC39597He7 enumC39597He77 = new EnumC39597He7("UNAVAILABLE", 6);
        A0C = enumC39597He77;
        EnumC39597He7 enumC39597He78 = new EnumC39597He7("DRAFT", 7);
        A04 = enumC39597He78;
        EnumC39597He7 enumC39597He79 = new EnumC39597He7("PAUSED", 8);
        A09 = enumC39597He79;
        EnumC39597He7 enumC39597He710 = new EnumC39597He7("NOT_DELIVERING", 9);
        A08 = enumC39597He710;
        EnumC39597He7 enumC39597He711 = new EnumC39597He7("SCHEDULED", 10);
        A0B = enumC39597He711;
        EnumC39597He7 enumC39597He712 = new EnumC39597He7("UNKNOWN", 11);
        A0D = enumC39597He712;
        EnumC39597He7[] enumC39597He7Arr = {enumC39597He7, enumC39597He72, enumC39597He73, enumC39597He74, enumC39597He75, enumC39597He76, enumC39597He77, enumC39597He78, enumC39597He79, enumC39597He710, enumC39597He711, enumC39597He712};
        A01 = enumC39597He7Arr;
        A00 = AbstractC12190kN.A00(enumC39597He7Arr);
    }

    public static EnumC39597He7 valueOf(String str) {
        return (EnumC39597He7) Enum.valueOf(EnumC39597He7.class, str);
    }

    public static EnumC39597He7[] values() {
        return (EnumC39597He7[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }

    public EnumC39597He7(String str, int i) {
    }
}
