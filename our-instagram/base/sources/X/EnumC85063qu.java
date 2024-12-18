package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC85063qu {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC85063qu[] A02;
    public static final EnumC85063qu A03;
    public static final EnumC85063qu A04;
    public static final EnumC85063qu A05;
    public final Integer A00;

    static {
        EnumC85063qu enumC85063qu = new EnumC85063qu("DEFAULT", 0, null);
        A03 = enumC85063qu;
        EnumC85063qu enumC85063qu2 = new EnumC85063qu("VARIANT1", 1, Integer.valueOf(R.color.carouselIndicatorCustomActiveColorVariant1));
        A04 = enumC85063qu2;
        EnumC85063qu enumC85063qu3 = new EnumC85063qu("VARIANT2", 2, Integer.valueOf(R.color.carouselIndicatorCustomActiveColorVariant2));
        A05 = enumC85063qu3;
        EnumC85063qu[] enumC85063quArr = {enumC85063qu, enumC85063qu2, enumC85063qu3};
        A02 = enumC85063quArr;
        A01 = AbstractC12190kN.A00(enumC85063quArr);
    }

    public static EnumC85063qu valueOf(String str) {
        return (EnumC85063qu) Enum.valueOf(EnumC85063qu.class, str);
    }

    public static EnumC85063qu[] values() {
        return (EnumC85063qu[]) A02.clone();
    }

    public EnumC85063qu(String str, int i, Integer num) {
        this.A00 = num;
    }
}
