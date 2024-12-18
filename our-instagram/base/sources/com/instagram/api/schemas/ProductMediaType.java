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
public final class ProductMediaType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductMediaType[] A03;
    public static final ProductMediaType A04;
    public static final ProductMediaType A05;
    public static final ProductMediaType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductMediaType productMediaType = new ProductMediaType("UNRECOGNIZED", 0, "ProductMediaType_unspecified");
        A06 = productMediaType;
        ProductMediaType productMediaType2 = new ProductMediaType("IG_MEDIA", 1, "ig_media");
        A04 = productMediaType2;
        ProductMediaType productMediaType3 = new ProductMediaType("PRODUCT_IMAGE", 2, "product_image");
        A05 = productMediaType3;
        ProductMediaType[] productMediaTypeArr = {productMediaType, productMediaType2, productMediaType3};
        A03 = productMediaTypeArr;
        A02 = AbstractC12190kN.A00(productMediaTypeArr);
        ProductMediaType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductMediaType productMediaType4 : values) {
            A18.put(productMediaType4.A00, productMediaType4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(48);
    }

    public static ProductMediaType valueOf(String str) {
        return (ProductMediaType) Enum.valueOf(ProductMediaType.class, str);
    }

    public static ProductMediaType[] values() {
        return (ProductMediaType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductMediaType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
