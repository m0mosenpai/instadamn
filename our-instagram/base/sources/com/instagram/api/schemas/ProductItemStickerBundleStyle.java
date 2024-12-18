package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProductItemStickerBundleStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductItemStickerBundleStyle[] A03;
    public static final ProductItemStickerBundleStyle A04;
    public static final ProductItemStickerBundleStyle A05;
    public static final ProductItemStickerBundleStyle A06;
    public static final ProductItemStickerBundleStyle A07;
    public static final ProductItemStickerBundleStyle A08;
    public static final ProductItemStickerBundleStyle A09;
    public static final ProductItemStickerBundleStyle A0A;
    public static final ProductItemStickerBundleStyle A0B;
    public static final ProductItemStickerBundleStyle A0C;
    public static final ProductItemStickerBundleStyle A0D;
    public static final ProductItemStickerBundleStyle A0E;
    public static final ProductItemStickerBundleStyle A0F;
    public static final ProductItemStickerBundleStyle A0G;
    public static final ProductItemStickerBundleStyle A0H;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductItemStickerBundleStyle productItemStickerBundleStyle = new ProductItemStickerBundleStyle("UNRECOGNIZED", 0, "ProductItemStickerBundleStyle_unspecified");
        A0H = productItemStickerBundleStyle;
        ProductItemStickerBundleStyle productItemStickerBundleStyle2 = new ProductItemStickerBundleStyle("MULTI_PRODUCT_ITEM_TEXT_STICKER_BLACK_WHITE_ID", 1, "multi_product_item_text_sticker_black_white");
        A04 = productItemStickerBundleStyle2;
        ProductItemStickerBundleStyle productItemStickerBundleStyle3 = new ProductItemStickerBundleStyle("MULTI_PRODUCT_ITEM_TEXT_STICKER_MEDIA_PRIMARY_COLOR_ID", 2, "multi_product_item_text_sticker_media_primary_color");
        A05 = productItemStickerBundleStyle3;
        ProductItemStickerBundleStyle productItemStickerBundleStyle4 = new ProductItemStickerBundleStyle("MULTI_PRODUCT_ITEM_TEXT_STICKER_SUBTLE_ID", 3, "multi_product_item_text_sticker_subtle");
        A06 = productItemStickerBundleStyle4;
        ProductItemStickerBundleStyle productItemStickerBundleStyle5 = new ProductItemStickerBundleStyle("MULTI_PRODUCT_ITEM_TEXT_STICKER_VIBRANT_ID", 4, "multi_product_item_text_sticker_vibrant");
        A07 = productItemStickerBundleStyle5;
        ProductItemStickerBundleStyle productItemStickerBundleStyle6 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_DROPS_REMINDER_STICKER_ID", 5, "product_item_drops_reminder_sticker");
        A08 = productItemStickerBundleStyle6;
        ProductItemStickerBundleStyle productItemStickerBundleStyle7 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_DROPS_RESHARE_STICKER_ID", 6, "product_item_drops_reshare_sticker");
        A09 = productItemStickerBundleStyle7;
        ProductItemStickerBundleStyle productItemStickerBundleStyle8 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_LIST_CELL_STICKER_BLACK_WHITE_ID", 7, "product_item_list_cell_sticker_black_white");
        A0A = productItemStickerBundleStyle8;
        ProductItemStickerBundleStyle productItemStickerBundleStyle9 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_LIST_CELL_STICKER_SUBTLE_ID", 8, "product_item_list_cell_sticker_subtle");
        A0B = productItemStickerBundleStyle9;
        ProductItemStickerBundleStyle productItemStickerBundleStyle10 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_TEXT_STICKER_BLACK_WHITE_ID", 9, "product_item_text_sticker_black_white");
        A0C = productItemStickerBundleStyle10;
        ProductItemStickerBundleStyle productItemStickerBundleStyle11 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_TEXT_STICKER_MEDIA_PRIMARY_COLOR_ID", 10, "product_item_text_sticker_media_primary_color");
        A0D = productItemStickerBundleStyle11;
        ProductItemStickerBundleStyle productItemStickerBundleStyle12 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_TEXT_STICKER_SUBTLE_ID", 11, "product_item_text_sticker_subtle");
        A0E = productItemStickerBundleStyle12;
        ProductItemStickerBundleStyle productItemStickerBundleStyle13 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_TEXT_STICKER_VIBRANT_ID", 12, "product_item_text_sticker_vibrant");
        A0F = productItemStickerBundleStyle13;
        ProductItemStickerBundleStyle productItemStickerBundleStyle14 = new ProductItemStickerBundleStyle("PRODUCT_ITEM_TILE_STICKER_BLACK_WHITE_ID", 13, "product_item_tile_sticker_black_white");
        A0G = productItemStickerBundleStyle14;
        ProductItemStickerBundleStyle[] productItemStickerBundleStyleArr = {productItemStickerBundleStyle, productItemStickerBundleStyle2, productItemStickerBundleStyle3, productItemStickerBundleStyle4, productItemStickerBundleStyle5, productItemStickerBundleStyle6, productItemStickerBundleStyle7, productItemStickerBundleStyle8, productItemStickerBundleStyle9, productItemStickerBundleStyle10, productItemStickerBundleStyle11, productItemStickerBundleStyle12, productItemStickerBundleStyle13, productItemStickerBundleStyle14, new ProductItemStickerBundleStyle("PRODUCT_ITEM_VISUAL_STICKER_ID", 14, "product_item_visual_sticker")};
        A03 = productItemStickerBundleStyleArr;
        A02 = AbstractC12190kN.A00(productItemStickerBundleStyleArr);
        ProductItemStickerBundleStyle[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (ProductItemStickerBundleStyle productItemStickerBundleStyle15 : values) {
            linkedHashMap.put(productItemStickerBundleStyle15.A00, productItemStickerBundleStyle15);
        }
        A01 = linkedHashMap;
        CREATOR = new C41855Ig9(47);
    }

    public static ProductItemStickerBundleStyle valueOf(String str) {
        return (ProductItemStickerBundleStyle) Enum.valueOf(ProductItemStickerBundleStyle.class, str);
    }

    public static ProductItemStickerBundleStyle[] values() {
        return (ProductItemStickerBundleStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductItemStickerBundleStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
