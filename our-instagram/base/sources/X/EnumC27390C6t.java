package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27390C6t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27390C6t[] A01;
    public static final EnumC27390C6t A02;
    public static final EnumC27390C6t A03;
    public static final EnumC27390C6t A04;
    public static final EnumC27390C6t A05;
    public static final EnumC27390C6t A06;

    static {
        EnumC27390C6t enumC27390C6t = new EnumC27390C6t("BUTTON_DISABLED_OPACITY", 0);
        A02 = enumC27390C6t;
        EnumC27390C6t enumC27390C6t2 = new EnumC27390C6t("GLIMMER_MAX_OPACITY", 1);
        A03 = enumC27390C6t2;
        EnumC27390C6t enumC27390C6t3 = new EnumC27390C6t("GLIMMER_MIN_OPACITY", 2);
        A04 = enumC27390C6t3;
        EnumC27390C6t enumC27390C6t4 = new EnumC27390C6t("GLIMMER_ON_WHITE_BACKGROUND_MAX_OPACITY", 3);
        A05 = enumC27390C6t4;
        EnumC27390C6t enumC27390C6t5 = new EnumC27390C6t("GLIMMER_ON_WHITE_BACKGROUND_MIN_OPACITY", 4);
        A06 = enumC27390C6t5;
        EnumC27390C6t[] enumC27390C6tArr = {enumC27390C6t, enumC27390C6t2, enumC27390C6t3, enumC27390C6t4, enumC27390C6t5, new EnumC27390C6t("GRADIENT_OPACITY", 5)};
        A01 = enumC27390C6tArr;
        A00 = AbstractC12190kN.A00(enumC27390C6tArr);
    }

    public static EnumC27390C6t valueOf(String str) {
        return (EnumC27390C6t) Enum.valueOf(EnumC27390C6t.class, str);
    }

    public static EnumC27390C6t[] values() {
        return (EnumC27390C6t[]) A01.clone();
    }

    public EnumC27390C6t(String str, int i) {
    }
}
