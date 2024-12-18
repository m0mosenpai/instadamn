package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC64852wj {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC64852wj[] A02;
    public static final EnumC64852wj A03;
    public final Integer A00;

    static {
        EnumC64852wj enumC64852wj = new EnumC64852wj("FEED_PRODUCT_PIVOTS", 0, C05F.A00);
        A03 = enumC64852wj;
        EnumC64852wj[] enumC64852wjArr = {enumC64852wj, new EnumC64852wj("SHOPPING_HOME_PRODUCT_HSCROLL", 1, C05F.A15)};
        A02 = enumC64852wjArr;
        A01 = AbstractC12190kN.A00(enumC64852wjArr);
    }

    public static EnumC64852wj valueOf(String str) {
        return (EnumC64852wj) Enum.valueOf(EnumC64852wj.class, str);
    }

    public static EnumC64852wj[] values() {
        return (EnumC64852wj[]) A02.clone();
    }

    public EnumC64852wj(String str, int i, Integer num) {
        this.A00 = num;
    }
}
