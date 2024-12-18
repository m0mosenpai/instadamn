package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hds, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39582Hds {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39582Hds[] A02;
    public static final EnumC39582Hds A03;
    public static final EnumC39582Hds A04;
    public static final EnumC39582Hds A05;
    public static final EnumC39582Hds A06;
    public static final EnumC39582Hds A07;
    public static final EnumC39582Hds A08;
    public static final EnumC39582Hds A09;
    public static final EnumC39582Hds A0A;
    public final int A00;

    public static EnumC39582Hds valueOf(String str) {
        return (EnumC39582Hds) Enum.valueOf(EnumC39582Hds.class, str);
    }

    public static EnumC39582Hds[] values() {
        return (EnumC39582Hds[]) A02.clone();
    }

    static {
        EnumC39582Hds enumC39582Hds = new EnumC39582Hds("REPORT_ITEM", 0, 2131972388);
        A09 = enumC39582Hds;
        EnumC39582Hds enumC39582Hds2 = new EnumC39582Hds("NOT_INTERESTED", 1, 2131968678);
        A08 = enumC39582Hds2;
        EnumC39582Hds enumC39582Hds3 = new EnumC39582Hds("DEBUG_INFO", 2, 2131969984);
        A04 = enumC39582Hds3;
        EnumC39582Hds enumC39582Hds4 = new EnumC39582Hds("LEAVE_REVIEW", 3, 2131965076);
        A07 = enumC39582Hds4;
        EnumC39582Hds enumC39582Hds5 = new EnumC39582Hds("CHANGE_DEFAULT_PHOTO", 4, 2131955163);
        A03 = enumC39582Hds5;
        EnumC39582Hds enumC39582Hds6 = new EnumC39582Hds("EDIT_PRODUCT", 5, 2131961610);
        A06 = enumC39582Hds6;
        EnumC39582Hds enumC39582Hds7 = new EnumC39582Hds("DELETE_PRODUCT", 6, 2131957696);
        A05 = enumC39582Hds7;
        EnumC39582Hds enumC39582Hds8 = new EnumC39582Hds("SHOW_CHECKOUT_AWARENESS_INTERSTITIAL", 7, 2131974060);
        A0A = enumC39582Hds8;
        EnumC39582Hds[] enumC39582HdsArr = {enumC39582Hds, enumC39582Hds2, enumC39582Hds3, enumC39582Hds4, enumC39582Hds5, enumC39582Hds6, enumC39582Hds7, enumC39582Hds8};
        A02 = enumC39582HdsArr;
        A01 = AbstractC12190kN.A00(enumC39582HdsArr);
    }

    public EnumC39582Hds(String str, int i, int i2) {
        this.A00 = i2;
    }
}
