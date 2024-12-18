package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC110554yS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC110554yS[] A01;
    public static final EnumC110554yS A02;
    public static final EnumC110554yS A03;

    static {
        EnumC110554yS enumC110554yS = new EnumC110554yS("FULL", 0);
        A03 = enumC110554yS;
        EnumC110554yS enumC110554yS2 = new EnumC110554yS("CONDENSED", 1);
        A02 = enumC110554yS2;
        EnumC110554yS[] enumC110554ySArr = {enumC110554yS, enumC110554yS2};
        A01 = enumC110554ySArr;
        A00 = AbstractC12190kN.A00(enumC110554ySArr);
    }

    public static EnumC110554yS valueOf(String str) {
        return (EnumC110554yS) Enum.valueOf(EnumC110554yS.class, str);
    }

    public static EnumC110554yS[] values() {
        return (EnumC110554yS[]) A01.clone();
    }

    public EnumC110554yS(String str, int i) {
    }
}
