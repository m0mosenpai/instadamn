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
public final class ProductCollectionV2Type implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductCollectionV2Type[] A03;
    public static final ProductCollectionV2Type A04;
    public static final ProductCollectionV2Type A05;
    public static final ProductCollectionV2Type A06;
    public static final ProductCollectionV2Type A07;
    public static final ProductCollectionV2Type A08;
    public static final ProductCollectionV2Type A09;
    public static final ProductCollectionV2Type A0A;
    public static final ProductCollectionV2Type A0B;
    public static final ProductCollectionV2Type A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductCollectionV2Type productCollectionV2Type = new ProductCollectionV2Type("UNRECOGNIZED", 0, "ProductCollectionV2Type_unspecified");
        A0C = productCollectionV2Type;
        ProductCollectionV2Type productCollectionV2Type2 = new ProductCollectionV2Type("AT_SHOP", 1, "at_shop");
        A04 = productCollectionV2Type2;
        ProductCollectionV2Type productCollectionV2Type3 = new ProductCollectionV2Type("DISCOUNT", 2, "discount");
        A05 = productCollectionV2Type3;
        ProductCollectionV2Type productCollectionV2Type4 = new ProductCollectionV2Type("DROP", 3, "drop");
        A06 = productCollectionV2Type4;
        ProductCollectionV2Type productCollectionV2Type5 = new ProductCollectionV2Type("DROP_V2", 4, "drop_v2");
        A07 = productCollectionV2Type5;
        ProductCollectionV2Type productCollectionV2Type6 = new ProductCollectionV2Type("MOCK_AT_SHOP", 5, "mock_at_shop");
        A08 = productCollectionV2Type6;
        ProductCollectionV2Type productCollectionV2Type7 = new ProductCollectionV2Type("SALE", 6, "sale");
        A09 = productCollectionV2Type7;
        ProductCollectionV2Type productCollectionV2Type8 = new ProductCollectionV2Type("SELLER_CURATED", 7, "seller_curated");
        A0A = productCollectionV2Type8;
        ProductCollectionV2Type productCollectionV2Type9 = new ProductCollectionV2Type("SELLER_CURATED_V2", 8, "seller_curated_v2");
        A0B = productCollectionV2Type9;
        ProductCollectionV2Type[] productCollectionV2TypeArr = {productCollectionV2Type, productCollectionV2Type2, productCollectionV2Type3, productCollectionV2Type4, productCollectionV2Type5, productCollectionV2Type6, productCollectionV2Type7, productCollectionV2Type8, productCollectionV2Type9, new ProductCollectionV2Type("UNKNOWN", 9, "unknown")};
        A03 = productCollectionV2TypeArr;
        A02 = AbstractC12190kN.A00(productCollectionV2TypeArr);
        ProductCollectionV2Type[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductCollectionV2Type productCollectionV2Type10 : values) {
            A18.put(productCollectionV2Type10.A00, productCollectionV2Type10);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(43);
    }

    public static ProductCollectionV2Type valueOf(String str) {
        return (ProductCollectionV2Type) Enum.valueOf(ProductCollectionV2Type.class, str);
    }

    public static ProductCollectionV2Type[] values() {
        return (ProductCollectionV2Type[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductCollectionV2Type(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
