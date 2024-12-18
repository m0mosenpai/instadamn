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
public final class ProductPivotsButtonActionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductPivotsButtonActionType[] A03;
    public static final ProductPivotsButtonActionType A04;
    public static final ProductPivotsButtonActionType A05;
    public static final ProductPivotsButtonActionType A06;
    public static final ProductPivotsButtonActionType A07;
    public static final ProductPivotsButtonActionType A08;
    public static final ProductPivotsButtonActionType A09;
    public static final ProductPivotsButtonActionType A0A;
    public static final ProductPivotsButtonActionType A0B;
    public static final ProductPivotsButtonActionType A0C;
    public static final ProductPivotsButtonActionType A0D;
    public static final ProductPivotsButtonActionType A0E;
    public static final ProductPivotsButtonActionType A0F;
    public static final ProductPivotsButtonActionType A0G;
    public static final ProductPivotsButtonActionType A0H;
    public static final ProductPivotsButtonActionType A0I;
    public static final ProductPivotsButtonActionType A0J;
    public static final ProductPivotsButtonActionType A0K;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductPivotsButtonActionType productPivotsButtonActionType = new ProductPivotsButtonActionType("UNRECOGNIZED", 0, "ProductPivotsButtonActionType_unspecified");
        A0J = productPivotsButtonActionType;
        ProductPivotsButtonActionType productPivotsButtonActionType2 = new ProductPivotsButtonActionType("CART_FROM_MERCHANT", 1, "bag_from_merchant");
        A04 = productPivotsButtonActionType2;
        ProductPivotsButtonActionType productPivotsButtonActionType3 = new ProductPivotsButtonActionType("CHECKOUT_RECONSIDERATION", 2, "checkout_reconsideration");
        A05 = productPivotsButtonActionType3;
        ProductPivotsButtonActionType productPivotsButtonActionType4 = new ProductPivotsButtonActionType("CTA", 3, "cta");
        A06 = productPivotsButtonActionType4;
        ProductPivotsButtonActionType productPivotsButtonActionType5 = new ProductPivotsButtonActionType("CTA_WITH_DISMISS", 4, "cta_with_dismiss");
        A07 = productPivotsButtonActionType5;
        ProductPivotsButtonActionType productPivotsButtonActionType6 = new ProductPivotsButtonActionType("DISMISS", 5, "dismiss");
        A08 = productPivotsButtonActionType6;
        ProductPivotsButtonActionType productPivotsButtonActionType7 = new ProductPivotsButtonActionType("DROPS_DESTINATION", 6, "drops_destination");
        A09 = productPivotsButtonActionType7;
        ProductPivotsButtonActionType productPivotsButtonActionType8 = new ProductPivotsButtonActionType("INCENTIVE_COLLECTION", 7, "incentive_details");
        A0A = productPivotsButtonActionType8;
        ProductPivotsButtonActionType productPivotsButtonActionType9 = new ProductPivotsButtonActionType("PRODUCTS_FROM_FOLLOWED_BRANDS", 8, "products_from_followed_brands");
        A0B = productPivotsButtonActionType9;
        ProductPivotsButtonActionType productPivotsButtonActionType10 = new ProductPivotsButtonActionType("PRODUCTS_FROM_LIKED_MEDIA", 9, "products_from_liked_media");
        A0C = productPivotsButtonActionType10;
        ProductPivotsButtonActionType productPivotsButtonActionType11 = new ProductPivotsButtonActionType("PRODUCTS_FROM_SAVED_MEDIA", 10, "products_from_saved_media");
        A0D = productPivotsButtonActionType11;
        ProductPivotsButtonActionType productPivotsButtonActionType12 = new ProductPivotsButtonActionType("PROFILE_SHOP_PRODUCT_COLLECTIONS_FEED", 11, "profile_shop_product_collections_feed");
        A0E = productPivotsButtonActionType12;
        ProductPivotsButtonActionType productPivotsButtonActionType13 = new ProductPivotsButtonActionType("RECENTLY_VIEWED_FROM_MERCHANT", 12, "recently_viewed_from_merchant");
        A0F = productPivotsButtonActionType13;
        ProductPivotsButtonActionType productPivotsButtonActionType14 = new ProductPivotsButtonActionType("SAVED", 13, "saved");
        A0G = productPivotsButtonActionType14;
        ProductPivotsButtonActionType productPivotsButtonActionType15 = new ProductPivotsButtonActionType("SAVED_FROM_MERCHANT", 14, "saved_from_merchant");
        A0H = productPivotsButtonActionType15;
        ProductPivotsButtonActionType productPivotsButtonActionType16 = new ProductPivotsButtonActionType("SAVED_FROM_MERCHANTS", 15, "saved_from_merchants");
        A0I = productPivotsButtonActionType16;
        ProductPivotsButtonActionType productPivotsButtonActionType17 = new ProductPivotsButtonActionType("VIEW_CHECKOUT_PRODUCT_FEED", 16, "view_checkout_product_feed");
        A0K = productPivotsButtonActionType17;
        ProductPivotsButtonActionType[] productPivotsButtonActionTypeArr = {productPivotsButtonActionType, productPivotsButtonActionType2, productPivotsButtonActionType3, productPivotsButtonActionType4, productPivotsButtonActionType5, productPivotsButtonActionType6, productPivotsButtonActionType7, productPivotsButtonActionType8, productPivotsButtonActionType9, productPivotsButtonActionType10, productPivotsButtonActionType11, productPivotsButtonActionType12, productPivotsButtonActionType13, productPivotsButtonActionType14, productPivotsButtonActionType15, productPivotsButtonActionType16, productPivotsButtonActionType17, new ProductPivotsButtonActionType("VIEW_SHOP", 17, "view_shop")};
        A03 = productPivotsButtonActionTypeArr;
        A02 = AbstractC12190kN.A00(productPivotsButtonActionTypeArr);
        ProductPivotsButtonActionType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (ProductPivotsButtonActionType productPivotsButtonActionType18 : values) {
            A18.put(productPivotsButtonActionType18.A00, productPivotsButtonActionType18);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(49);
    }

    public static ProductPivotsButtonActionType valueOf(String str) {
        return (ProductPivotsButtonActionType) Enum.valueOf(ProductPivotsButtonActionType.class, str);
    }

    public static ProductPivotsButtonActionType[] values() {
        return (ProductPivotsButtonActionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductPivotsButtonActionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
