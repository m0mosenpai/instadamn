package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39566Hdc {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39566Hdc[] A02;
    public static final EnumC39566Hdc A03;
    public static final EnumC39566Hdc A04;
    public static final EnumC39566Hdc A05;
    public static final EnumC39566Hdc A06;
    public final String A00;

    static {
        EnumC39566Hdc enumC39566Hdc = new EnumC39566Hdc("SECTION_TYPE_HEADER", 0, "product_list_header");
        A05 = enumC39566Hdc;
        EnumC39566Hdc enumC39566Hdc2 = new EnumC39566Hdc("SECTION_TYPE_ITEM", 1, "product_item_list_item");
        A06 = enumC39566Hdc2;
        EnumC39566Hdc enumC39566Hdc3 = new EnumC39566Hdc("SECTION_TYPE_GROUP", 2, "product_group_list_item");
        A04 = enumC39566Hdc3;
        EnumC39566Hdc enumC39566Hdc4 = new EnumC39566Hdc("SECTION_TYPE_COLLECTION", 3, "product_collection_list_item");
        A03 = enumC39566Hdc4;
        EnumC39566Hdc[] enumC39566HdcArr = {enumC39566Hdc, enumC39566Hdc2, enumC39566Hdc3, enumC39566Hdc4};
        A02 = enumC39566HdcArr;
        A01 = AbstractC12190kN.A00(enumC39566HdcArr);
    }

    public static EnumC39566Hdc valueOf(String str) {
        return (EnumC39566Hdc) Enum.valueOf(EnumC39566Hdc.class, str);
    }

    public static EnumC39566Hdc[] values() {
        return (EnumC39566Hdc[]) A02.clone();
    }

    public EnumC39566Hdc(String str, int i, String str2) {
        this.A00 = str2;
    }
}
