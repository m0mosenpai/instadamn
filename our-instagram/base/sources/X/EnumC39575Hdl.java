package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39575Hdl {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39575Hdl[] A03;
    public static final EnumC39575Hdl A04;
    public static final EnumC39575Hdl A05;
    public static final EnumC39575Hdl A06;
    public static final EnumC39575Hdl A07;
    public static final EnumC39575Hdl A08;
    public final String A00;

    static {
        EnumC39575Hdl enumC39575Hdl = new EnumC39575Hdl("NUM_SELECTED_PRODUCTS", 0, "num_selected_products");
        A07 = enumC39575Hdl;
        EnumC39575Hdl enumC39575Hdl2 = new EnumC39575Hdl("NUM_SELECTED_COLLECTIONS", 1, "num_selected_collections");
        A06 = enumC39575Hdl2;
        EnumC39575Hdl enumC39575Hdl3 = new EnumC39575Hdl("DISABLE_DISCOUNTS_ON_PRODUCTS_SELECTION", 2, "disable_discounts_on_products_selection");
        A04 = enumC39575Hdl3;
        EnumC39575Hdl enumC39575Hdl4 = new EnumC39575Hdl("DISABLE_PRODUCTS_ON_AUTOTAG_DISCOUNT", 3, "disable_products_on_autotag_discount");
        A05 = enumC39575Hdl4;
        EnumC39575Hdl enumC39575Hdl5 = new EnumC39575Hdl("UNKNOWN", 4, "unknown");
        A08 = enumC39575Hdl5;
        EnumC39575Hdl[] enumC39575HdlArr = {enumC39575Hdl, enumC39575Hdl2, enumC39575Hdl3, enumC39575Hdl4, enumC39575Hdl5};
        A03 = enumC39575HdlArr;
        A02 = AbstractC12190kN.A00(enumC39575HdlArr);
        EnumC39575Hdl[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39575Hdl enumC39575Hdl6 : values) {
            A18.put(enumC39575Hdl6.A00, enumC39575Hdl6);
        }
        A01 = A18;
    }

    public static EnumC39575Hdl valueOf(String str) {
        return (EnumC39575Hdl) Enum.valueOf(EnumC39575Hdl.class, str);
    }

    public static EnumC39575Hdl[] values() {
        return (EnumC39575Hdl[]) A03.clone();
    }

    public EnumC39575Hdl(String str, int i, String str2) {
        this.A00 = str2;
    }
}
