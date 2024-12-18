package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.89l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1829089l {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC1829089l[] A01;
    public static final EnumC1829089l A02;
    public static final EnumC1829089l A03;
    public static final EnumC1829089l A04;
    public static final EnumC1829089l A05;

    static {
        EnumC1829089l enumC1829089l = new EnumC1829089l("DOWNLOADING", 0);
        A02 = enumC1829089l;
        EnumC1829089l enumC1829089l2 = new EnumC1829089l("SUCCESS", 1);
        A04 = enumC1829089l2;
        EnumC1829089l enumC1829089l3 = new EnumC1829089l("FAILURE", 2);
        A03 = enumC1829089l3;
        EnumC1829089l enumC1829089l4 = new EnumC1829089l("UNSET", 3);
        A05 = enumC1829089l4;
        EnumC1829089l[] enumC1829089lArr = {enumC1829089l, enumC1829089l2, enumC1829089l3, enumC1829089l4};
        A01 = enumC1829089lArr;
        A00 = AbstractC12190kN.A00(enumC1829089lArr);
    }

    public static EnumC1829089l valueOf(String str) {
        return (EnumC1829089l) Enum.valueOf(EnumC1829089l.class, str);
    }

    public static EnumC1829089l[] values() {
        return (EnumC1829089l[]) A01.clone();
    }

    public EnumC1829089l(String str, int i) {
    }
}
