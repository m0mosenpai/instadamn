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
public final class ProductTileMetadataDestination implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductTileMetadataDestination[] A03;
    public static final ProductTileMetadataDestination A04;
    public static final ProductTileMetadataDestination A05;
    public static final ProductTileMetadataDestination A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductTileMetadataDestination productTileMetadataDestination = new ProductTileMetadataDestination("UNRECOGNIZED", 0, "ProductTileMetadataDestination_unspecified");
        A06 = productTileMetadataDestination;
        ProductTileMetadataDestination productTileMetadataDestination2 = new ProductTileMetadataDestination("MEDIA_CHAIN", 1, "MEDIA_CHAIN");
        A04 = productTileMetadataDestination2;
        ProductTileMetadataDestination productTileMetadataDestination3 = new ProductTileMetadataDestination("PRODUCT_DETAILS_PAGE", 2, "PRODUCT_DETAILS_PAGE");
        A05 = productTileMetadataDestination3;
        ProductTileMetadataDestination[] productTileMetadataDestinationArr = {productTileMetadataDestination, productTileMetadataDestination2, productTileMetadataDestination3};
        A03 = productTileMetadataDestinationArr;
        A02 = AbstractC12190kN.A00(productTileMetadataDestinationArr);
        ProductTileMetadataDestination[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductTileMetadataDestination productTileMetadataDestination4 : values) {
            A18.put(productTileMetadataDestination4.A00, productTileMetadataDestination4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(63);
    }

    public static ProductTileMetadataDestination valueOf(String str) {
        return (ProductTileMetadataDestination) Enum.valueOf(ProductTileMetadataDestination.class, str);
    }

    public static ProductTileMetadataDestination[] values() {
        return (ProductTileMetadataDestination[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductTileMetadataDestination(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
