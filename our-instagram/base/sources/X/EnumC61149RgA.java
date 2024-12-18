package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61149RgA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61149RgA[] A02;
    public static final EnumC61149RgA A03;
    public static final EnumC61149RgA A04;
    public static final EnumC61149RgA A05;
    public final String A00;

    static {
        EnumC61149RgA enumC61149RgA = new EnumC61149RgA("OPT_IN", 0, "opt_in");
        A04 = enumC61149RgA;
        EnumC61149RgA enumC61149RgA2 = new EnumC61149RgA("NOT_OPT_IN", 1, "not_opt_in");
        A03 = enumC61149RgA2;
        EnumC61149RgA enumC61149RgA3 = new EnumC61149RgA("OPT_OUT", 2, "opt_out");
        A05 = enumC61149RgA3;
        EnumC61149RgA[] enumC61149RgAArr = {enumC61149RgA, enumC61149RgA2, enumC61149RgA3};
        A02 = enumC61149RgAArr;
        A01 = AbstractC12190kN.A00(enumC61149RgAArr);
    }

    public static EnumC61149RgA valueOf(String str) {
        return (EnumC61149RgA) Enum.valueOf(EnumC61149RgA.class, str);
    }

    public static EnumC61149RgA[] values() {
        return (EnumC61149RgA[]) A02.clone();
    }

    public EnumC61149RgA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
