package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC138936Qz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC138936Qz[] A01;
    public static final EnumC138936Qz A02;
    public static final EnumC138936Qz A03;
    public static final EnumC138936Qz A04;
    public static final EnumC138936Qz A05;
    public static final EnumC138936Qz A06;

    static {
        EnumC138936Qz enumC138936Qz = new EnumC138936Qz("MEDIA", 0);
        A04 = enumC138936Qz;
        EnumC138936Qz enumC138936Qz2 = new EnumC138936Qz("CAPTION", 1);
        A02 = enumC138936Qz2;
        EnumC138936Qz enumC138936Qz3 = new EnumC138936Qz("HEADLINE", 2);
        A03 = enumC138936Qz3;
        EnumC138936Qz enumC138936Qz4 = new EnumC138936Qz("PRODUCT_TAG", 3);
        A06 = enumC138936Qz4;
        EnumC138936Qz enumC138936Qz5 = new EnumC138936Qz("MULTI_AD_BOTTOM_BANNER", 4);
        A05 = enumC138936Qz5;
        EnumC138936Qz[] enumC138936QzArr = {enumC138936Qz, enumC138936Qz2, enumC138936Qz3, enumC138936Qz4, enumC138936Qz5};
        A01 = enumC138936QzArr;
        A00 = AbstractC12190kN.A00(enumC138936QzArr);
    }

    public static EnumC138936Qz valueOf(String str) {
        return (EnumC138936Qz) Enum.valueOf(EnumC138936Qz.class, str);
    }

    public static EnumC138936Qz[] values() {
        return (EnumC138936Qz[]) A01.clone();
    }

    public EnumC138936Qz(String str, int i) {
    }
}
