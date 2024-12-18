package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC85073qv {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC85073qv[] A02;
    public static final EnumC85073qv A03;
    public static final EnumC85073qv A04;
    public static final EnumC85073qv A05;
    public static final EnumC85073qv A06;
    public final Integer A00;

    static {
        EnumC85073qv enumC85073qv = new EnumC85073qv("DEFAULT", 0, null);
        A03 = enumC85073qv;
        EnumC85073qv enumC85073qv2 = new EnumC85073qv("VARIANT1", 1, Integer.valueOf(R.color.carouselIndicatorCustomInActiveColorVariant1));
        A04 = enumC85073qv2;
        EnumC85073qv enumC85073qv3 = new EnumC85073qv("VARIANT2", 2, Integer.valueOf(R.color.carouselIndicatorCustomInActiveColorVariant2));
        A05 = enumC85073qv3;
        EnumC85073qv enumC85073qv4 = new EnumC85073qv("VARIANT3", 3, Integer.valueOf(R.color.carouselIndicatorCustomInActiveColorVariant3));
        A06 = enumC85073qv4;
        EnumC85073qv[] enumC85073qvArr = {enumC85073qv, enumC85073qv2, enumC85073qv3, enumC85073qv4};
        A02 = enumC85073qvArr;
        A01 = AbstractC12190kN.A00(enumC85073qvArr);
    }

    public static EnumC85073qv valueOf(String str) {
        return (EnumC85073qv) Enum.valueOf(EnumC85073qv.class, str);
    }

    public static EnumC85073qv[] values() {
        return (EnumC85073qv[]) A02.clone();
    }

    public EnumC85073qv(String str, int i, Integer num) {
        this.A00 = num;
    }
}
