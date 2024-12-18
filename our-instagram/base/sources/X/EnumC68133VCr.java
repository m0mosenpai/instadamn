package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68133VCr {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68133VCr[] A01;
    public static final EnumC68133VCr A02;
    public static final EnumC68133VCr A03;
    public static final EnumC68133VCr A04;

    static {
        EnumC68133VCr enumC68133VCr = new EnumC68133VCr("OTC", 0);
        A03 = enumC68133VCr;
        EnumC68133VCr enumC68133VCr2 = new EnumC68133VCr("NON_OTC", 1);
        A02 = enumC68133VCr2;
        EnumC68133VCr enumC68133VCr3 = new EnumC68133VCr("OTC_AND_NON_OTC", 2);
        A04 = enumC68133VCr3;
        EnumC68133VCr[] enumC68133VCrArr = {enumC68133VCr, enumC68133VCr2, enumC68133VCr3};
        A01 = enumC68133VCrArr;
        A00 = AbstractC12190kN.A00(enumC68133VCrArr);
    }

    public static EnumC68133VCr valueOf(String str) {
        return (EnumC68133VCr) Enum.valueOf(EnumC68133VCr.class, str);
    }

    public static EnumC68133VCr[] values() {
        return (EnumC68133VCr[]) A01.clone();
    }

    public EnumC68133VCr(String str, int i) {
    }
}
