package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductTileLabelType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileLabelType[] A03;
    public static final ProductTileLabelType A04;
    public static final ProductTileLabelType A05;
    public static final ProductTileLabelType A06;
    public static final ProductTileLabelType A07;
    public static final ProductTileLabelType A08;
    public static final ProductTileLabelType A09;
    public static final ProductTileLabelType A0A;
    public static final ProductTileLabelType A0B;
    public static final ProductTileLabelType A0C;
    public static final ProductTileLabelType A0D;
    public static final ProductTileLabelType A0E;
    public static final ProductTileLabelType A0F;
    public static final ProductTileLabelType A0G;
    public static final ProductTileLabelType A0H;
    public static final ProductTileLabelType A0I;
    public static final ProductTileLabelType A0J;
    public static final ProductTileLabelType A0K;
    public static final ProductTileLabelType A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileLabelType productTileLabelType = new ProductTileLabelType("UNRECOGNIZED", 0, "ProductTileLabelType_unspecified");
        A0J = productTileLabelType;
        ProductTileLabelType productTileLabelType2 = new ProductTileLabelType("ADD_TO_BAG", 1, "add_to_bag");
        A04 = productTileLabelType2;
        ProductTileLabelType productTileLabelType3 = new ProductTileLabelType("DROPS_LAUNCH_INFO", 2, "drops_launch_info");
        A05 = productTileLabelType3;
        ProductTileLabelType productTileLabelType4 = new ProductTileLabelType("FEATURED_PRODUCT_PERMISSION_STATUS", 3, "featured_product_permission_status");
        A06 = productTileLabelType4;
        ProductTileLabelType productTileLabelType5 = new ProductTileLabelType("FREE_SHIPPING", 4, "free_shipping");
        A07 = productTileLabelType5;
        ProductTileLabelType productTileLabelType6 = new ProductTileLabelType("IN_REVIEW", 5, "in_review");
        A08 = productTileLabelType6;
        ProductTileLabelType productTileLabelType7 = new ProductTileLabelType("LOW_STOCK", 6, "low_stock");
        A09 = productTileLabelType7;
        ProductTileLabelType productTileLabelType8 = new ProductTileLabelType("MERCHANT_NAME", 7, "merchant_name");
        A0A = productTileLabelType8;
        ProductTileLabelType productTileLabelType9 = new ProductTileLabelType("MERCHANT_NAME_AND_PRICE", 8, "merchant_name_and_price");
        A0B = productTileLabelType9;
        ProductTileLabelType productTileLabelType10 = new ProductTileLabelType("NOT_APPROVED", 9, "not_approved");
        A0C = productTileLabelType10;
        ProductTileLabelType productTileLabelType11 = new ProductTileLabelType("PER_UNIT_PRICE", 10, "per_unit_price");
        A0D = productTileLabelType11;
        ProductTileLabelType productTileLabelType12 = new ProductTileLabelType("PRICE", 11, "price");
        A0E = productTileLabelType12;
        ProductTileLabelType productTileLabelType13 = new ProductTileLabelType("PRODUCT_NAME", 12, "product_name");
        A0F = productTileLabelType13;
        ProductTileLabelType productTileLabelType14 = new ProductTileLabelType("PRODUCT_NAME_AND_PRICE", 13, "product_name_and_price");
        A0G = productTileLabelType14;
        ProductTileLabelType productTileLabelType15 = new ProductTileLabelType("RATING", 14, "rating");
        A0H = productTileLabelType15;
        ProductTileLabelType productTileLabelType16 = new ProductTileLabelType("SEPARATOR", 15, "separator");
        A0I = productTileLabelType16;
        ProductTileLabelType productTileLabelType17 = new ProductTileLabelType("VIEW_ON_WEBSITE", 16, "view_on_website");
        A0K = productTileLabelType17;
        ProductTileLabelType productTileLabelType18 = new ProductTileLabelType("VIEW_SIMILAR", 17, "view_similar");
        A0L = productTileLabelType18;
        ProductTileLabelType[] productTileLabelTypeArr = {productTileLabelType, productTileLabelType2, productTileLabelType3, productTileLabelType4, productTileLabelType5, productTileLabelType6, productTileLabelType7, productTileLabelType8, productTileLabelType9, productTileLabelType10, productTileLabelType11, productTileLabelType12, productTileLabelType13, productTileLabelType14, productTileLabelType15, productTileLabelType16, productTileLabelType17, productTileLabelType18, new ProductTileLabelType("VIEWED_TIMESTAMP", 18, "viewed_timestamp")};
        A03 = productTileLabelTypeArr;
        A02 = AbstractC12190kN.A00(productTileLabelTypeArr);
        ProductTileLabelType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (ProductTileLabelType productTileLabelType19 : values) {
            A18.put(productTileLabelType19.A00, productTileLabelType19);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(60);
    }

    public static ProductTileLabelType valueOf(String str) {
        return (ProductTileLabelType) Enum.valueOf(ProductTileLabelType.class, str);
    }

    public static ProductTileLabelType[] values() {
        return (ProductTileLabelType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileLabelType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
