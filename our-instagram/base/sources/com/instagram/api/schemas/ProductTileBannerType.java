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
public final class ProductTileBannerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileBannerType[] A03;
    public static final ProductTileBannerType A04;
    public static final ProductTileBannerType A05;
    public static final ProductTileBannerType A06;
    public static final ProductTileBannerType A07;
    public static final ProductTileBannerType A08;
    public static final ProductTileBannerType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileBannerType productTileBannerType = new ProductTileBannerType("UNRECOGNIZED", 0, "ProductTileBannerType_unspecified");
        A09 = productTileBannerType;
        ProductTileBannerType productTileBannerType2 = new ProductTileBannerType("EXCLUSIVE", 1, "exclusive");
        A04 = productTileBannerType2;
        ProductTileBannerType productTileBannerType3 = new ProductTileBannerType("FREE_SHIPPING", 2, "free_shipping");
        A05 = productTileBannerType3;
        ProductTileBannerType productTileBannerType4 = new ProductTileBannerType("IN_CART", 3, "in_cart");
        A06 = productTileBannerType4;
        ProductTileBannerType productTileBannerType5 = new ProductTileBannerType("LOW_INVENTORY", 4, "low_inventory");
        A07 = productTileBannerType5;
        ProductTileBannerType productTileBannerType6 = new ProductTileBannerType("LOW_STOCK", 5, "low_stock");
        A08 = productTileBannerType6;
        ProductTileBannerType[] productTileBannerTypeArr = {productTileBannerType, productTileBannerType2, productTileBannerType3, productTileBannerType4, productTileBannerType5, productTileBannerType6, new ProductTileBannerType("ON_SALE", 6, "on_sale")};
        A03 = productTileBannerTypeArr;
        A02 = AbstractC12190kN.A00(productTileBannerTypeArr);
        ProductTileBannerType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTileBannerType productTileBannerType7 : values) {
            A18.put(productTileBannerType7.A00, productTileBannerType7);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(54);
    }

    public static ProductTileBannerType valueOf(String str) {
        return (ProductTileBannerType) Enum.valueOf(ProductTileBannerType.class, str);
    }

    public static ProductTileBannerType[] values() {
        return (ProductTileBannerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileBannerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
