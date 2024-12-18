package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductCardSubtitleType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductCardSubtitleType[] A03;
    public static final ProductCardSubtitleType A04;
    public static final ProductCardSubtitleType A05;
    public static final ProductCardSubtitleType A06;
    public static final ProductCardSubtitleType A07;
    public static final ProductCardSubtitleType A08;
    public static final ProductCardSubtitleType A09;
    public static final ProductCardSubtitleType A0A;
    public static final ProductCardSubtitleType A0B;
    public static final ProductCardSubtitleType A0C;
    public static final ProductCardSubtitleType A0D;
    public static final ProductCardSubtitleType A0E;
    public static final ProductCardSubtitleType A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductCardSubtitleType productCardSubtitleType = new ProductCardSubtitleType("UNRECOGNIZED", 0, "ProductCardSubtitleType_unspecified");
        A0F = productCardSubtitleType;
        ProductCardSubtitleType productCardSubtitleType2 = new ProductCardSubtitleType("IN_REVIEW", 1, "in_review");
        A04 = productCardSubtitleType2;
        ProductCardSubtitleType productCardSubtitleType3 = new ProductCardSubtitleType("MERCHANT_NAME", 2, "merchant_name");
        A05 = productCardSubtitleType3;
        ProductCardSubtitleType productCardSubtitleType4 = new ProductCardSubtitleType("MERCHANT_NAME_AND_PRICE", 3, "merchant_name_and_price");
        A06 = productCardSubtitleType4;
        ProductCardSubtitleType productCardSubtitleType5 = new ProductCardSubtitleType("MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING", 4, "merchant_name_and_price_no_free_shipping");
        A07 = productCardSubtitleType5;
        ProductCardSubtitleType productCardSubtitleType6 = new ProductCardSubtitleType("MERCHANT_NAME_AS_TEXT_AND_PRICE", 5, "merchant_name_as_text_and_price");
        A08 = productCardSubtitleType6;
        ProductCardSubtitleType productCardSubtitleType7 = new ProductCardSubtitleType("NOT_APPROVED", 6, "not_approved");
        A09 = productCardSubtitleType7;
        ProductCardSubtitleType productCardSubtitleType8 = new ProductCardSubtitleType("ONE_LINE_PRODUCT_NAME_WITH_MERCHANT_NAME_AND_PRICE_NO_FREE_SHIPPING", 7, "one_line_product_with_merchant_name_and_price_no_free_shipping");
        A0A = productCardSubtitleType8;
        ProductCardSubtitleType productCardSubtitleType9 = new ProductCardSubtitleType("PRICE", 8, "price");
        A0B = productCardSubtitleType9;
        ProductCardSubtitleType productCardSubtitleType10 = new ProductCardSubtitleType("PRICE_WITH_MERCHANT_NO_OVERLAY", 9, "price_with_merchant_no_overlay");
        A0C = productCardSubtitleType10;
        ProductCardSubtitleType productCardSubtitleType11 = new ProductCardSubtitleType("PRICE_WITH_MERCHANT_OVERLAY", 10, "price_with_merchant_overlay");
        A0D = productCardSubtitleType11;
        ProductCardSubtitleType productCardSubtitleType12 = new ProductCardSubtitleType("PRICE_WITH_SOLD_OUT", 11, "price_with_sold_out");
        A0E = productCardSubtitleType12;
        ProductCardSubtitleType[] productCardSubtitleTypeArr = {productCardSubtitleType, productCardSubtitleType2, productCardSubtitleType3, productCardSubtitleType4, productCardSubtitleType5, productCardSubtitleType6, productCardSubtitleType7, productCardSubtitleType8, productCardSubtitleType9, productCardSubtitleType10, productCardSubtitleType11, productCardSubtitleType12};
        A03 = productCardSubtitleTypeArr;
        A02 = AbstractC12190kN.A00(productCardSubtitleTypeArr);
        ProductCardSubtitleType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductCardSubtitleType productCardSubtitleType13 : values) {
            A18.put(productCardSubtitleType13.A00, productCardSubtitleType13);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(42);
    }

    public static ProductCardSubtitleType valueOf(String str) {
        return (ProductCardSubtitleType) Enum.valueOf(ProductCardSubtitleType.class, str);
    }

    public static ProductCardSubtitleType[] values() {
        return (ProductCardSubtitleType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductCardSubtitleType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
