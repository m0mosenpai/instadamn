package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222979sc {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222979sc[] A02;
    public static final EnumC222979sc A03;
    public static final EnumC222979sc A04;
    public static final EnumC222979sc A05;
    public static final EnumC222979sc A06;
    public static final EnumC222979sc A07;
    public static final EnumC222979sc A08;
    public static final EnumC222979sc A09;
    public static final EnumC222979sc A0A;
    public static final EnumC222979sc A0B;
    public final Integer A00;

    static {
        Integer num = C05F.A01;
        EnumC222979sc enumC222979sc = new EnumC222979sc("LOW_MEMORY", 0, num);
        A07 = enumC222979sc;
        EnumC222979sc enumC222979sc2 = new EnumC222979sc("OOM", 1, num);
        A09 = enumC222979sc2;
        EnumC222979sc enumC222979sc3 = new EnumC222979sc("NO_PERMISSION", 2, num);
        A08 = enumC222979sc3;
        EnumC222979sc enumC222979sc4 = new EnumC222979sc("FEATURE_NOT_ENABLED", 3, num);
        A05 = enumC222979sc4;
        EnumC222979sc enumC222979sc5 = new EnumC222979sc("EXCEPTION", 4, num);
        A04 = enumC222979sc5;
        EnumC222979sc enumC222979sc6 = new EnumC222979sc("UNKNOWN", 5, num);
        A0B = enumC222979sc6;
        Integer num2 = C05F.A00;
        EnumC222979sc enumC222979sc7 = new EnumC222979sc("STOPPED", 6, num2);
        A0A = enumC222979sc7;
        EnumC222979sc enumC222979sc8 = new EnumC222979sc("ITEM_SCAN_LIMIT_REACHED", 7, num2);
        A06 = enumC222979sc8;
        EnumC222979sc enumC222979sc9 = new EnumC222979sc("COMPLETED", 8, num2);
        A03 = enumC222979sc9;
        EnumC222979sc[] enumC222979scArr = {enumC222979sc, enumC222979sc2, enumC222979sc3, enumC222979sc4, enumC222979sc5, enumC222979sc6, enumC222979sc7, enumC222979sc8, enumC222979sc9};
        A02 = enumC222979scArr;
        A01 = AbstractC12190kN.A00(enumC222979scArr);
    }

    public static EnumC222979sc valueOf(String str) {
        return (EnumC222979sc) Enum.valueOf(EnumC222979sc.class, str);
    }

    public static EnumC222979sc[] values() {
        return (EnumC222979sc[]) A02.clone();
    }

    public EnumC222979sc(String str, int i, Integer num) {
        this.A00 = num;
    }
}
