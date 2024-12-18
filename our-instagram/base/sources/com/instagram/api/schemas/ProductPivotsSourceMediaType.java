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
public final class ProductPivotsSourceMediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductPivotsSourceMediaType[] A03;
    public static final ProductPivotsSourceMediaType A04;
    public static final ProductPivotsSourceMediaType A05;
    public static final ProductPivotsSourceMediaType A06;
    public static final ProductPivotsSourceMediaType A07;
    public static final ProductPivotsSourceMediaType A08;
    public static final ProductPivotsSourceMediaType A09;
    public static final ProductPivotsSourceMediaType A0A;
    public static final ProductPivotsSourceMediaType A0B;
    public static final ProductPivotsSourceMediaType A0C;
    public static final ProductPivotsSourceMediaType A0D;
    public static final ProductPivotsSourceMediaType A0E;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductPivotsSourceMediaType productPivotsSourceMediaType = new ProductPivotsSourceMediaType("UNRECOGNIZED", 0, "ProductPivotsSourceMediaType_unspecified");
        A0E = productPivotsSourceMediaType;
        ProductPivotsSourceMediaType productPivotsSourceMediaType2 = new ProductPivotsSourceMediaType("FEATURED_PRODUCTS_MEDIA_FEED", 1, "featured_products_media_feed");
        A04 = productPivotsSourceMediaType2;
        ProductPivotsSourceMediaType productPivotsSourceMediaType3 = new ProductPivotsSourceMediaType("FEATURED_PRODUCTS_MERCHANT_MANAGEMENT", 2, "featured_products_merchant_management");
        A05 = productPivotsSourceMediaType3;
        ProductPivotsSourceMediaType productPivotsSourceMediaType4 = new ProductPivotsSourceMediaType("FEATURED_PRODUCTS_PDP", 3, "featured_products_pdp");
        A06 = productPivotsSourceMediaType4;
        ProductPivotsSourceMediaType productPivotsSourceMediaType5 = new ProductPivotsSourceMediaType("FEATURED_PRODUCTS_STOREFRONT", 4, "featured_products_storefront");
        A07 = productPivotsSourceMediaType5;
        ProductPivotsSourceMediaType productPivotsSourceMediaType6 = new ProductPivotsSourceMediaType("INTEREST_ACCOUNT_POST_WITH_NON_CHECKOUT_SHOP", 5, "interest_account_post_with_non_checkout_shop");
        A09 = productPivotsSourceMediaType6;
        ProductPivotsSourceMediaType productPivotsSourceMediaType7 = new ProductPivotsSourceMediaType("INTEREST_ACCOUNT_POST_WITH_MENTION", 6, "interest_account_post_with_shopping_account_mention");
        A08 = productPivotsSourceMediaType7;
        ProductPivotsSourceMediaType productPivotsSourceMediaType8 = new ProductPivotsSourceMediaType("INTEREST_ACCOUNT_POST_WITH_TAG", 7, "interest_account_post_with_shopping_account_tag");
        A0A = productPivotsSourceMediaType8;
        ProductPivotsSourceMediaType productPivotsSourceMediaType9 = new ProductPivotsSourceMediaType("NON_SHOPPABLE_POST_FROM_NON_CHECKOUT_BUSINESS", 8, "non_shoppable_post_from_non_checkout_shopping_account");
        A0C = productPivotsSourceMediaType9;
        ProductPivotsSourceMediaType productPivotsSourceMediaType10 = new ProductPivotsSourceMediaType("NON_SHOPPABLE_POST_FROM_BUSINESS", 9, "non_shoppable_post_from_shopping_account");
        A0B = productPivotsSourceMediaType10;
        ProductPivotsSourceMediaType productPivotsSourceMediaType11 = new ProductPivotsSourceMediaType("SHOPPABLE_POST_FROM_CREATOR", 10, "shoppable_post_from_creator");
        A0D = productPivotsSourceMediaType11;
        ProductPivotsSourceMediaType[] productPivotsSourceMediaTypeArr = {productPivotsSourceMediaType, productPivotsSourceMediaType2, productPivotsSourceMediaType3, productPivotsSourceMediaType4, productPivotsSourceMediaType5, productPivotsSourceMediaType6, productPivotsSourceMediaType7, productPivotsSourceMediaType8, productPivotsSourceMediaType9, productPivotsSourceMediaType10, productPivotsSourceMediaType11, new ProductPivotsSourceMediaType("SHOPPABLE_POST_FROM_BUSINESS", 11, "shoppable_post_from_shopping_account")};
        A03 = productPivotsSourceMediaTypeArr;
        A02 = AbstractC12190kN.A00(productPivotsSourceMediaTypeArr);
        ProductPivotsSourceMediaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductPivotsSourceMediaType productPivotsSourceMediaType12 : values) {
            A18.put(productPivotsSourceMediaType12.A00, productPivotsSourceMediaType12);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(51);
    }

    public static ProductPivotsSourceMediaType valueOf(String str) {
        return (ProductPivotsSourceMediaType) Enum.valueOf(ProductPivotsSourceMediaType.class, str);
    }

    public static ProductPivotsSourceMediaType[] values() {
        return (ProductPivotsSourceMediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductPivotsSourceMediaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
