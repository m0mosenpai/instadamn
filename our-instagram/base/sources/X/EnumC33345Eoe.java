package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33345Eoe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33345Eoe[] A01;
    public static final EnumC33345Eoe A02;
    public static final EnumC33345Eoe A03;
    public static final EnumC33345Eoe A04;
    public static final EnumC33345Eoe A05;

    static {
        EnumC33345Eoe enumC33345Eoe = new EnumC33345Eoe("NOT_LOADING", 0);
        A04 = enumC33345Eoe;
        EnumC33345Eoe enumC33345Eoe2 = new EnumC33345Eoe("LOADING", 1);
        A02 = enumC33345Eoe2;
        EnumC33345Eoe enumC33345Eoe3 = new EnumC33345Eoe("LOADING_NEXT_PAGE", 2);
        A03 = enumC33345Eoe3;
        EnumC33345Eoe enumC33345Eoe4 = new EnumC33345Eoe("PTR", 3);
        A05 = enumC33345Eoe4;
        EnumC33345Eoe[] enumC33345EoeArr = {enumC33345Eoe, enumC33345Eoe2, enumC33345Eoe3, enumC33345Eoe4};
        A01 = enumC33345EoeArr;
        A00 = AbstractC12190kN.A00(enumC33345EoeArr);
    }

    public static EnumC33345Eoe valueOf(String str) {
        return (EnumC33345Eoe) Enum.valueOf(EnumC33345Eoe.class, str);
    }

    public static EnumC33345Eoe[] values() {
        return (EnumC33345Eoe[]) A01.clone();
    }

    public EnumC33345Eoe(String str, int i) {
    }
}
