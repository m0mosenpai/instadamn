package com.instagram.model.shopping.productvariantvalue;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductVariantVisualStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductVariantVisualStyle[] A03;
    public static final ProductVariantVisualStyle A04;
    public static final ProductVariantVisualStyle A05;
    public static final ProductVariantVisualStyle A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductVariantVisualStyle productVariantVisualStyle = new ProductVariantVisualStyle("UNRECOGNIZED", 0, "ProductVariantVisualStyle_unspecified");
        A06 = productVariantVisualStyle;
        ProductVariantVisualStyle productVariantVisualStyle2 = new ProductVariantVisualStyle("PICKER", 1, "picker");
        A04 = productVariantVisualStyle2;
        ProductVariantVisualStyle productVariantVisualStyle3 = new ProductVariantVisualStyle("THUMBNAIL", 2, "thumbnail");
        A05 = productVariantVisualStyle3;
        ProductVariantVisualStyle[] productVariantVisualStyleArr = {productVariantVisualStyle, productVariantVisualStyle2, productVariantVisualStyle3};
        A03 = productVariantVisualStyleArr;
        A02 = AbstractC12190kN.A00(productVariantVisualStyleArr);
        ProductVariantVisualStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductVariantVisualStyle productVariantVisualStyle4 : values) {
            A18.put(productVariantVisualStyle4.A00, productVariantVisualStyle4);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(53);
    }

    public static ProductVariantVisualStyle valueOf(String str) {
        return (ProductVariantVisualStyle) Enum.valueOf(ProductVariantVisualStyle.class, str);
    }

    public static ProductVariantVisualStyle[] values() {
        return (ProductVariantVisualStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductVariantVisualStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
