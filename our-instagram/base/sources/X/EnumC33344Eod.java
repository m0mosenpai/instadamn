package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eod, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33344Eod {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33344Eod[] A01;
    public static final EnumC33344Eod A02;
    public static final EnumC33344Eod A03;
    public static final EnumC33344Eod A04;
    public static final EnumC33344Eod A05;

    static {
        EnumC33344Eod enumC33344Eod = new EnumC33344Eod("ACTIVATION_NUX", 0);
        A02 = enumC33344Eod;
        EnumC33344Eod enumC33344Eod2 = new EnumC33344Eod("ENGAGEMENT_NUX", 1);
        A05 = enumC33344Eod2;
        EnumC33344Eod enumC33344Eod3 = new EnumC33344Eod("BEST_PRACTICES", 2);
        A03 = enumC33344Eod3;
        EnumC33344Eod enumC33344Eod4 = new EnumC33344Eod("CHANNEL_PERFORMANCE", 3);
        A04 = enumC33344Eod4;
        EnumC33344Eod[] enumC33344EodArr = {enumC33344Eod, enumC33344Eod2, enumC33344Eod3, enumC33344Eod4};
        A01 = enumC33344EodArr;
        A00 = AbstractC12190kN.A00(enumC33344EodArr);
    }

    public static EnumC33344Eod valueOf(String str) {
        return (EnumC33344Eod) Enum.valueOf(EnumC33344Eod.class, str);
    }

    public static EnumC33344Eod[] values() {
        return (EnumC33344Eod[]) A01.clone();
    }

    public EnumC33344Eod(String str, int i) {
    }
}
