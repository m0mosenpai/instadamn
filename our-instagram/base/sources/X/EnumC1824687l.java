package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.87l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1824687l {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1824687l[] A01;
    public static final EnumC1824687l A02;
    public static final EnumC1824687l A03;
    public static final EnumC1824687l A04;
    public static final EnumC1824687l A05;

    static {
        EnumC1824687l enumC1824687l = new EnumC1824687l("NULL_CONTENT", 0);
        A05 = enumC1824687l;
        EnumC1824687l enumC1824687l2 = new EnumC1824687l("LOADING", 1);
        A03 = enumC1824687l2;
        EnumC1824687l enumC1824687l3 = new EnumC1824687l("DISPLAY_CONTENT", 2);
        A02 = enumC1824687l3;
        EnumC1824687l enumC1824687l4 = new EnumC1824687l("NOT_FOUND", 3);
        A04 = enumC1824687l4;
        EnumC1824687l[] enumC1824687lArr = {enumC1824687l, enumC1824687l2, enumC1824687l3, enumC1824687l4};
        A01 = enumC1824687lArr;
        A00 = AbstractC12190kN.A00(enumC1824687lArr);
    }

    public static EnumC1824687l valueOf(String str) {
        return (EnumC1824687l) Enum.valueOf(EnumC1824687l.class, str);
    }

    public static EnumC1824687l[] values() {
        return (EnumC1824687l[]) A01.clone();
    }

    public EnumC1824687l(String str, int i) {
    }
}
