package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27378C6h {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27378C6h[] A01;
    public static final EnumC27378C6h A02;
    public static final EnumC27378C6h A03;
    public static final EnumC27378C6h A04;
    public static final EnumC27378C6h A05;

    static {
        EnumC27378C6h enumC27378C6h = new EnumC27378C6h("LAUNCHED_FROM_CAMERA", 0);
        A02 = enumC27378C6h;
        EnumC27378C6h enumC27378C6h2 = new EnumC27378C6h("LAUNCHED_FROM_STORY_VIEWER", 1);
        A04 = enumC27378C6h2;
        EnumC27378C6h enumC27378C6h3 = new EnumC27378C6h("OVERFLOW_COMPOSER_IMAGINE", 2);
        A05 = enumC27378C6h3;
        EnumC27378C6h enumC27378C6h4 = new EnumC27378C6h("LAUNCHED_FROM_MEMU_IN_FEED", 3);
        A03 = enumC27378C6h4;
        EnumC27378C6h[] enumC27378C6hArr = {enumC27378C6h, enumC27378C6h2, enumC27378C6h3, enumC27378C6h4};
        A01 = enumC27378C6hArr;
        A00 = AbstractC12190kN.A00(enumC27378C6hArr);
    }

    public static EnumC27378C6h valueOf(String str) {
        return (EnumC27378C6h) Enum.valueOf(EnumC27378C6h.class, str);
    }

    public static EnumC27378C6h[] values() {
        return (EnumC27378C6h[]) A01.clone();
    }

    public EnumC27378C6h(String str, int i) {
    }
}
